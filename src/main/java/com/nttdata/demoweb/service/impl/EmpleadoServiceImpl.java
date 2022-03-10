package com.nttdata.demoweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.demoweb.repository.EmpleadoRepo;
import com.nttdata.demoweb.service.EmpleadoService;

import org.slf4j.Logger;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	private static Logger LOG = org.slf4j.LoggerFactory.getLogger(EmpleadoServiceImpl.class);

	@Autowired
	EmpleadoRepo empleadoRepo;
	
	@Override
	public void registrar(String nombre) {
		// TODO Auto-generated method stub
		empleadoRepo.registrar(nombre);
		
	}
	
	

}
