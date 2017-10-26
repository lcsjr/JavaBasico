package com.javabasico.orientacaoobjeto.basico02;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;

	/*
	 * void : sem retorno.
	 */
	void exibirAutonomia() {
			System.out.println("A autonomia do carro é: " + (this.capacidadeCombustivel * this.consumoCombustivel)+ " Km.");
	}
}
