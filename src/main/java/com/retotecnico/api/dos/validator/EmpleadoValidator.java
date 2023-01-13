package com.retotecnico.api.dos.validator;

import org.springframework.expression.ParseException;

import com.retotecnico.api.dos.Exceptions.ApiUnprocesableEntity;
import com.retotecnico.api.dos.dto.EmpleadoRequest;
import com.retotecnico.api.dos.entities.Empleados;

public interface EmpleadoValidator {
	void validator(EmpleadoRequest empleado) throws ApiUnprocesableEntity, ParseException;
}
