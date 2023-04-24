package com.bartosztanski.weatherApp.error;

public class LocationNotFoundExcetpion extends java.lang.Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6976124568118905588L;
	
	public LocationNotFoundExcetpion() {
		super();
	}
	
	public LocationNotFoundExcetpion(String message) {
		super(message);
	}
	
	public LocationNotFoundExcetpion(String message, Throwable cause) {
		super(message, cause);
	}
	
	public LocationNotFoundExcetpion(Throwable cause) {
		super(cause);
	}
	
	public LocationNotFoundExcetpion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
