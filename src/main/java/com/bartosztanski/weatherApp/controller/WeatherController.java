package com.bartosztanski.weatherApp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bartosztanski.weatherApp.model.WeatherResponse;
import com.bartosztanski.weatherApp.service.WeatherService;

@RestController
@CrossOrigin(origins = {"PAGE_URL","http://localhost:3000"})
@RequestMapping("/api/v1/")
public class WeatherController {
	
	WeatherService weatherService;
	
	public WeatherController(WeatherService weatherService) {
		this.weatherService = weatherService;
	}
	
	@GetMapping("/weather")
	public ResponseEntity<WeatherResponse> getWeather(@RequestParam("locationId") String locationId) throws Exception {
		WeatherResponse weatherResponse = weatherService.getWeather(locationId);
		return ResponseEntity.ok(weatherResponse);
	}
}
