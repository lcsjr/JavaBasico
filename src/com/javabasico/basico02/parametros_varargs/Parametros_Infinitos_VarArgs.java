package com.javabasico.basico02.parametros_varargs;

public class Parametros_Infinitos_VarArgs {

	public static void main(String[] args) {

		System.out.println("Soma com dois parâmetros: " + soma(1,2));
		System.out.println("Soma com três parâmetros: " + soma(1,2,3));

		//CONCEITO DE VETOR.
		int [] somar = {10,20,30,40,50,60};
		System.out.println("Soma utilizando vetor: " + soma(somar));
	
		// COM O CONCEITO DE VarArgs OS INÚMEROS PARÂMETROS SÃO PASSADOS DIRETO NA FUNÇÃO
		System.out.println("Soma utilizando o Conceito de VarArgs: " + soma(10,10,10,10,10,10,10,10,10,10));
		// COM O CONCEITO DE VarArgs OS INÚMEROS PARÂMETROS SÃO PASSADOS DIRETO NA FUNÇÃO, RESERVANDO O PRIMEIRO PARÂMETRO PARA
		// UM COMPORTAMENTO ESPECÍFICO DENTRO DA FUNÇÃO
		System.out.println("Soma utilizando o Conceito de VarArgs e Divide pelo Primeiro Parâmetro: " + somaDivide(2,10,10,10,10,10,10,10,10,10,10));
	}
	
	// SOMA DE DOIS PARÂMETROS
	static int soma(int a, int b) {
		return a + b;
	}
	// SOMA DE TRÊS PARÂMETROS
	static int soma(int a, int b, int c) {
		return a + b + c;
	}
	// SOMA UTILIZANDO VETOR
	static int soma(int[] vetor) {
		int total = 0;
		
		for (int i=0; i < vetor.length; i++) {
			total += vetor[i];
		}
		return total;
	}
	
	// SOMA UTILIZADO O CONCEITO DE VarArgs COM POSSIBILIDADE DE INÚMEROS PARÂMETROS
	static int soma(Integer... vetor) {
		int total = 0;
		
		for(int i=0; i < vetor.length; i++) {
			total += vetor[i];
		}
		return total;
	}
	
	// SOMA UTILIZADO O CONCEITO DE VarArgs COM POSSIBILIDADE DE INÚMEROS PARÂMETROS CONSIDERANDO O PRIMEIRO PARÂMETRO
	// COMO POSIÇÃO FIXA PARA UM DETERMINADO COMPORTAMENTO DENTRO DO CÓDIGO
	static int somaDivide(int a, Integer... vetor) {
		int total = 0;
		
		for(int i=0; i < vetor.length; i++) {
			total += vetor[i];
		}
		total = total / a;
		return total;
	}
	

}
