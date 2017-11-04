package com.javabasico.exceptions.try_catch;

public class MultiplosCatch {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};

		for ( int i=0; i< numeros.length; i++ ) {
			
			// BLOCO QUE SERÁ MONITORADO PARA ERROS
			try {
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/ demon[i]) );
			}
			// PRIMEIRO TRATAMENTO DE ERRO
			catch(ArithmeticException exception) {
				System.out.println("Não é possível divisão por zero.");
			}
			// SEGUNDO TRATAMENTO DE ERRO
			catch(ArrayIndexOutOfBoundsException execption) {
				System.out.println("Indice do array é inválido.");
			}
			 
		}

	}

}
