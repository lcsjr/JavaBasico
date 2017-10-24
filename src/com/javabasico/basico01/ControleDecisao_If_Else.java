package com.javabasico.basico01;

import java.util.Scanner;

/*
 * Lista para exercícios:
 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
 */

public class ControleDecisao_If_Else {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual sua idade? ");
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("Você é maior de idade. Pode entrar!");
		} else {
			System.out.println("Você não tem idade mínima de 18 anos. Entrada não autorizada!!");
		}
		
		System.out.print("Qual o valor do produto?");
		double valorProduto = scan.nextDouble();
		
		if (valorProduto <= 10 ) {
			System.out.println("O preço esta bom!");
		}else if (valorProduto > 10 && valorProduto < 15){
			System.out.println("Você deve pedir um desconto");
		}else if (valorProduto >= 15 && valorProduto < 17) {
			System.out.println("O preço esta caro, pedir mais desconto!");
		}else  {
			System.out.println("O produto esta caríssimo!!");
		}
		
	scan.close();
	}

}
