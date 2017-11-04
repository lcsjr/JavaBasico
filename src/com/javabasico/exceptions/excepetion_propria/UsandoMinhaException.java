package com.javabasico.exceptions.excepetion_propria;

public class UsandoMinhaException {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 21, 64, 128};
		int[] demon = {2, 0, 4, 8, 0, 2, 4};

		for ( int i=0; i< numeros.length; i++ ) {
			
			// BLOCO QUE SERÁ MONITORADO PARA ERROS
			try {
				if ( numeros[i] % 2 != 0 ) {
					// LANCAR A EXCEPTION AQUI
					throw new DivisaoNaoExata(numeros[i] , demon[i] );
				}
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/ demon[i]) );
			}
			// PRIMEIRO TRATAMENTO DE ERRO
			catch(ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) {
				System.out.println("Erro na execução do programa.");
				e.printStackTrace();
			}
			// SEGUNDO TRATAMENTO DE ERRO
			catch(Exception e) {
				System.out.println("Indice do array é inválido.");
			}
			
			 
		}

	}

}
