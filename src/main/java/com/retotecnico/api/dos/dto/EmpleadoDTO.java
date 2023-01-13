package com.retotecnico.api.dos.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
//@Data
public class EmpleadoDTO implements Serializable {

	private String id;
	private String tipoId;
	private String nombres;
	private String apellidos;
	private Date fechaNacimiento;
	private int edad;
	private String cargo;
	private Double salario;
	private Date fechaVinculacion;
	private Date tiempoVinculacion;

	public EmpleadoDTO() {

	}

	public EmpleadoDTO(String id, String tipoId, String nombres, String apellidos, Date fechaNacimiento, int edad,
			String cargo, Double salario, Date fechaVinculacion, Date tiempoVinculacion) {
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
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
	
}
