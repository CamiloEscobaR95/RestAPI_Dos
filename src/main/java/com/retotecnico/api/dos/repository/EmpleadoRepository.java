package com.retotecnico.api.dos.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.retotecnico.api.dos.entities.Empleados;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleados, Integer >{
	
	//@Transactional(readOnly = true)
	//Optional<Empleados> buscarPorNombre(String nombres);
	
	
	
}
