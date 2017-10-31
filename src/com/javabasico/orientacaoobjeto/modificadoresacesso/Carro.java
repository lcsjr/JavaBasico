package com.javabasico.orientacaoobjeto.modificadoresacesso;

/*
 * COM O MODIFICADOR PUBLIC: a Classe fica vis�vel em todo o Projeto
 */

/*
 * SEM O MODIFICADOR PUBLIC: a Classe fica vis�vel somente no Pacote em que esta contida
 */
class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	private double qtdeCombustivel; // com a defini��o Private na vari�vel, indica que � de us exclusivo e interno da classe.

	/*
	 * void : usado quando n�o tem retorno.
	 */
	void exibirAutonomia() {
			System.out.println("A autonomia do carro �: " + (this.capacidadeCombustivel * this.consumoCombustivel)+ " Km.");
	}
	
	/*
	 * PRIVATE: Indica que o m�todo n�o fica vis�vel. Ou seja, o m�todo � de uso exclusivo e interno da pr�pria Classe.
	 */
	private double calculoKM(double km) {
		if ( this.consumoCombustivel == 0 ) {
			System.out.println("� necess�rio definir o Consumo de Combust�vel do carro!");
			this.qtdeCombustivel = 0;
		} else {
			this.qtdeCombustivel = km/this.consumoCombustivel;	
		}
		return this.qtdeCombustivel;
	}
	
	double calculaCombustivel(double km) {
		return this.calculoKM(km);
	}

}
