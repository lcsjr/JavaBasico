package com.javabasico.basico01;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 1;
		int max = 10;
		
		System.out.println("Contando at� " + max);
		
		// enquanto express�o verdadeira
		while (i <= max) {
			System.out.println("Usando WHILE: Valor de i: " + i);
			i++;
		}
		
		System.out.println("Valor final de i com \'WHILE\' �: " + i);
		
		// fa�a enquanto express�o verdadeira
		do {
			i++;
			System.out.println("Usando DO-WHILE: Valor final de i �: " + i);
		} while (i < 15);
		
		System.out.println("Valor final de i com \'DO-WHILE\' �: " + i);
	}

}
