package com.javabasico.orientacaoobjeto.recursiva.fibonacci;

public class TesteFibonacci {

	public static void main(String[] args) {
		
		System.out.print("Serie Fibonacci: " );
		for (int i=0; i <20 ; i++)
		{
			int resulFibo = Fibonacci.calcularFibonacci(i);
			
			System.out.print(resulFibo + ",");
		}
		

	}

}
