package com.bartosztanski.weatherApp.service;

import org.springframework.stereotype.Service;

import com.bartosztanski.weatherApp.model.Location;
import com.bartosztanski.weatherApp.model.WeatherData;
@Service
public interface FetchDataService {
	public WeatherData getData(Location location) throws Exception;
}
