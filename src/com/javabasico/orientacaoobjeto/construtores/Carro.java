package com.javabasico.orientacaoobjeto.construtores;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;

	/*
	 * Contrutor 1 - apenas inst�nciando
	 * OBS.: construtores tamb�m podem ser criados autom�ticamente atrav�s da IDE:
	 *  Menu-> Source -> Generate Constructor From SuperClass()
	 */
	Carro() {
		System.out.println("A Classe Carro foi Inst�nciada");
	}
	
	/*
	 * Contrutor 2 - recebendo todos atributos da classe atrav�s da inst�ncia
	 * OBS.: construtores tamb�m podem ser criados autom�ticamente atrav�s da IDE:
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
	 * Contrutor 3 - recebendo dois atributos da classe atrav�s da inst�ncia
	 * OBS.: construtores tamb�m podem ser criados autom�ticamente atrav�s da IDE:
	 *  Menu-> Source -> Generate Constructor using Fields
	 */
	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

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
