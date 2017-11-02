package com.javabasico.orientacaoobjeto.heranca.poliformismo;

public class Teste {

	public static void main(String[] args) {
		
		Cadastro enderecoGenerico = new Cadastro();
		enderecoGenerico.setEndereco("\n:::Endereço Qualquer:::\n");
		System.out.println(enderecoGenerico.obterEndereco());
		
		Cadastro aluno = new Aluno();
		Cadastro professor = new Professor();
		
		aluno.setEndereco("Av Francisco Matarazzo, 121");
		professor.setEndereco("Rua dos Artistas, 750");
		
		System.out.println(aluno.obterEndereco());
		System.out.println(professor.obterEndereco());

	}

}
