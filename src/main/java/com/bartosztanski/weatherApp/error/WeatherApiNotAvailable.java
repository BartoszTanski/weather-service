package com.bartosztanski.weatherApp.error;

import org.springframework.web.client.RestClientException;

public class WeatherApiNotAvailable extends RestClientException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1450765983149915157L;

	public WeatherApiNotAvailable(String message) {
		super(message);
	}
	
	public WeatherApiNotAvailable(String message, Throwable cause) {
		super(message, cause);
	}
}
