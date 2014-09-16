package br.edu.devmedia.jdbc.bo;

import br.edu.devmedia.jdbc.dao.LoginDAO;
import br.edu.devmedia.jdbc.dto.Login;
import br.edu.devmedia.jdbc.exception.NegocioException;

public class LoginBO {

	public boolean logar(Login login) throws NegocioException{
		boolean resultado = false;
		try{
			if (login.getNome() == null || "".equals(login.getNome())) {
				throw new NegocioException("Login Obrigat�rio!");
			}else if (login.getSenha() == null || "".equals(login.getSenha())) {
				throw new NegocioException("Senha Obrigat�ria!");
			}else{
				LoginDAO loginDAO = new LoginDAO();
				resultado =  loginDAO.logar(login);
			}
			
		}catch(Exception e){
			throw new NegocioException(e.getMessage());
		}
		return resultado;
	}
}
