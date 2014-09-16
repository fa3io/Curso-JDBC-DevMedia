package br.edu.devmedia.jdbc.exception;

public class NegocioException extends Exception  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 789760253228566579L;

	
	public NegocioException(String msg, Exception exception) {
		super(msg, exception);
	}
	
	public NegocioException(String msg) {
		super(msg);
	}

}
