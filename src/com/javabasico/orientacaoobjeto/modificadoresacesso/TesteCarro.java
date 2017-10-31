package com.javabasico.orientacaoobjeto.modificadoresacesso;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro mit = new Carro();
		
		/*
		 * Pode se notar que a variável e o método definidos na classe como PRIVATE não fica visível, 
		 * pois é de uso exclusivo e interno da classe
		 */
		double combustivelNecessario = mit.calculaCombustivel(200);
		System.out.println("Combustível necessário para viagem é de " + combustivelNecessario);
		
		mit.exibirAutonomia();

	}

}
