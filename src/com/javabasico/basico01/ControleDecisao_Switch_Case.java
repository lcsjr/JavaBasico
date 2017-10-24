package com.javabasico.basico01;

import java.util.Scanner;

/*
 * Lista para exercícios:
 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
 */
public class ControleDecisao_Switch_Case {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um número de semana (1-7): ");
		int diaSemana = scan.nextInt();
		
		switch(diaSemana) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("Terça"); break;
		case 4: System.out.println("Quarta"); break;
		case 5: System.out.println("Quinta"); break;
		case 6: System.out.println("Sexta"); break;
		case 7: System.out.println("Sábado"); break;
		default:  System.out.println("Não é um dia da semana válido");
		}
		
		scan.close();
	}

}
