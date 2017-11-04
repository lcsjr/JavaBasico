package com.javabasico.exceptions.try_catch_finally;

public class Excecao {

	public static void main(String[] args) {

		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};

		for ( int i=0; i< numeros.length; i++ ) {
			
			// BLOCO QUE SER� MONITORADO PARA ERROS
			try {
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/ demon[i]) );
			}
			// PRIMEIRO TRATAMENTO DE ERRO
			catch(ArithmeticException exception) {
				System.out.println("CATCH: N�o � poss�vel divis�o por zero.");
				// COM ESTE C�DIGO, O SISTEMA � ENCERRADO. SENDO ASSIM O FINALLY N�O SER� EXECUTADO.
				//System.exit(0);
			}
			// SEGUNDO TRATAMENTO DE ERRO
			catch(ArrayIndexOutOfBoundsException execption) {
				System.out.println("CATCH: Indice do array � inv�lido.");
			}
			// SEMPRE SER� EXECUTADO.. SEMPRE. SEMPRE. SEMPRE. EXCETO QUANDO � ENCONTRADO O 'SYSTEM.EXIT(0)' NO BLOCO DO CATCH.
			finally {
				 System.out.println();
				 System.out.println("FINALLY:Essa linha � sempre impressa ap�s o try ou catch.");
			 }
		}

	}

}
