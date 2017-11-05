package com.javabasico.enumeradores.calculadora;

public class Calculadora {

	// CRIANDO UM 'ENUM' NA PROPRIA CLASSE CALCULADORA
	enum Operacao{
		/*
		 * OBS. DEPOIS DE TER CRIADO O MÉTODO ABSTRATO executarOperacao() NA LNHA 44, O COMPILADOR PEDIU PARA CRIAR O 
		 * MÉTODO PARA CADA CONSTRUTOR
		 */
		SOMAR("+") {
			@Override
			public double executarOperacao(double x, double y) {
				// TODO Auto-generated method stub
				return x + y;
			}
		}, SUBTRAIR("-") {
			@Override
			public double executarOperacao(double x, double y) {
				// TODO Auto-generated method stub
				return x - y;
			}
		}, MULTIPLICAR("*") {
			@Override
			public double executarOperacao(double x, double y) {
				// TODO Auto-generated method stub
				return x * y;
			}
		}, DIVIDIR("/") {
			@Override
			public double executarOperacao(double x, double y) {
				// TODO Auto-generated method stub
				return x / y;
			}
		};
	
		private String simbolo;
		
		Operacao(String simbolo){
			this.simbolo = simbolo;
		}
		
		// MÉTODO ABSTRACT 
		public abstract double executarOperacao(double x, double y);	
		
		// MODIFICANDO O MÉTODO toString() PARA RETORNAR O SÍMBOLO
		public String toString() {
			return this.simbolo;
		}
	}
	public static void main(String[] args) {			
		
		double x = 2.0;
		double y = 3.0;
		
		for ( Operacao op : Operacao.values()) {
			System.out.print(x + " ");
			System.out.print(op.toString() + " ");
			System.out.print(y + " = ");
			System.out.println(op.executarOperacao(x, y));
		}
		
		System.out.println();

		String tipoCalculo = "+"; 
		
		for ( Operacao op : Operacao.values()) {
			if ( op.toString() == tipoCalculo ) {
				System.out.println("Tipo da Operação: " + tipoCalculo );
				System.out.print(x + " ");
				System.out.print(op.toString() + " ");
				System.out.print(y + " = ");
				System.out.println(op.executarOperacao(x, y));
			}
		}		
		

	}

}
