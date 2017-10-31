package com.javabasico.orientacaoobjeto.construtores;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;

	/*
	 * Contrutor 1 - apenas instânciando
	 * OBS.: construtores também podem ser criados automáticamente através da IDE:
	 *  Menu-> Source -> Generate Constructor From SuperClass()
	 */
	Carro() {
		System.out.println("A Classe Carro foi Instânciada");
	}
	
	/*
	 * Contrutor 2 - recebendo todos atributos da classe através da instância
	 * OBS.: construtores também podem ser criados automáticamente através da IDE:
	 *  Menu-> Source -> Generate Constructor using Fields
	 */
	Carro(String marca, String modelo, int numPassageiros, double capacidadeCombustivel, double consumoCombustivel ){
		this.marca  = marca ;
		this.modelo = modelo ;
		this.numPassageiros = numPassageiros ;
		this.capacidadeCombustivel = capacidadeCombustivel ;
		this.consumoCombustivel = consumoCombustivel ;
	}
	
	/*
	 * Contrutor 3 - recebendo dois atributos da classe através da instância
	 * OBS.: construtores também podem ser criados automáticamente através da IDE:
	 *  Menu-> Source -> Generate Constructor using Fields
	 */
	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

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
