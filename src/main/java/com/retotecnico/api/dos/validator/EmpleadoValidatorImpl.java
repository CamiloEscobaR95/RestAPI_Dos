package com.retotecnico.api.dos.validator;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.expression.ParseException;
import org.springframework.stereotype.Component;

import com.retotecnico.api.dos.Exceptions.ApiUnprocesableEntity;
import com.retotecnico.api.dos.dto.EmpleadoRequest;


@Component
public class EmpleadoValidatorImpl implements EmpleadoValidator {

	@Override
	public void validator(EmpleadoRequest empleado) throws ApiUnprocesableEntity, ParseException {
		
		if( empleado.getNombres() == null || empleado.getNombres().isEmpty()) {
			message("El nombre es obligatorio!");
		}
		
		if (empleado.getTipoId() == null || empleado.getTipoId().isEmpty()) {
			message("El Tipo de identificación es obligatorio!");
		}
		
		if (empleado.getTipoId() == null || empleado.getTipoId().isEmpty()) {
			message("El Tipo de identificación es obligatorio!");
		}
		
		if (empleado.getApellidos() == null || empleado.getApellidos().isEmpty()) {
			message("El apellido es obligatorio!");
		}
		
		if (empleado.getCargo() == null) {
			message("El cargo del empleado es obligatorio!");
		}

		if (empleado.getSalario() == null) {
			message("El salario del empleado es obligatorio!");
		}

		if (empleado.getEdad() == null || empleado.getEdad() < 18) {
			message("La edad del empleado debe de ser mayor o igual a 18 años");
		}
		
		if (empleado.getPassword() == null ) {
			message("La Contraseña es obligatoria!");
		}else if(empleado.getPassword().length() < 6) {
			message("La contraseña es muy corta, debe ser mayor de 6 caracteres!");
		}
		
		if (empleado.getFechaNacimiento() == null) {
			message("La fecha de nacimiento es obligatoria!");
		} else {
			boolean res = true;
			Date fecha = (Date) empleado.getFechaNacimiento();
			try {
				res=validarFecha(fecha);
			} catch (java.text.ParseException e) {
				e.printStackTrace();
			}

			if (res == true) {
				System.out.println("La fecha es valida");
				
			} else
				message("El formato de la fecha debe ser dd/mm/yyy.");
		}
		
		if (empleado.getFechaVinculacion() == null) {
			message("La fecha de vicnulación es obligatoria!");
		}else {
			boolean res = true;
			Date fecha = (Date) empleado.getFechaNacimiento();
			try {
				res=validarFecha(fecha);
			} catch (java.text.ParseException e) {
				e.printStackTrace();
			}

			if (res == true) {
				System.out.println("La fecha es valida");
				
			} else
				message("El formato de la fecha debe ser dd/mm/yyy.");
		}
	}

	private void message(String message) throws ApiUnprocesableEntity {
		
		throw new ApiUnprocesableEntity(message);
	}
	
	public static boolean validarFecha(Date fecha) throws java.text.ParseException {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            String strDate = formatoFecha.format(fecha); 
            formatoFecha.parse(strDate);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

	

}

