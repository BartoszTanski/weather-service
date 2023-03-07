package com.bartoszTanski.weatherservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Condition {
	private String locationName;
	private String country;
	private double temperature;
	private double windSpeed;
	private double v;
	
	public Condition(String locationName,String country,double temperature,double windSpeed) {
		this.locationName=locationName;
		this.country=country;
		this.temperature=temperature;
		this.windSpeed=windSpeed;
		v=3*windSpeed+temperature;
	}
}