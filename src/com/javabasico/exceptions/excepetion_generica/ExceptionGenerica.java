package com.javabasico.exceptions.excepetion_generica;

public class ExceptionGenerica {

	public static void main(String[] args) {

		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};

		for ( int i=0; i< numeros.length; i++ ) {
			
			// BLOCO QUE SERÁ MONITORADO PARA ERROS
			try {
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/ demon[i]) );
			}
			// EXCEPTION: POSSÍVEL TRATAR O ERRO E CONTINUAR A EXECUÇÃO DO PROGRAMA. SE EXISTIR MAIS ERROS, ESTES SERÃO IDENTIFICADOS
			// SEM QUE HAJA A INTERROPÇÃO DO PROGRAMA.
			// ESTE CONCEITO É MAIS UTILIZADO NOS PROJETOS JAVA, E AS MENSAGENS CAPTURADAS SÃO GRAVADAS EM UM ARQUIVO DE LOG.
			catch(Exception e) {
				System.out.println(e.getMessage() );
				e.printStackTrace();
			}
			 
		}
	}

}
