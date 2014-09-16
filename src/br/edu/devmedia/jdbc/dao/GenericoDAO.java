package br.edu.devmedia.jdbc.dao;

import java.util.List;

import br.edu.devmedia.jdbc.exception.PersistenciaException;

public interface GenericoDAO <T> {
	
	void adicionar(T objeto) throws PersistenciaException;

	void atualizar(T objeto) throws PersistenciaException;
	
	void delete(Integer id) throws PersistenciaException;
	
	List<T> listarTodos() throws PersistenciaException;
	
	T buscaPorId(Integer id) throws PersistenciaException;


}
