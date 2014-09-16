package br.edu.devmedia.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import br.edu.devmedia.jdbc.ConexaoUtil;
import br.edu.devmedia.jdbc.dto.Login;
import br.edu.devmedia.jdbc.exception.PersistenciaException;

public class LoginDAO implements GenericoDAO<Login> {
	
	public boolean logar(Login login) throws PersistenciaException{
		boolean resultado = false;
		try {
			Connection connection = ConexaoUtil.getInstance().getConnection();
			String sql = "SELECT * FROM TB_LOGIN WHERE NOME = ? AND SENHA = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, login.getNome());
			statement.setString(2, login.getSenha());
			ResultSet resultSet = statement.executeQuery();

			resultado = resultSet.next();
			
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistenciaException(e.getMessage(), e);
		}
		return resultado;
	}

	@Override
	public void adicionar(Login objeto) throws PersistenciaException {
		
	}

	@Override
	public void atualizar(Login objeto) throws PersistenciaException {

		
	}

	@Override
	public void delete(Integer id) throws PersistenciaException {

		
	}

	@Override
	public List<Login> listarTodos() throws PersistenciaException {

		return null;
	}

	@Override
	public Login buscaPorId(Integer id) throws PersistenciaException {

		return null;
	}

}
