package com.javabasico.orientacaoobjeto.basico03;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;

	/*
	 * void : usado quand n�o tem retorno.
	 */
	void exibirAutonomia() {
			System.out.println("A autonomia do carro �: " + (this.capacidadeCombustivel * this.consumoCombustivel)+ " Km.");
	}
	
	/*
	 * m�todo com retorno double
	 */
	double obterAutonomia() {
		System.out.println("Calculo da Autonomia processado!");
		return this.capacidadeCombustivel * this.consumoCombustivel;		
	}

}
