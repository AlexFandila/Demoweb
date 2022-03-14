package com.nttdata.demoweb.service;

import java.util.List;

import com.nttdata.demoweb.repository.entity.Usuario;

public interface UsuarioService {
	
	public List<Usuario> listarUsuarios();
	public Usuario buscarPorUsername(String username);

}
