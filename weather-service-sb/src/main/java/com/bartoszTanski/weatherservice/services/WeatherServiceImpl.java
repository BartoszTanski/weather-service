package com.bartoszTanski.weatherservice.services;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.sound.midi.SysexMessage;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bartoszTanski.weatherservice.model.BestCondition;
import com.bartoszTanski.weatherservice.model.Cities;
import com.bartoszTanski.weatherservice.model.Condition;
import com.bartoszTanski.weatherservice.model.Location;


@Service
public class WeatherServiceImpl implements WeatherService{
	
	private static String API_KEY="8b0f869b29384c35a50541e6e7e5fdad"; //master key to Weatherbit.io API
	private static String baseUri="https://api.weatherbit.io/v2.0/forecast/daily?";
	private static String range = "16"; //weather forecast range
	
	//Returns weather data from web API based on given city name
	@Override
	public Location getWeather(String city) { 
		String uri = baseUri+"city="+city+"&key="+API_KEY+"&days="+range;
		RestTemplate restTemplate = new RestTemplate();
		Location location = restTemplate.getForObject(uri, Location.class);
		return location;
	}
	
	//Returns weather data from web API based on given city name and country
	@Override
	public Location getWeather(String city,String country) {

		String uri = baseUri+"city="+city+"&"+country+"&key="+API_KEY+"&days="+range;
		RestTemplate restTemplate = new RestTemplate();
		Location location = restTemplate.getForObject(uri, Location.class);
		return location;
	}
	
	//Returns localization data and basic weather conditions list for given cities and day
	@Override
	public List<Condition> getConditions(Cities cities, LocalDate day) {
		
		List<Location> locations=cities.stream().map(city->getWeather(city)).collect(Collectors.toList());
		List<Condition> conditions = locations.stream()
				.map(location->new Condition(location.getCity_name(),
											  location.getCountry_code(),
											  location.getData().stream().filter(data-> data.valid_date.equals(day))
											  .map(c->c.temp).findAny().orElse(10.5),
											  location.getData().stream().filter(data-> data.valid_date.equals(day))
											  .map(c->c.wind_spd).findAny().orElse(10.8)
											  )			  
					).collect(Collectors.toList());
		
		return conditions;
	}

	//Returns best localization and basic weather conditions there. Best localization is defined by criteria:
	//Temperature is between 5;35 (degrees C) and windSpeed is between 5:18 (m/s)
	//Has the biggest V value defined by: V = windSpeed * 3 + temperature.
	@Override
	public BestCondition getBestLocalization(LocalDate day) {
		Cities cities = new Cities();
		cities.defaultCities();
		List<Condition>list = getConditions(cities, day);
		Condition cond=list.stream()
				.filter(con->con.getTemperature()>5.0&&con.getTemperature()<35.0&&con.getWindSpeed()>5.0&&con.getWindSpeed()<18.0)
				.max(Comparator.comparing(Condition::getV)).orElse(null);
		if(cond==null) return null;
		BestCondition bestCondition = new BestCondition(cond.getLocationName(),cond.getCountry(),cond.getTemperature(),cond.getWindSpeed());
		return bestCondition;
	}

}
