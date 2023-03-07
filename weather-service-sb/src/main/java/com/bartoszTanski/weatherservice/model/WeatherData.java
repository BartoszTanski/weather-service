package com.bartoszTanski.weatherservice.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)//indicate that any properties not bound in this type should be ignored.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherData {
	public double app_max_temp;
    public double app_min_temp;
    public int clouds;
    public int clouds_hi;
    public int clouds_low;
    public int clouds_mid;
    public LocalDate datetime;
    public double dewpt;
    public double high_temp;
    public double low_temp;
    public double max_dhi;
    public double max_temp;
    public double min_temp;
    public double moon_phase;
    public double moon_phase_lunation;
    public int moonrise_ts;
    public int moonset_ts;
    public double ozone;
    public int pop;
    public double precip;
    public double pres;
    public int rh;
    public double slp;
    public int snow;
    public int snow_depth;
    public int sunrise_ts;
    public int sunset_ts;
    public double temp;
    public int ts;
    public double uv;
    public LocalDate valid_date;
    public double vis;
    public Weather weather;
    public String wind_cdir;
    public String wind_cdir_full;
    public int wind_dir;
    public double wind_gust_spd;
    public double wind_spd;
}
