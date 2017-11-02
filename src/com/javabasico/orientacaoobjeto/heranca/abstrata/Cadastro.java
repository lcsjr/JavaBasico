package com.javabasico.orientacaoobjeto.heranca.abstrata;

public abstract class Cadastro {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
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
	
	public String obterEndereco() {
		return this.endereco;
	}
	
	/*================================================================================================
	 * METODO ABSTRATO SEM CORPO, OU SEJA APENAS A DECLARACAO DO MÉTODO PARA UTILIZAÇÃO NA SUBCLASSE
	 =================================================================================================*/
	public abstract void dizerSaudacaoMatinal();

}
