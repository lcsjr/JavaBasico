package com.javabasico.orientacaoobjeto.heranca.abstrata;

public class Teste {

	public static void main(String[] args) {

		
		/*==============================================================================================================
		 * UMA CLASSE ABSTRATA, SOMENTE PODE SER EXTENDIDA EM UMA SUBCLASSE. 
		 * UMA CLASSE ABSTRATA NÃO PODE SER INTANCIADA DIRETAMENTE, CONFORME CODIGO COMENTADO ABAIXO:
          ==============================================================================================================
		Cadastro enderecoGenerico = new Cadastro();
		enderecoGenerico.setEndereco("\n:::Endereço Qualquer:::\n");
		System.out.println(enderecoGenerico.obterEndereco());
		*/
		
		Cadastro aluno = new Aluno();
		Cadastro professor = new Professor();
		
		aluno.setEndereco("Av Francisco Matarazzo, 121");
		professor.setEndereco("Rua dos Artistas, 750");
		
		System.out.println(aluno.obterEndereco());
		System.out.println(professor.obterEndereco());
		
		// CHAMADA DO MESMO MÉTODO NAS DUAS CLASSES, PORÉM COMO ESTE MÉTODO É ABSTRATO NA CLASSE CADASTRO,
		// FOI NECESSÁRIO NAS SUBCLASSES DEFINIR UM COMPORTAMENTO PARA O MÉTODO dizerSaudacaoMatinal();
		aluno.dizerSaudacaoMatinal();
		professor.dizerSaudacaoMatinal();


	}

}
