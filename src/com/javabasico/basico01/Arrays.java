package com.javabasico.basico01;

/*
 * Exerc�cio: http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
 */
public class Arrays {

	public static void main(String[] args) {
		
		double[] temperaturas = new double[7];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2]	= 33.7;	
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("A temperatura informada �: "+ temperaturas[2]);
		System.out.println("O tamanho do array \'temperaturas\' �: " + temperaturas.length);
		System.out.println("Endere�o deste array na mem�ria: " + temperaturas);
		
		for (int i=0; i < temperaturas.length; i++) {
			System.out.println(" O valor deste array para o index " + i + " �: " + temperaturas[i]);
		}
		
		// neste FOR, transfire o conteudo do array para a vari�vel. Aqui n�o � poss�vel identificar qual � o index.
		for (double temp : temperaturas) {
			System.out.println(temp);
		}
	}

}
