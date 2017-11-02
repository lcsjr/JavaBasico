package com.javabasico.orientacaoobjeto.heranca.constantes;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println(Constantes.REPOSITORIO);
		System.out.println(Constantes.URL_GITHUB);
		System.out.println(Constantes.URL_CURSO_COMPLETO);
		System.out.println(Constantes.URL_BLOG);

		System.out.println("Antes: "+Constantes.LINGUAGEM);
		Constantes.LINGUAGEM = "JAVA BASICO";
		System.out.println("Depois: "+Constantes.LINGUAGEM);
	}

}
