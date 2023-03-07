package com.bartoszTanski.weatherservice.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bartoszTanski.weatherservice.model.BestCondition;
import com.bartoszTanski.weatherservice.services.WeatherService;


@RestController
@RequestMapping("/api/v1/")
public class WeatherController {
	
	@Autowired
	private final WeatherService weatherService;
	
	public WeatherController(WeatherService weatherService) {
		this.weatherService=weatherService;
	}
	
	//Returns city and weather with the best weather conditions for surfing on given day
	//if weather in any city doesn't fulfill minimum conditions returns null
	@GetMapping("/weather/{day}")
	public ResponseEntity<BestCondition> getWeather(@PathVariable("day")LocalDate day) {
		BestCondition con = null;
		con=weatherService.getBestLocalization(day);
	  return ResponseEntity.ok(con);
	}
	
}
