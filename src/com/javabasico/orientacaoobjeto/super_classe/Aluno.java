package com.javabasico.orientacaoobjeto.super_classe;

/*==================================================================================================================
 * EXTENDS: indica que esta classe recebe como herança uma outra classe
 ==================================================================================================================*/
public class Aluno extends Cadastro{

	private String curso;
	private double[] notas;
	
	
	public Aluno() {
		/*
		 * SUPER() : FAZ REFERÊNCIA AO CONSTRUTOR DA SUPERCLASSE, QUE NESTE CASO É A CLASSE CADASTRO, QUE FOI
		 * DEFINIDA COMO HERANÇA ATRAVÉS DO COMANDO EXTENDS 
		 */
		super();
	}		
	
	// NESTE CONSTRUTOR, FORAM DEFINIDOS DOIS PARÂMETROS , NOME E TELEFONE, QUE FAZEM REFERÊNCIA AO CONSTRUTOR DA CLASSE CADASTRO.
	// E TAMBÉM UM TERCEIRO PARÂMETRO QUE FAZ PARTE DESTA CLASSE.
	// PORTANTO, NESTE CONSTRUTOR, OS PARANETROS NOME E TELEFONE SÃO REFERENCIADOS NA SUPER() QUE IRÁ CHAMAR O CONSTRUTOR DA 
	// CLASSE CADASTRO PASSANDO-OS COMO PARÂMETROS. E O PARÂMETRO CURSO SERÁ ATRIBUÍDO NESTA MESMA CLASSE ATRAVÉS DO COMANDO THIS.
	public Aluno(String nome, String telefone, String curso) {
		super(nome, telefone);
		this.curso = curso;
	}

	// METODO TESTE PARA APENAS DEMONSTRAR A USABILIDADE DE SUPER. OU THIS. .ESTES COMANDO SÃO SEMELHANTES, A DIFERENÇA É QUE
	// QUANDO SE UTILIZA SUPER. VOCÊ VERÁ APENAS OS MÉTODOS E ATRIBUTOS DA CLASSE HERDADA.
	public void metodoTeste() {
		super.setNome("LUIZ SANTOS");;
		// OU
		this.setNome("LUIZ SANTOS");
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
}
