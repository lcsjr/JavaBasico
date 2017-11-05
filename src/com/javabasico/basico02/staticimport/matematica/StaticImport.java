package com.javabasico.basico02.staticimport.matematica;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;
import static java.lang.Math.random;
import static java.lang.Math.round;
import static java.lang.Math.ceil;



public class StaticImport {

	public static void main(String[] args) {
		
		double a, b, c;
		
		a = 2;
		b = 3;		
		// POTENCIA 
		System.out.println("Pot�ncia de " + a + " elevado a " + b +" �: " +pow(a, b));
		
		c = 64;
		// RAIZ QUADRADA
		System.out.println("A raiz quadra de " + c + " �: " + sqrt(c));
		
		a= -13.25;
		// ABSOLUTO ( RETIRA SINAL NEGATIVO)
		System.out.println("O n�mero absoluto de " + a + " � : " + abs(a));
		
		// NUMERO RAND�MICO
		System.out.println("N�mero Rand�mico: " + random() );

		a= 1.6389;
		// ARREDONDAMENTO, ENTRETANDO ARREDONDAMENTO DE CASAS DECIMAIS AINDA N�O SEI FAZER.
		System.out.println("Retorna o valor arredondado em inteiro: " + round(a) );
		System.out.println("Retorna um valor arredondado em Double: " + ceil(a));
		
		}

}
