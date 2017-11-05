package com.javabasico.basico02.parametros_varargs;

public class Parametros_Infinitos_VarArgs {

	public static void main(String[] args) {

		System.out.println("Soma com dois par�metros: " + soma(1,2));
		System.out.println("Soma com tr�s par�metros: " + soma(1,2,3));

		//CONCEITO DE VETOR.
		int [] somar = {10,20,30,40,50,60};
		System.out.println("Soma utilizando vetor: " + soma(somar));
	
		// COM O CONCEITO DE VarArgs OS IN�MEROS PAR�METROS S�O PASSADOS DIRETO NA FUN��O
		System.out.println("Soma utilizando o Conceito de VarArgs: " + soma(10,10,10,10,10,10,10,10,10,10));
		// COM O CONCEITO DE VarArgs OS IN�MEROS PAR�METROS S�O PASSADOS DIRETO NA FUN��O, RESERVANDO O PRIMEIRO PAR�METRO PARA
		// UM COMPORTAMENTO ESPEC�FICO DENTRO DA FUN��O
		System.out.println("Soma utilizando o Conceito de VarArgs e Divide pelo Primeiro Par�metro: " + somaDivide(2,10,10,10,10,10,10,10,10,10,10));
	}
	
	// SOMA DE DOIS PAR�METROS
	static int soma(int a, int b) {
		return a + b;
	}
	// SOMA DE TR�S PAR�METROS
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
	
	// SOMA UTILIZADO O CONCEITO DE VarArgs COM POSSIBILIDADE DE IN�MEROS PAR�METROS
	static int soma(Integer... vetor) {
		int total = 0;
		
		for(int i=0; i < vetor.length; i++) {
			total += vetor[i];
		}
		return total;
	}
	
	// SOMA UTILIZADO O CONCEITO DE VarArgs COM POSSIBILIDADE DE IN�MEROS PAR�METROS CONSIDERANDO O PRIMEIRO PAR�METRO
	// COMO POSI��O FIXA PARA UM DETERMINADO COMPORTAMENTO DENTRO DO C�DIGO
	static int somaDivide(int a, Integer... vetor) {
		int total = 0;
		
		for(int i=0; i < vetor.length; i++) {
			total += vetor[i];
		}
		total = total / a;
		return total;
	}
	

}
