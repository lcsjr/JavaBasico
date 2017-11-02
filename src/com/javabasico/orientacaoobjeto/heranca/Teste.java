package com.javabasico.orientacaoobjeto.heranca;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Luiz Santo");
		aluno.setCurso("Java");
		aluno.setTelefone("11 9999-9999");
		
		Professor professor = new Professor();
		professor.setNome("Loiane");
		professor.setNomeCurso("Java");
		professor.setTelefone("11 8888-8888");
		
		
		System.out.println("Aluno: " + aluno.getNome() + " - Curso: " + aluno.getCurso() );
		System.out.println("Professor: " + professor.getNome() + " em aula de " + professor.getNomeCurso() );
		
	}

}
