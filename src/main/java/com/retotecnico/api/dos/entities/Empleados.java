package com.retotecnico.api.dos.entities;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//@Data
@Entity
@Table(name="empleado")
public class Empleados implements Serializable{
  
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "tipo_id")
	private String tipoId;
	
	@Column(name = "nombres")
	private String nombres;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_nacimiento")  
	private Date fechaNacimiento;
	
	@Column(name = "edad")
	private Integer edad;
	
	@Column(name = "cargo")
	private String cargo;
	
	@Column(name = "salario")
	private Double salario;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_vinculacion")
	private Date fechaVinculacion;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "tiempo_vinculacion")
	private Date tiempoVinculacion;
	
	@Column(name="password")
	private String password;

	
	
	public Empleados () {
		
	}
	
	
	
	public Empleados(int id, String tipoId, String nombres, String apellidos, Date fechaNacimiento, int edad,
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
