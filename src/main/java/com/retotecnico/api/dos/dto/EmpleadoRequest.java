package com.retotecnico.api.dos.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmpleadoRequest implements Serializable{
	
	@JsonProperty("numero_de_id")
	private String id;
	
	@JsonProperty("tipo_de_id")
	private String tipoId;
	
	@JsonProperty("nombres")
	private String nombres;
	
	@JsonProperty("apellidos")
	private String apellidos;
	
	@JsonProperty("fecha_de_nacimiento")
	private Date fechaNacimiento;
	
	@JsonProperty("edad")
	private Integer edad;
	
	@JsonProperty("cargo")
	private String cargo;
	
	@JsonProperty("salario")
	private Double salario;
	
	@JsonProperty("fecha_de_vinculacion")
	private Date fechaVinculacion;
	
	@JsonProperty("tiempo_vinculacion")
	private Date tiempoVinculacion;
	
	@JsonProperty("contraseña")
	private String password;
	
	

	public EmpleadoRequest() {
		super();
	}
	
	

	public EmpleadoRequest(String id, String tipoId, String nombres, String apellidos, Date fechaNacimiento, Integer edad,
			String cargo, Double salario, Date fechaVinculacion, Date tiempoVinculacion, String password) {
		super();
		this.id = id;
		this.tipoId = tipoId;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.cargo = cargo;
		this.salario = salario;
		this.fechaVinculacion = fechaVinculacion;
		this.tiempoVinculacion = tiempoVinculacion;
		this.password = password;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTipoId() {
		return tipoId;
	}

	public void setTipoId(String tipoId) {
		this.tipoId = tipoId;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Date getFechaVinculacion() {
		return fechaVinculacion;
	}

	public void setFechaVinculacion(Date fechaVinculacion) {
		this.fechaVinculacion = fechaVinculacion;
	}

	public Date getTiempoVinculacion() {
		return tiempoVinculacion;
	}

	public void setTiempoVinculacion(Date tiempoVinculacion) {
		this.tiempoVinculacion = tiempoVinculacion;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
