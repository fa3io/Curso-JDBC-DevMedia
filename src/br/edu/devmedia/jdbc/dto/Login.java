package br.edu.devmedia.jdbc.dto;

public class Login {
	
	private Integer id;
	private String  nome;
	private String senha;
	
	public Login() {
		
	}
	
	public Login(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
