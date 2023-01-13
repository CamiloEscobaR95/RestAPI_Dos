package com.retotecnico.api.dos.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class ApiUnautorized extends Exception {
	
	public ApiUnautorized(String message) {
		super(message);
	}

}
