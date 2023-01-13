package com.retotecnico.api.dos.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class ApiUnprocesableEntity extends Exception {

	public ApiUnprocesableEntity(String message) {
		super(message);
	}

}
