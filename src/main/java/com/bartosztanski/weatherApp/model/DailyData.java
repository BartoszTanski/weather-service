package com.bartosztanski.weatherApp.model;

import java.util.ArrayList;
import java.util.Date;

public record DailyData(
     ArrayList<String> time,
     ArrayList<Integer> weathercode,
     ArrayList<Date> sunrise,
     ArrayList<Date> sunset,
     ArrayList<Double> precipitation_sum,
     ArrayList<Double> windspeed_10m_max) {}
