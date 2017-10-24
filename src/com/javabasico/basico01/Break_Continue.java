package com.javabasico.basico01;

import java.util.Scanner;

public class Break_Continue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o valor do \'Dividor\' : ");
		int num = scan.nextInt();
		
		System.out.print("Informe o \'Dividendo\': ");
		int max = scan.nextInt();
		
		/*
		 * BREAK
		 */
		for ( int i=num; i<=max; i++) {
			
			if (i % 5 == 0) {
				System.out.println("BREAK: Quando \'Resto\' é igual a Zero, o valor de i é: " + i);
				break;
			}
		}
		
		System.out.println("--------------------------------------");
		/*
		 * CONTINUE 
		 */
		for ( int i=num; i<=max; i++) {
			
			if (i % 5 == 0) {
				System.out.println("CONTINUE: Quando \'Resto\' é igual a Zero, o valor de i é: " + i);
				continue; // equivalente ao comando LOOP 
			}
			System.out.println("CONTINUE: Quando \'Resto\' é diferente de Zero, o valor de i é: " + i);
		}
			
	scan.close();
	}

}
