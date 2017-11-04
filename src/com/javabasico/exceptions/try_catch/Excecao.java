package com.javabasico.exceptions.try_catch;

public class Excecao {

	public static void main(String[] args) {
		/*=========================================================================================================
		 * TRY: TODO O C�DIGO NO TRY SER� EXECUTADO ENQUANTO N�O EXISTIR ERRO
		 =========================================================================================================*/
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da Exception");
			
			vetor[4] = 1;
			
			System.out.println("Esse texto n�o ser� impresso");
		
		} 
		/*=========================================================================================================
		 * CATCH: NO CATCH DEVE SER INCLUIDO TODOS OS TRATAMENTOS PARA CADA ERRO QUE OCORRER NO BLOCO TRY
		 =========================================================================================================*/
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exce��o ao acessar um �ndice do vetor que n�o existe.");
			
		}
		
		System.out.println("Esse texto ser� impresso ap�s a EXCEPTION.");
	}

}
