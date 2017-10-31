package com.javabasico.orientacaoobjeto.construtores;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro mit = new Carro("Mitshubishi", "ASX", 5, 60, 0.2);
		
		System.out.println(mit.marca);
		System.out.println(mit.modelo);
		System.out.println(mit.capacidadeCombustivel);
		System.out.println(mit.consumoCombustivel);
		System.out.println(mit.numPassageiros);
	}

}
