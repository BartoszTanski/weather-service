package com.bartoszTanski.weatherservice.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
public class Cities  {

	private List<String>cities=new ArrayList<String>();
	
	public void add(String city) {
		this.cities.add(city);
	}
	public void remove(String city) {
		this.cities.remove(city);
	}
	public List<String> get() {
		return this.cities;
	}
	public void defaultCities() {
		this.add("Jastarnia");
		this.add("Bridgetown");
		this.add("Fortaleza");
		this.add("Pissouri");
		this.add("Le Morne");
	}
	public Stream<String> stream() {
		return this.cities.stream();
	}
	
}
