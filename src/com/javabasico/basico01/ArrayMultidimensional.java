package com.javabasico.basico01;

/*
 * Exercícios: http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-20.
 */
public class ArrayMultidimensional {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[2][4];
		notasAlunos[0][0] = 5;
		notasAlunos[0][1] = 6;
		notasAlunos[0][2] = 6.5;
		notasAlunos[0][3] = 8;		

		notasAlunos[1][0] = 7;
		notasAlunos[1][1] = 9;
		notasAlunos[1][2] = 6.5;
		notasAlunos[1][3] = 10;		
		
		
		// rows
		for (int i=0; i < notasAlunos.length; i++) {
			// columns
			for (int j = 0; j < notasAlunos[i].length; j++)	{
				System.out.println(" O valor deste array para o registro " + i + " e coluna " + j +" é: " + notasAlunos[i][j]);
			}
		}
		
		/*
		 *  inicializando matriz com valores
		 */
		double[][] notasAlunos2 = {{10,9,8,10}, {9,10,9,9.5} };

		// rows
		for (int i=0; i < notasAlunos2.length; i++) {
			// columns
			for (int j = 0; j < notasAlunos2[i].length; j++)	{
				System.out.println(" XXX: O valor deste array para o registro " + i + " e coluna " + j +" é: " + notasAlunos2[i][j]);
			}
		}
		
	}

}
