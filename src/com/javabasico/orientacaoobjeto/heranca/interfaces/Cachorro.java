package com.javabasico.orientacaoobjeto.heranca.interfaces;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {
	
	private String tamanho;
	private String raca;
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	@Override
	public void alimentar() {
		System.out.println("O Cachorro de raça " + this.raca + " esta sendo Alimentado.");
		
	}
	@Override
	public void emitirSom() {
		System.out.println("AU AU AU AU... ");
		
	}
	@Override
	public void brincar() {
		System.out.println("O " + this.raca + " esta brincado com a Bola.");
		
	}
	@Override
	public void levarPassear() {
		System.out.println("O " + this.raca + " precisa passear.");
		
	}
	@Override
	public void levarVeterinario() {
		System.out.println("O " + this.raca + " precisa ir ao Veterinario.");
		
	}
	@Override
	public void comprarRacao() {
		System.out.println("Atenção!! É preciso comprar ração para o " + this.raca );
		
	}
	
}
