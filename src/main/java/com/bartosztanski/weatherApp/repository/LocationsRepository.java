package com.bartosztanski.weatherApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bartosztanski.weatherApp.model.Location;

public interface LocationsRepository extends JpaRepository<Location, String>{

}
