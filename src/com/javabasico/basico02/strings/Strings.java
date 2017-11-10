package com.javabasico.basico02.strings;

import java.util.StringTokenizer;

public class Strings {

	public static void main(String[] args) {
		
		
		String nomeCompleto;
		
		
		/*===================================================================================================
		 * IMPRIME UMA LETRA EM CADA LINHA 
		  ===================================================================================================*/
		nomeCompleto = "LUIZ.SANTOS";
		for (int i=0; i < nomeCompleto.length(); i++) {
			System.out.println(nomeCompleto.charAt(i));
		}
		System.out.println();
		
		/*===================================================================================================
		 * EQUIVALENTE A SUBSTRING(), PORÉM JOGA CADA LETRA EM UM INDICE DO ARRAY
		  ===================================================================================================*/
		char[] primeiroNome = new char[4];
		nomeCompleto.getChars(0, 4, primeiroNome, 0);
		System.out.println(primeiroNome);
		System.out.println();
		/*===================================================================================================
		 * COMPARANDO STRINGS	
		  ===================================================================================================*/	
		String ola1 = "Olá";
		String ola2 = "OLÁ";
		String ola3 = "Olá";
		
		System.out.println("ola1 equals ola2 = " + ola1.equals(ola2));
		System.out.println("ola1 equals ola3 = " + ola1.equals(ola3));
		System.out.println("ola1 equalsIgnoreCase ola2 = " + ola1.equalsIgnoreCase(ola2));
		System.out.println();
		/*===================================================================================================
		 * DESTA FORMA A COMPARAÇÃO É FEITA USANDO O ID DE REFERÊNCIA DA STRING NA MEMÓRIA, 
		 * E NÃO O CONTEÚDO DA MESMA STRING.
		  ===================================================================================================*/	
		String ola4 = new String(ola1);
		System.out.println("ola == ola3 => " + ( ola1 == ola3) + " (compara o id de referência na memória)");
		System.out.println("ola == ola4 => " + ( ola1 == ola4) + " (compara o id de referência na memória)");
		System.out.println();		
		/*===================================================================================================
		 * VERIFICA SE UM INTERVALO DE STRING ESTA CONTIDA EM OUTRO INTERVALO DE STRING
		  ===================================================================================================*/		
		String micro = "computador";
		String ref1 = "compu";
		String ref2 = "COMPU";
		
		System.out.println( micro.regionMatches(0, ref1, 0, 4));
		System.out.println( micro.regionMatches(1, ref1, 0, 4));
		System.out.println( micro.regionMatches(true, 0, ref2, 0, 4) );  //COM IGNORECASE
		System.out.println();		
		/*===================================================================================================
		 * FAZENDO BUSCA DENTRO DE UMA STRING
		  ===================================================================================================*/		
		System.out.println( "Não encontrado: " + micro.indexOf('X') );
		System.out.println( "primeiro encontrado: " + micro.indexOf('o') );
		System.out.println( "último encontrado: " + micro.lastIndexOf('o') );
		
		System.out.println("Contém: " + micro.contains("tador"));
		System.out.println("Não Contém: " + micro.contains("notebook"));
		System.out.println();
		/*===================================================================================================
		 * SUBSTRING
		  ===================================================================================================*/	
		String cidade = "New York";
		System.out.println("String inteira: " +cidade);
		System.out.println("A partir de uma posição da String : " +cidade.substring(3));
		System.out.println("Intervalo de String: " +cidade.substring(4, 4));
		System.out.println();	
		/*===================================================================================================
		 * REPLACE
		  ===================================================================================================*/	
		String espacos = " i s p a ç o";
		String correcaoEspacos = espacos.replace("i", "e");
		System.out.println(correcaoEspacos);
		
		correcaoEspacos = correcaoEspacos.replaceAll(" ", "");
		System.out.println(correcaoEspacos);
		System.out.println();
		
		String espaco2 = "   Luiz Santos   ";
		System.out.println(espaco2);
		espaco2 = espaco2.trim();
		System.out.println(espaco2);
		
		System.out.println();

		/*===================================================================================================
		 * MAISCULAS E MINUSCULAS
		  ===================================================================================================*/	
		String hobby = "CASTelo Ra-Tim-Bum";
		System.out.println("Normal: "+hobby);
		
		String hobbyMinusc = hobby.toLowerCase();
		System.out.println("Minuscula: "+hobbyMinusc);
		
		String hobbyMaisc = hobby.toUpperCase();
		System.out.println("Maiuscula:"+hobbyMaisc);
		
		System.out.println();
		/*===================================================================================================
		 * USANDO DELIMITADOR
		  ===================================================================================================*/	
		String linhaArquivo = "1;luiz santos;33";
		String[] infos = linhaArquivo.split(";");
		Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]),
								   infos[1],
								   Integer.parseInt(infos[2]) );
		
		System.out.println(pessoa);
		
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(linhaArquivo,";");
		while (st.hasMoreTokens() ) {
			System.out.println("campo: " + st.nextToken());
		}
		
	}

}
