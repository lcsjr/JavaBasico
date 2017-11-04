package com.javabasico.exceptions.usando_throws;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		
		System.out.println("Entre com um número decimal (separando o decimal com ponto ou virgula: ");		
		try {
			double num = leNumero();
			System.out.println("você digitou: " +num);
		} catch (Exception e) {
			System.out.println("Entrada de dados inválida.");
			e.printStackTrace();
		}
		
	}
	
	/*================================================================================================================
	 * THROWS: QUANDO UTILIZADO ESSA PALAVRA CHAVE, O TRATAMENTO DE ERRO DEVE SER FEITO NO MÉTODO QUE ESTA CHAMANDO.
	 * CONFORME EXEMPLO DESTA CLASSE, ONDE O MÉTODO leNumero() é DECLARADO COM A PALAVRA CHAVE THROWS E O MÉTODO 
	 * QUE FARÁ O TRATAMENTO DO ERRO É O main(). OU SEJA,É UMA TRANSFÊRENCIA DE RESPONSABILIDADE PARA TRATAMENTO DE ERRO
	 * OBRIGANDO QUE O ERRO SEJA TRATADO NO MÉTODO CHAMADOR.
	 ================================================================================================================*/
	public static double leNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
	
		return num;
	}

}
