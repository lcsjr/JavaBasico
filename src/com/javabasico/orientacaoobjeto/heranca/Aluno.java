package com.javabasico.orientacaoobjeto.heranca;

/*==================================================================================================================
 * EXTENDS: indica que esta classe recebe como herança uma outra classe
 ==================================================================================================================*/
public class Aluno extends Cadastro{
		
	private String curso;
	private double[] notas;
	
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
