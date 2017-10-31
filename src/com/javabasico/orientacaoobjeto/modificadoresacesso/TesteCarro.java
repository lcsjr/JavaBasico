package com.javabasico.orientacaoobjeto.modificadoresacesso;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro mit = new Carro();
		
		/*
		 * Pode se notar que a vari�vel e o m�todo definidos na classe como PRIVATE n�o fica vis�vel, 
		 * pois � de uso exclusivo e interno da classe
		 */
		double combustivelNecessario = mit.calculaCombustivel(200);
		System.out.println("Combust�vel necess�rio para viagem � de " + combustivelNecessario);
		
		mit.exibirAutonomia();

	}

}
