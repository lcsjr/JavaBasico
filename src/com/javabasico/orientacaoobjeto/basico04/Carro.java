package com.javabasico.orientacaoobjeto.basico04;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;

	/*
	 * void : usado quando n�o tem retorno.
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
	
	/*
	 * m�todo com par�metro
	 */
	double calculaCombustivel(double km) {
		double qtdCombustivel = km/this.consumoCombustivel;	
	return qtdCombustivel;
	}
}
