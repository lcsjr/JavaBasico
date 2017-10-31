package com.javabasico.orientacaoobjeto.modificadoresacesso;

/*
 * COM O MODIFICADOR PUBLIC: a Classe fica visível em todo o Projeto
 */

/*
 * SEM O MODIFICADOR PUBLIC: a Classe fica visível somente no Pacote em que esta contida
 */
class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	private double qtdeCombustivel; // com a definição Private na variável, indica que é de us exclusivo e interno da classe.

	/*
	 * void : usado quando não tem retorno.
	 */
	void exibirAutonomia() {
			System.out.println("A autonomia do carro é: " + (this.capacidadeCombustivel * this.consumoCombustivel)+ " Km.");
	}
	
	/*
	 * PRIVATE: Indica que o método não fica visível. Ou seja, o método é de uso exclusivo e interno da própria Classe.
	 */
	private double calculoKM(double km) {
		if ( this.consumoCombustivel == 0 ) {
			System.out.println("É necessário definir o Consumo de Combustível do carro!");
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
