package com.javabasico.basico02.wrappers_classes_tipos_primitivos;

public class TesteWrappers {

	public static void main(String[] args) {
		
		System.out.println("=========================================================================================");
		conceitoUmTipoPrimitivo();
		System.out.println("=========================================================================================");
		conceitoDoisTipoPrimitivo();
		System.out.println("=========================================================================================");
		
		//AUTO UN-BOXING
		Integer num1 = 100; //ATRIBUICAO DO TIPO PRIMITIVO PARA O OBJETO NUM1
		int num2 = num1; // ATRIBUICAO DO VALOR DO OBJETO PARA UMA VARIAVEL DO TIPO PRIMITIVA
		System.out.println("Diretamente: " + num2);
			//OU
		int num3 = num1.intValue(); // ATRIBUICAO DO VALOR DO OBJETO PARA UMA VARIAVEL DO TIPO PRIMITIVA
		System.out.println("Utilizando o intValue(): " + num3);
		
		num1++;
		System.out.println("Incrementando diretamente: " + num1);

		Integer num4 = num2/2;
		System.out.println("Utilizando em Expressões: " + num4);
		
	}
	
	public static void conceitoUmTipoPrimitivo() {		
	/*=========================================================================================================
	 * CONCEITO 1: ( ATÉ O JAVA 5 )
	 * UTILIZANDO OS CONSTRUTORES DAS CLASSES QUE REPRESENTAM OS TIPOS PRIMITIVOS PARA PODER CRIAR/INSTANCIAR 
	 * ESTES TIPOS EM OBJETOS
	 =========================================================================================================*/
		System.out.println("Conceito 1 : Tipos Primitivos.");
		Character char1 = new Character('B');
		System.out.println("Char: "+ char1);
		
		Short numShort = new Short( (short) 1);
		System.out.println("Short: " + numShort);
		
		Byte numByte = new Byte( (byte) 10 );
		System.out.println("Byte: "+ numByte);
		
		Integer numInteger = new Integer(100);
		System.out.println("Integer Normal: " +numInteger);
		
		Integer numStringToInteger = new Integer("1001");
		System.out.println("String to Integer : " + numStringToInteger);
		
		Long numLong = new Long(100000L);
		System.out.println("Long: " + numLong);
		
		Float numFloat = new Float(3.5F);
		System.out.println("Float: " + numFloat);

		Float numStringToFloat = new Float("3.5F");
		System.out.println("String to Float: " + numStringToFloat);
		
		Double numDouble = new Double(3.5);
		System.out.println("Float: " + numDouble);

		Double numStringToDouble = new Double("3.5");
		System.out.println("String to Float: " + numStringToDouble);
		
		Boolean flagBoolean = new Boolean(true);
		System.out.println("Boolean: " + flagBoolean);

		Boolean flagStringToBoolean = new Boolean("true");
		System.out.println("String to Boolean: " + flagStringToBoolean );
	}
	
	public static void conceitoDoisTipoPrimitivo() {		
	/*=========================================================================================================
	 * CONCEITO 2: AUTOBOXING ( A PARTIR DO JAVA 5 )
	 * FAZER DIRETAMENTE A ATRIBUIÇÃO DO TIPO PRIMITIVO NO OBJETO
	 =========================================================================================================*/
		System.out.println("Conceito 2: Tipos Primitivos");
		Character char1 = 'B';
		System.out.println("Char: "+ char1);
		
		Short numShort = 1;
		System.out.println("Short: " + numShort);
		
		Byte numByte = 10;
		System.out.println("Byte: "+ numByte);
		
		Integer numInteger = 100;
		System.out.println("Integer Normal: " +numInteger);
		
		Long numLong = 100000L;
		System.out.println("Long: " + numLong);
		
		Float numFloat = 3.5F;
		System.out.println("Float: " + numFloat);

		Double numDouble = 3.5;
		System.out.println("Float: " + numDouble);

		Boolean flagBoolean = new Boolean(true);
		System.out.println("Boolean: " + flagBoolean);

	}

}
