package com.bartosztanski.weatherApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bartosztanski.weatherApp.model.Location;
import com.bartosztanski.weatherApp.repository.LocationsRepository;
@Service
public class LocationServiceImpl implements LocationService{

	LocationsRepository locationsRepository;
	
	public LocationServiceImpl(LocationsRepository locationsRepository) {
		this.locationsRepository = locationsRepository;
	}
	
	@Override
	public Location getById(String locationId) throws Exception {
		Optional<Location> location = locationsRepository.findById(locationId); 
		if(location==null) throw new Exception("No such location in DB");
		return location.get();
	}

	@Override
	public Location addLocation(Location location) {
		Location savedLocation = locationsRepository.save(location);
		return savedLocation;
	}

	@Override
	public List<Location> getAllLocations() {
		List<Location> locations = locationsRepository.findAll();
		return locations;
	}
	
}
