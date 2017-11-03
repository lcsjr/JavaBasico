package com.javabasico.orientacaoobjeto.heranca.interfaces;

public class Teste {

	public static void main(String[] args) {

		Papagaio papagaio = new Papagaio();
		
		papagaio.emitirSom();
		papagaio.comprarRacao();
		System.out.println();
		
		Cachorro cachorro = new Cachorro();
		cachorro.emitirSom();
		cachorro.alimentar();
		System.out.println();
		
		Gato gato = new Gato();
		gato.emitirSom();
		gato.alimentar();
		System.out.println();

	}

}
