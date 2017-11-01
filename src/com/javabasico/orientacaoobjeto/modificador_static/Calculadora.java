package com.javabasico.orientacaoobjeto.modificador_static;

/* ================================================================================================
 * Exercícios: http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-34
 ================================================================================================*/
public class Calculadora {
	
	/*=========================================================================================================================
	 * MODIFICADOR STATIC: Em um método definido como Static, indica que sua utilização não depende da instanciação da classe.
	 * para utilizá-lo só é necessário a referencia da CLASSE.MÉTODO, exemplo: Calculadora.soma(10,5)
	 =========================================================================================================================*/
	public static int soma( int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtrair( int num1, int num2) {
		return num1 - num2;
	}

	public int multiplicar ( int num1, int num2) {
		return num1 * num2;
	}
}
