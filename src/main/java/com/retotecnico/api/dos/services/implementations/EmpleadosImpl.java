package com.retotecnico.api.dos.services.implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.retotecnico.api.dos.dto.EmpleadoDTO;
import com.retotecnico.api.dos.dto.EmpleadoRequest;
import com.retotecnico.api.dos.entities.Empleados;
import com.retotecnico.api.dos.repository.EmpleadoRepository;
import com.retotecnico.api.dos.services.interfaces.EmpleadoServices;
import com.retotecnico.api.dos.utils.BCrypt;
import com.retotecnico.api.dos.utils.Helpers;

@Component
public class EmpleadosImpl implements EmpleadoServices {

	@Autowired
	EmpleadoRepository empleadoRpstory;

	@Override
	public List<EmpleadoDTO> findAll() {
		
		List<EmpleadoDTO> dto = new ArrayList<>();
		
		Iterable<Empleados> empleados = this.empleadoRpstory.findAll();
		
		for (Empleados empl : empleados) {
			
			EmpleadoDTO e = Helpers.modelMapper().map(empl, EmpleadoDTO.class);
			dto.add(e);
		}
		return dto;
	}

	/*@Override
	public EmpleadoDTO buscarPorNombre(String nombre) {
		Optional<Empleados> empleado = this.empleadoRpstory.buscarPorNombre(nombre);

		if (!empleado.isPresent()) {
			return null;
		}

		return Helpers.modelMapper().map(empleado.get(), EmpleadoDTO.class);
	}*/

	@Override
	public EmpleadoDTO buscarPorId(int userId) {
		Optional<Empleados> empleado = this.empleadoRpstory.findById(userId);

		if (!empleado.isPresent()) {
			return null;
		}

		return Helpers.modelMapper().map(empleado.get(), EmpleadoDTO.class);
	}

	@Override
	public void save(EmpleadoRequest empleado) {
		
		Empleados empleadoNuevo = Helpers.modelMapper().map(empleado, Empleados.class);
		
		empleadoNuevo.setPassword(BCrypt.hashpw(empleado.getPassword(), BCrypt.gensalt()));
		this.empleadoRpstory.save(empleadoNuevo);

	}

	@Override
	public void saveAll(List<EmpleadoRequest> empleados) {
		
		List<Empleados> empl = new ArrayList<>();

		for (EmpleadoRequest empleado : empleados) {
			 
			Empleados emp = Helpers.modelMapper().map(empleado, Empleados.class);
			empl.add(emp);
		}
		
		this.empleadoRpstory.saveAll(empl);
	}

	@Override
	public void deleteById(int userId) {
		this.empleadoRpstory.deleteById(userId);

	}
	
	@Override
	public void update(EmpleadoRequest empleado, int id) {
		
		Optional<Empleados> emp =  this.empleadoRpstory.findById(id);
		
		if(emp.isPresent()) {
			Empleados e = emp.get();
			e.setTipoId(empleado.getTipoId());
			e.setNombres(empleado.getNombres());
			e.setApellidos(empleado.getApellidos());
			e.setEdad(empleado.getEdad());
			e.setFechaNacimiento(empleado.getFechaNacimiento());
			e.setCargo(empleado.getCargo());
			e.setSalario(empleado.getSalario());
			e.setFechaVinculacion(empleado.getFechaVinculacion());
			e.setTiempoVinculacion(empleado.getTiempoVinculacion());
			e.setPassword(BCrypt.hashpw(empleado.getPassword(), BCrypt.gensalt()));
			this.empleadoRpstory.save(e);
		}
		
		
	}

	private EmpleadoDTO convertirAUsuarioDTO(final Empleados empleado) {

		return Helpers.modelMapper().map(empleado, EmpleadoDTO.class);

	}

	

}
