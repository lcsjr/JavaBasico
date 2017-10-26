package com.javabasico.basico01;

import java.util.Random;

public class LoopFOR_Each {

	public static void main(String[] args) {
		
		/*--------------------------------------------------------------------------------------
		 *  Exemplo 01
		 *--------------------------------------------------------------------------------------*/
		System.out.println("Utilizando Array Simples:");
		int[] notas = new int[10];
		
		Random random = new Random();
		
		for (int i=0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}
		
		//for each
		for (int nota : notas) {
			System.out.println("Números randômicos: " + nota);
		}
		
		/*--------------------------------------------------------------------------------------
		 *  Exemplo 02
		 *--------------------------------------------------------------------------------------*/
		System.out.println("Utilizando Array Multidimensional:");
		double[][] notasAlunos = new double[2][4];
		notasAlunos[0][0] = 5;
		notasAlunos[0][1] = 6;
		notasAlunos[0][2] = 6.5;
		notasAlunos[0][3] = 8;		

		notasAlunos[1][0] = 7;
		notasAlunos[1][1] = 9;
		notasAlunos[1][2] = 6.5;
		notasAlunos[1][3] = 10;	
		
		for (double[] notasAluno : notasAlunos ) {
			for (double nota:notasAluno) {
				System.out.print(nota+ "; ");
			}
			System.out.println();
		}
		

	}

}
