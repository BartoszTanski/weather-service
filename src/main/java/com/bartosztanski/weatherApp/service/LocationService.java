package com.bartosztanski.weatherApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bartosztanski.weatherApp.error.LocationNotFoundExcetpion;
import com.bartosztanski.weatherApp.model.Location;
@Service
public interface LocationService {
	public Location getById(Long locationId) throws LocationNotFoundExcetpion;
	public Location addLocation(Location location);
	public List<Location> getAllLocations();
}
