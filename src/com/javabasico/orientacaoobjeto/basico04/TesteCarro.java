package com.javabasico.orientacaoobjeto.basico04;

public class TesteCarro {

	public static void main(String[] args) {
		
		double autonomia;
		double combustivelNecessario;
		
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
		combustivelNecessario = mit.calculaCombustivel(200);
		System.out.println("A quantidade de combustivel necessário para a viagem é de " + combustivelNecessario);
	}

}
