package com.javabasico.exceptions.try_catch;

public class Excecao {

	public static void main(String[] args) {
		/*=========================================================================================================
		 * TRY: TODO O CÓDIGO NO TRY SERÁ EXECUTADO ENQUANTO NÃO EXISTIR ERRO
		 =========================================================================================================*/
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da Exception");
			
			vetor[4] = 1;
			
			System.out.println("Esse texto não será impresso");
		
		} 
		/*=========================================================================================================
		 * CATCH: NO CATCH DEVE SER INCLUIDO TODOS OS TRATAMENTOS PARA CADA ERRO QUE OCORRER NO BLOCO TRY
		 =========================================================================================================*/
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exceção ao acessar um índice do vetor que não existe.");
			
		}
		
		System.out.println("Esse texto será impresso após a EXCEPTION.");
	}

}
