package com.javabasico.orientacaoobjeto.modificador_static;

/* ================================================================================================
 * Exerc�cios: http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-34
 ================================================================================================*/
public class Calculadora {
	
	/*=========================================================================================================================
	 * MODIFICADOR STATIC: Em um m�todo definido como Static, indica que sua utiliza��o n�o depende da instancia��o da classe.
	 * para utiliz�-lo s� � necess�rio a referencia da CLASSE.M�TODO, exemplo: Calculadora.soma(10,5)
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
