package com.javabasico.orientacaoobjeto.super_classe;

public class Cadastro {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	
	// criado construtor vazio
	public Cadastro() {	}
	
	//construtor
	public Cadastro(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
