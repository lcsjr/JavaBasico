package com.javabasico.orientacaoobjeto.modificador_static;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		int valor1 = 10;
		int valor2 = 5;
		int resultado;
		
		resultado = Calculadora.soma(valor1, valor2);		
		System.out.println("COM STATIC: O resultado da soma entre " + valor1 + " e " + valor2 + " � = " + resultado);
		
		resultado = Calculadora.subtrair(valor1, valor2);		
		System.out.println("COM STATIC: O resultado da subtra��o entre " + valor1 + " e " + valor2 + " � = " + resultado);		

		Calculadora MinhaCalc = new Calculadora();
		resultado = MinhaCalc.multiplicar(valor1, valor2);
		System.out.println("SEM STATIC: O resultado da multiplica��o entre " + valor1 + " e " + valor2 + " � = " + resultado);
				
	}

}
