package com.retotecnico.api.dos.services.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.retotecnico.api.dos.dto.EmpleadoDTO;
import com.retotecnico.api.dos.dto.EmpleadoRequest;

@Service
public interface EmpleadoServices {

	List<EmpleadoDTO> findAll();
	
	//EmpleadoDTO buscarPorNombre(String nombre);
	
	EmpleadoDTO buscarPorId(int userId);
	
	void save(EmpleadoRequest empleado);
	
	void saveAll(List<EmpleadoRequest> empleados);
	
	void update(EmpleadoRequest empleado, int id);
	
	void deleteById(int userId);
}
