package com.javabasico.orientacaoobjeto.relacionamento_entre_classes;

public class Contato {
	
	private String nome;
	//private String endereco;
	//private String telefone;
	private Endereco endereco;
	private Telefone telefones[];
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone[] getTelefones() {
		return telefones;
	}
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}


}
