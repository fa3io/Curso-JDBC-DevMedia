package br.edu.devmedia.jdbc.exception;

public class ValidacaoException extends Exception  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 789760253228566579L;

	
	public ValidacaoException(String msg, Exception exception) {
		super(msg, exception);
	}
	
	public ValidacaoException(String msg) {
		super(msg);
	}

}
