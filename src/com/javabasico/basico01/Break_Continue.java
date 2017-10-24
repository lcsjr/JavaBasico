package com.javabasico.basico01;

import java.util.Scanner;

public class Break_Continue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com um número: ");
		int num = scan.nextInt();
		
		System.out.print("Entre com um limite: ");
		int max = scan.nextInt();
		
		/*
		 * BREAK
		 */
		for ( int i=num; i<=max; i++) {
			
			if (i % 7 == 0) {
				System.out.println("O valor de i é: " + i);
				break;
			}
		}
		
		/*
		 * CONTINUE 
		 */
		for ( int i=num; i<=max; i++) {
			
			if (i % 7 == 0) {
				continue; // equivalente ao comando LOOP 
			}
		}
			
	scan.close();
	}

}
