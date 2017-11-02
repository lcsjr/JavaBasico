package com.javabasico.orientacaoobjeto.super_classe;

/*==================================================================================================================
 * EXTENDS: indica que esta classe recebe como heran�a uma outra classe
 ==================================================================================================================*/
public class Aluno extends Cadastro{

	private String curso;
	private double[] notas;
	
	
	public Aluno() {
		/*
		 * SUPER() : FAZ REFER�NCIA AO CONSTRUTOR DA SUPERCLASSE, QUE NESTE CASO � A CLASSE CADASTRO, QUE FOI
		 * DEFINIDA COMO HERAN�A ATRAV�S DO COMANDO EXTENDS 
		 */
		super();
	}		
	
	// NESTE CONSTRUTOR, FORAM DEFINIDOS DOIS PAR�METROS , NOME E TELEFONE, QUE FAZEM REFER�NCIA AO CONSTRUTOR DA CLASSE CADASTRO.
	// E TAMB�M UM TERCEIRO PAR�METRO QUE FAZ PARTE DESTA CLASSE.
	// PORTANTO, NESTE CONSTRUTOR, OS PARANETROS NOME E TELEFONE S�O REFERENCIADOS NA SUPER() QUE IR� CHAMAR O CONSTRUTOR DA 
	// CLASSE CADASTRO PASSANDO-OS COMO PAR�METROS. E O PAR�METRO CURSO SER� ATRIBU�DO NESTA MESMA CLASSE ATRAV�S DO COMANDO THIS.
	public Aluno(String nome, String telefone, String curso) {
		super(nome, telefone);
		this.curso = curso;
	}

	// METODO TESTE PARA APENAS DEMONSTRAR A USABILIDADE DE SUPER. OU THIS. .ESTES COMANDO S�O SEMELHANTES, A DIFEREN�A � QUE
	// QUANDO SE UTILIZA SUPER. VOC� VER� APENAS OS M�TODOS E ATRIBUTOS DA CLASSE HERDADA.
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
