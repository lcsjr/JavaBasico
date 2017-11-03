package com.javabasico.orientacaoobjeto.heranca.interfaces;

public class Papagaio extends Ave implements AnimalDomesticado {

	@Override
	public void voar() {
		System.out.println("O papagaio saiu para voar!!");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("piu piu");
		
	}

	@Override
	public void levarVeterinario() {
		System.out.println("O papagaio precisa ir ao Veterinario.");
		
	}
	@Override
	public void comprarRacao() {
		System.out.println("Atenção!! É preciso comprar ração para o papagaio");
		
	}

}
