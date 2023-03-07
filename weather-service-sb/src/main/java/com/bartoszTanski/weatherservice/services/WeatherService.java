package com.bartoszTanski.weatherservice.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bartoszTanski.weatherservice.model.BestCondition;
import com.bartoszTanski.weatherservice.model.Cities;
import com.bartoszTanski.weatherservice.model.Condition;
import com.bartoszTanski.weatherservice.model.Location;

@Service
public interface WeatherService {
	
	Location getWeather(String city);
	Location getWeather(String city,String country);
	BestCondition getBestLocalization(LocalDate day);
	List<Condition> getConditions(Cities cities, LocalDate day);
	
}
