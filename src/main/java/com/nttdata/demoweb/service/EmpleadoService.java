package com.nttdata.demoweb.service;

import java.util.List;

import com.nttdata.demoweb.repository.entity.Empleado;

public interface EmpleadoService {
	
	public void registrar(String nombre);
	public List<Empleado> listar();
	public List<Empleado> listarFiltroNombre(String cad);
	public List<Empleado> listarConJPA(Integer pID, String contiene);
	public List<Empleado> listarFiltroNombreEs(String cad);
	public Empleado inserta(Empleado emp);
	public void modificar(Empleado emp);
	public void eliminar(Integer id);
	public Empleado getById(Integer id);
}
