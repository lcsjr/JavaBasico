package com.javabasico.orientacaoobjeto.heranca.abstrata;

public class Teste {

	public static void main(String[] args) {

		
		/*==============================================================================================================
		 * UMA CLASSE ABSTRATA, SOMENTE PODE SER EXTENDIDA EM UMA SUBCLASSE. 
		 * UMA CLASSE ABSTRATA N�O PODE SER INTANCIADA DIRETAMENTE, CONFORME CODIGO COMENTADO ABAIXO:
          ==============================================================================================================
		Cadastro enderecoGenerico = new Cadastro();
		enderecoGenerico.setEndereco("\n:::Endere�o Qualquer:::\n");
		System.out.println(enderecoGenerico.obterEndereco());
		*/
		
		Cadastro aluno = new Aluno();
		Cadastro professor = new Professor();
		
		aluno.setEndereco("Av Francisco Matarazzo, 121");
		professor.setEndereco("Rua dos Artistas, 750");
		
		System.out.println(aluno.obterEndereco());
		System.out.println(professor.obterEndereco());
		
		// CHAMADA DO MESMO M�TODO NAS DUAS CLASSES, POR�M COMO ESTE M�TODO � ABSTRATO NA CLASSE CADASTRO,
		// FOI NECESS�RIO NAS SUBCLASSES DEFINIR UM COMPORTAMENTO PARA O M�TODO dizerSaudacaoMatinal();
		aluno.dizerSaudacaoMatinal();
		professor.dizerSaudacaoMatinal();


	}

}
