package com.bartosztanski.weatherApp.service;

import org.springframework.stereotype.Service;

import com.bartosztanski.weatherApp.model.Location;
import com.bartosztanski.weatherApp.model.WeatherData;
import com.bartosztanski.weatherApp.model.WeatherResponse;
@Service
public class WeatherServiceImpl implements WeatherService {

	FetchDataService fetchDataService;
	private LocationService locationService;
	
	public WeatherServiceImpl(LocationService locationService, FetchDataService fetchDataService) {
		this.fetchDataService = fetchDataService;
		this.locationService = locationService;
	}
	
	@Override
	public WeatherResponse getWeather(String locationId) throws Exception {
		Location location = locationService.getById(locationId);
		WeatherData weatherData = fetchDataService.getData(location);
		WeatherResponse weatherResponse = WeatherResponse.builder()
				.location(location)
				.hourlyData(weatherData.hourly())
				.dailyData(weatherData.daily())
				.build();
		return weatherResponse;
	}
	
}
