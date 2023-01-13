package com.retotecnico.api.dos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retotecnico.api.dos.Exceptions.ApiUnprocesableEntity;
import com.retotecnico.api.dos.dto.EmpleadoRequest;
import com.retotecnico.api.dos.services.interfaces.EmpleadoServices;
import com.retotecnico.api.dos.validator.EmpleadoValidator;

@CrossOrigin("*")
@RestController
@RequestMapping("/empleados")
public class ApiController {

	@Autowired
	private EmpleadoValidator validator;
	
	@Autowired
	private EmpleadoServices empleados;
	
	
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> index(){
		
		return ResponseEntity.ok(this.empleados.findAll());
	}
	
	@PostMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> registarEmpleado(@RequestBody EmpleadoRequest empleado) throws ParseException, ApiUnprocesableEntity{
		
		this.validator.validator(empleado);
		this.empleados.save(empleado);
		
		return ResponseEntity.ok(Boolean.TRUE);
	}
	
	@DeleteMapping(value ="{id}/delete")
	public ResponseEntity<Object> deleteEmpleado(@PathVariable("id") Integer id){
		
		this.empleados.deleteById(id);
		return ResponseEntity.ok(Boolean.TRUE);
	}
	
	@PutMapping(value= "{id}/update")
	public ResponseEntity<Object> updateEmpleado(@RequestBody EmpleadoRequest empleado, @PathVariable Integer id){
		
		this.empleados.update(empleado, id);
		return ResponseEntity.ok(Boolean.TRUE);
	}
	
}
