package com.bartosztanski.weatherApp.service;

import org.springframework.stereotype.Service;

import com.bartosztanski.weatherApp.model.WeatherResponse;
@Service
public interface WeatherService {
	public WeatherResponse getWeather(String locationId) throws Exception;
}
