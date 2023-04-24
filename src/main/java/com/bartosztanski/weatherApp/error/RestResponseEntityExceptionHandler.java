package com.bartosztanski.weatherApp.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.bartosztanski.weatherApp.model.ErrorMessage;

@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(LocationNotFoundExcetpion.class)
	public ResponseEntity<ErrorMessage> postNotPoundException(LocationNotFoundExcetpion locationNotFoundExcetpion, 
																					WebRequest webRequest) {
		ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND,locationNotFoundExcetpion.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
	}
	
	@ExceptionHandler(WeatherApiNotAvailable.class)
	public ResponseEntity<ErrorMessage> postNotPoundException(WeatherApiNotAvailable weatherApiNotAvailable, 
																					WebRequest webRequest) {
		ErrorMessage message = new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR,weatherApiNotAvailable.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
	}
}
