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
		System.out.println("Potência de " + a + " elevado a " + b +" é: " +pow(a, b));
		
		c = 64;
		// RAIZ QUADRADA
		System.out.println("A raiz quadra de " + c + " é: " + sqrt(c));
		
		a= -13.25;
		// ABSOLUTO ( RETIRA SINAL NEGATIVO)
		System.out.println("O número absoluto de " + a + " é : " + abs(a));
		
		// NUMERO RANDÔMICO
		System.out.println("Número Randômico: " + random() );

		a= 1.6389;
		// ARREDONDAMENTO, ENTRETANDO ARREDONDAMENTO DE CASAS DECIMAIS AINDA NÃO SEI FAZER.
		System.out.println("Retorna o valor arredondado em inteiro: " + round(a) );
		System.out.println("Retorna um valor arredondado em Double: " + ceil(a));
		
		}

}
