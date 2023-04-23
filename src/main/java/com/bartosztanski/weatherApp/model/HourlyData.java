package com.bartosztanski.weatherApp.model;

import java.util.ArrayList;
import java.util.Date;

public record HourlyData(
		ArrayList<Date> time,
	    ArrayList<Double> temperature_2m,
	    ArrayList<Double> apparent_temperature,
	    ArrayList<Double> precipitation,
	    ArrayList<Double> rain,
	    ArrayList<Double> showers,
	    ArrayList<Double> snowfall,
	    ArrayList<Double> surface_pressure,
	    ArrayList<Integer> cloudcover,
	    ArrayList<Double> windspeed_10m) {}
