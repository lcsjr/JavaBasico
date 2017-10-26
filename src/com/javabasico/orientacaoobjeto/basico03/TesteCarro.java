package com.javabasico.orientacaoobjeto.basico03;

public class TesteCarro {

	public static void main(String[] args) {
		
		double autonomia;
		
		Carro hond = new Carro();
		hond.marca = "Honda";
		hond.modelo = "New Civic";
		hond.numPassageiros = 5;
		hond.capacidadeCombustivel = 100;
		hond.consumoCombustivel = 0.2;
		
		System.out.println("Endereço na memória: " +hond);
		
		System.out.println("Marca: " + hond.marca);
		System.out.println("Modelo: "+ hond.modelo);
		//hond.exibirAutonomia();
		autonomia = hond.obterAutonomia();
		System.out.println("O Carro " + hond.modelo + " possui autonomia de " + autonomia);
		
		System.out.println();
		
		Carro mit = new Carro();
		mit.marca = "Mitshubishi";
		mit.modelo = "ASX";
		mit.numPassageiros = 5;
		mit.capacidadeCombustivel = 60;
		mit.consumoCombustivel = 0.2;
		
		
		System.out.println("Endereço na memória: " +mit);
		
		System.out.println("Marca: " + mit.marca);
		System.out.println("Modelo: "+ mit.modelo);
		//mit.exibirAutonomia();
		autonomia = mit.obterAutonomia();
		System.out.println("O Carro " + mit.modelo + " possui autonomia de " + autonomia);
	}

}
