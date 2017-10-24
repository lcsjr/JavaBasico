package com.javabasico.basico01;
/*
 * http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
 */
public class LoopFOR {

	public static void main(String[] args) {
		
		// incrementando
		for (int i = 0; i < 5; i++) {
			System.out.println("incrementando em i: " + i);
		}
		
		// decrementando
		for (int i = 5; i > 0; i--) {
			System.out.println("decrementando em i: " + i);
		}
		
		//incrementando de 5 em 5
		for (int i = 0; i <= 25; i+=5) {
			System.out.println("incremento de 5 em i: " + i);
		}
		
		//utilizando mais de uma variável de controle no FOR
		for (int i=0, j=10 ; i<j ; i++, j--) {
			System.out.println("i = " + i + "; j = " +j);
		}
		
		// inicializando variavel contador fora do FOR
		int count = 0;
		for ( ; count < 10; count += 2 ) {
			System.out.println("inicializando contador fora do FOR: " + count);
		}
		System.out.println("Valor final de count: " + count);		
		
		// utilizando FOR para soma sem uso de chaves
		int soma = 0;
		for (int i=1; i < 5; soma += i++);
		System.out.println("O Resultado desta soma é: "+soma);
	}

}
