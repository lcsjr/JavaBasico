package com.javabasico.exceptions.usando_throws;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		
		System.out.println("Entre com um n�mero decimal (separando o decimal com ponto ou virgula: ");		
		try {
			double num = leNumero();
			System.out.println("voc� digitou: " +num);
		} catch (Exception e) {
			System.out.println("Entrada de dados inv�lida.");
			e.printStackTrace();
		}
		
	}
	
	/*================================================================================================================
	 * THROWS: QUANDO UTILIZADO ESSA PALAVRA CHAVE, O TRATAMENTO DE ERRO DEVE SER FEITO NO M�TODO QUE ESTA CHAMANDO.
	 * CONFORME EXEMPLO DESTA CLASSE, ONDE O M�TODO leNumero() � DECLARADO COM A PALAVRA CHAVE THROWS E O M�TODO 
	 * QUE FAR� O TRATAMENTO DO ERRO � O main(). OU SEJA,� UMA TRANSF�RENCIA DE RESPONSABILIDADE PARA TRATAMENTO DE ERRO
	 * OBRIGANDO QUE O ERRO SEJA TRATADO NO M�TODO CHAMADOR.
	 ================================================================================================================*/
	public static double leNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
	
		return num;
	}

}
