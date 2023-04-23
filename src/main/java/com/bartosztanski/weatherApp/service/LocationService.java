package com.bartosztanski.weatherApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bartosztanski.weatherApp.model.Location;
@Service
public interface LocationService {
	public Location getById(String locationId) throws Exception;
	public Location addLocation(Location location);
	public List<Location> getAllLocations();
}
