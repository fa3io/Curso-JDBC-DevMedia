package br.edu.devmedia.jdbc.dto;

import java.util.Date;

public class Pessoa {
	
	private Integer id;
	private String nome;
	private Long cfp;
	private String endereco;
	private Character sexo;
	private Date dtNascimento;
        private Endereco enderecoDTO;
        
	public Pessoa() {
		
	}
	public Pessoa(Integer id, String nome, Long cfp, String endereco,
			Character sexo, Date dtNascimento) {
		this.id = id;
		this.nome = nome;
		this.cfp = cfp;
		this.endereco = endereco;
		this.sexo = sexo;
		this.dtNascimento = dtNascimento;
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
	public Long getCfp() {
		return cfp;
	}
	public void setCfp(Long cfp) {
		this.cfp = cfp;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Character getSexo() {
		return sexo;
	}
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

    @Override
    public String toString() {
        return getId()+" - "+getNome()+" - "+getCfp();
    }

    public Endereco getEnderecoDTO() {
        return enderecoDTO;
    }

    public void setEnderecoDTO(Endereco enderecoDTO) {
        this.enderecoDTO = enderecoDTO;
    }
    
        
        
	
	

}
