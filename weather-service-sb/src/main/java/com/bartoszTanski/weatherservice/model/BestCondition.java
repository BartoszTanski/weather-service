package com.bartoszTanski.weatherservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BestCondition {
	private String locationName;
	private String country;
	private double temperature;
	private double windSpeed;
}
