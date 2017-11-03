package com.javabasico.orientacaoobjeto.heranca.interfaces;

public abstract class Animal {
	
	private String Nome;
	
	public abstract void emitirSom();

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

}
