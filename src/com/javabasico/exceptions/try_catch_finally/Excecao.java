package com.javabasico.exceptions.try_catch_finally;

public class Excecao {

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
				System.out.println("CATCH: Não é possível divisão por zero.");
				// COM ESTE CÓDIGO, O SISTEMA É ENCERRADO. SENDO ASSIM O FINALLY NÃO SERÁ EXECUTADO.
				//System.exit(0);
			}
			// SEGUNDO TRATAMENTO DE ERRO
			catch(ArrayIndexOutOfBoundsException execption) {
				System.out.println("CATCH: Indice do array é inválido.");
			}
			// SEMPRE SERÁ EXECUTADO.. SEMPRE. SEMPRE. SEMPRE. EXCETO QUANDO É ENCONTRADO O 'SYSTEM.EXIT(0)' NO BLOCO DO CATCH.
			finally {
				 System.out.println();
				 System.out.println("FINALLY:Essa linha é sempre impressa após o try ou catch.");
			 }
		}

	}

}
