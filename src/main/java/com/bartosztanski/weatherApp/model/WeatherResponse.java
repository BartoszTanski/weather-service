package com.bartosztanski.weatherApp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WeatherResponse {
	private Location location;
	private HourlyData hourlyData;
	private DailyData dailyData;
}
