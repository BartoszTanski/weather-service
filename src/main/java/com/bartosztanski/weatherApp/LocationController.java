package com.bartosztanski.weatherApp;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bartosztanski.weatherApp.model.Location;
import com.bartosztanski.weatherApp.service.LocationService;

@RestController
@CrossOrigin(origins = {"PAGE_URL","http://localhost:3000"})
@RequestMapping("/api/v1/")
public class LocationController {
	
	LocationService locationService;
	
	public LocationController(LocationService locationService) {
		this.locationService = locationService;
	}
	
	@PostMapping("/locations")
	public ResponseEntity<Location> getWeather(@RequestParam("name") String name,
			@RequestParam("country") String country,
			@RequestParam("latitude") double latitude,
			@RequestParam("longitude") double longitude,
			@RequestParam("timeZone") Optional<String> timeZone) {
		
		Location location = Location.builder()
				.name(name)
				.latitude(latitude)
				.longitude(longitude)
				.countryCode(country)
				.timeZone(timeZone.orElse("auto"))
				.build();
		location = locationService.addLocation(location);
		return ResponseEntity.ok(location);
	}
	
	@GetMapping("/locations")
	public ResponseEntity<List<Location>> getAllLocations() {
		List<Location> locations = locationService.getAllLocations();
		return ResponseEntity.ok(locations);
	}
}
