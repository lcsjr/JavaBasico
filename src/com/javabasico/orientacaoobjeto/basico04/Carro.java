package com.javabasico.orientacaoobjeto.basico04;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;

	/*
	 * void : usado quando não tem retorno.
	 */
	void exibirAutonomia() {
			System.out.println("A autonomia do carro é: " + (this.capacidadeCombustivel * this.consumoCombustivel)+ " Km.");
	}
	
	/*
	 * método com retorno double
	 */
	double obterAutonomia() {
		System.out.println("Calculo da Autonomia processado!");
	return this.capacidadeCombustivel * this.consumoCombustivel;		
	}
	
	/*
	 * método com parâmetro
	 */
	double calculaCombustivel(double km) {
		double qtdCombustivel = km/this.consumoCombustivel;	
	return qtdCombustivel;
	}
}
