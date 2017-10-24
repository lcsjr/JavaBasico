package com.javabasico.basico01;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1 = (valor1 == 1 ) && (valor2 == 2);
		System.out.println("valor1 é "+valor1+" AND valor2 é "+valor2+" : " + resultado1);
		
		boolean resultado2 = (valor1 == 1 ) || (valor2 == 2);
		System.out.println("valor1 é "+valor1+" OR valor2 é "+valor2+" : " + resultado2);
		
		boolean resultado3 = (valor1 == 1 ) ^ (valor2 == 2);
		System.out.println("valor1 é "+valor1+" SHORT valor2 é "+valor2+" : " + resultado3);
	
		boolean resultado4 = !(valor1 == 2 ) && (valor2 == 2);
		System.out.println("valor1 é "+valor1+" AND valor2 é "+valor2+" : " + resultado4);

	}

}
