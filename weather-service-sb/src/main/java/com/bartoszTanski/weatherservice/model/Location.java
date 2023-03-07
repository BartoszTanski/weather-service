package com.bartoszTanski.weatherservice.model;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    public String city_name;
    public String country_code;
    public ArrayList<WeatherData> data;
    public double lat;
    public double lon;
    public String state_code;
    public String timezone;
}
