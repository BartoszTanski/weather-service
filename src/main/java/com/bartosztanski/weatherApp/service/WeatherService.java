package com.bartosztanski.weatherApp.service;

import org.springframework.stereotype.Service;

import com.bartosztanski.weatherApp.error.LocationNotFoundExcetpion;
import com.bartosztanski.weatherApp.error.WeatherApiNotAvailable;
import com.bartosztanski.weatherApp.model.WeatherResponse;
@Service
public interface WeatherService {
	public WeatherResponse getWeather(Long locationId) throws LocationNotFoundExcetpion,WeatherApiNotAvailable;
}
