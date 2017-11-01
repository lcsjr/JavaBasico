package com.javabasico.orientacaoobjeto.gets_sets;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro mit = new Carro();
		
		mit.setMarca("Mitisubishi");
		System.out.println("A marca do carro definida é: " + mit.getMarca() );
		
		mit.setModelo("ASX");
		System.out.println("O Modelo do carro definido é: " + mit.getModelo() );
		
		mit.setNumPassageiros(5);
		System.out.println("A quantidade de passageiros definida é: " + mit.getNumPassageiros() );
	}

}
