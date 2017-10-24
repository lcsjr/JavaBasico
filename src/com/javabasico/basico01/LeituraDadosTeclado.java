package com.javabasico.basico01;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite seu nome completo: ");
		// nextLine() => retorna como String tudo o que foi digitado no teclado até o momento do enter
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.print("Digite seu primeiro nome: ");
		// next() => retorna como String apenas a primeira palavra digitada no teclado
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.print("Digite sua idade: ");
		// nextInt() => retorna como Inteiro o que foi digitado no teclado
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.print("Digite sua altura: ");
		// nextDouble => retorna como Double o que foi digitado no teclado
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);

		/*
		 * Outra Maneira. Tudo deve ser digitado na mesma linha, e no final pressione enter.
		 */
		System.out.println("Informe os dados na seguinte ordem: Nome, Idade, Filhos, altura, e se possui animais.");
		String nome = scan.next();
		int idade2   = scan.nextInt();
		byte qtdeFilhos = scan.nextByte();
		float altura2 = scan.nextFloat();
		boolean temPet	= scan.nextBoolean();
		
		System.out.println("-----------------------------------------");
		System.out.println("Nome: " +nome);
		System.out.println("Idade: "+ idade2);
		System.out.println("Quantidade de Filhos: "+ qtdeFilhos);
		System.out.println("Altura: "+altura2);
		System.out.println("Tem animais? " + temPet);
		
		scan.close();
	
	}

}
