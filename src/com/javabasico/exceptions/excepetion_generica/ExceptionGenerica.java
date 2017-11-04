package com.javabasico.exceptions.excepetion_generica;

public class ExceptionGenerica {

	public static void main(String[] args) {

		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};

		for ( int i=0; i< numeros.length; i++ ) {
			
			// BLOCO QUE SER� MONITORADO PARA ERROS
			try {
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/ demon[i]) );
			}
			// EXCEPTION: POSS�VEL TRATAR O ERRO E CONTINUAR A EXECU��O DO PROGRAMA. SE EXISTIR MAIS ERROS, ESTES SER�O IDENTIFICADOS
			// SEM QUE HAJA A INTERROP��O DO PROGRAMA.
			// ESTE CONCEITO � MAIS UTILIZADO NOS PROJETOS JAVA, E AS MENSAGENS CAPTURADAS S�O GRAVADAS EM UM ARQUIVO DE LOG.
			catch(Exception e) {
				System.out.println(e.getMessage() );
				e.printStackTrace();
			}
			 
		}
	}

}
