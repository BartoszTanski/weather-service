package com.bartosztanski.weatherApp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bartosztanski.weatherApp.model.Location;
import com.bartosztanski.weatherApp.model.WeatherData;
@Service
public class FetchDataServiceImpl implements FetchDataService{
	
	public WeatherData getData(Location location) throws Exception {
		 	
		String uri = "https://api.open-meteo.com/v1/forecast?latitude="+
				location.getLatitude()+"&longitude="+location.getLongitude()+"&hourly=temperature_2m,apparent_temperature,precipitation,rain,"
						+ "showers,snowfall,surface_pressure,cloudcover,windspeed_10m&daily=weathercode,"
						+ "sunrise,sunset,precipitation_sum,windspeed_10m_max&forecast_days=14&timezone="
						+ location.getTimeZone();
		
		RestTemplate restTemplate = new RestTemplate();
		WeatherData weatherData = restTemplate.getForObject(uri, WeatherData.class);
		return weatherData;
	}
}
