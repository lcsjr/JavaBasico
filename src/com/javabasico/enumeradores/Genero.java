package com.javabasico.enumeradores;

public enum Genero {
	
	FEMININO('F'), MASCULINO('M');
	
	private char tipo;
	
	Genero(char tipo){
		this.tipo = tipo;
	}

	public char getTipo() {
		return tipo;
	}

}

