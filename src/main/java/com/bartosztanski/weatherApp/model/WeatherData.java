package com.bartosztanski.weatherApp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)//indicate that any properties not bound in this type should be ignored.
public record WeatherData(
	    double latitude,
	    double longitude,
	    int utc_offset_seconds,
	    String timezone,
	    String timezone_abbreviation,
	    double elevation,
	    HourlyData hourly,
	    DailyData daily) {}
