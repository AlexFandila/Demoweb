package com.nttdata.demoweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.demoweb.repository.EmpleadoRepoJPA;
import com.nttdata.demoweb.repository.entity.Empleado;
import com.nttdata.demoweb.service.EmpleadoService;

import java.util.List;

import org.slf4j.Logger;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	private static Logger LOG = org.slf4j.LoggerFactory.getLogger(EmpleadoServiceImpl.class);

	
	@Autowired
	EmpleadoRepoJPA empleadoRepo;
	
	@Override
	public void registrar(String nombre) {
		// TODO Auto-generated method stub
		empleadoRepo.registrar(nombre);
		
	}

	@Override
	public List<Empleado> listar() {
		return empleadoRepo.findAll();
	}
	
	public List<Empleado> listarFiltroNombre(String cad) {
		return empleadoRepo.listarCuyoNombreContiene(cad);
	}

	@Override
	public List<Empleado> listarConJPA(Integer pId, String contiene) {
		// TODO Auto-generated method stub
		return empleadoRepo.findByIdGreaterThanAndNombreLike(pId, contiene);
	}

	@Override
	public List<Empleado> listarFiltroNombreEs(String cad) {
		// TODO Auto-generated method stub
		return empleadoRepo.listarCuyoNombreEs(cad);
	}

	@Override
	public void inserta(Empleado emp) {
		empleadoRepo.save(emp);
		
	}

}
