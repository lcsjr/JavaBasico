package com.javabasico.basico01;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		
		System.out.println("Adi��o: " + resultado);
		
		resultado = resultado - 1;
		System.out.println("Subtra��o: " + resultado);

		resultado = resultado * 2;
		System.out.println("Multiplica��o: " + resultado);
		
		resultado = resultado / 2;
		System.out.println("Divis�o: " + resultado);
		
		resultado = resultado + 8;
		System.out.println("Adi��o: " + resultado);
		
		resultado = resultado % 7;
		System.out.println("Resto da Divis�o: " + resultado);
		
		System.out.println("---------------------------------------");
		
		String primeiroNome = "Esta � ";
		String segundoNome  = "Uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
	
		System.out.println("---------------------------------------");
		
		int incremento = 2;
		System.out.println("Incremento: " + incremento);
		// <variavel>++ => primeiro imprime e depois incrementa
		System.out.println("Incremento: " + incremento++);
		// ++<variavel> => primeiro incrementa e depois imprime
		System.out.println("Incremento: " + ++incremento);

		System.out.println("---------------------------------------");
		
		int decremento = 4;
		System.out.println("Incremento: " + decremento);
		// <variavel>++ => primeiro imprime e depois incrementa
		System.out.println("Incremento: " + decremento--);
		// ++<variavel> => primeiro incrementa e depois imprime
		System.out.println("Incremento: " + --decremento);
	
	
	}

}
