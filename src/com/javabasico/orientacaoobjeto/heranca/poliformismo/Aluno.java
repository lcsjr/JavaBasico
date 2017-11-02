package com.javabasico.orientacaoobjeto.heranca.poliformismo;

/*==================================================================================================================
 * EXTENDS: indica que esta classe recebe como heran�a uma outra classe
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
	
	/*
	 * (non-Javadoc)
	 * @see com.javabasico.orientacaoobjeto.heranca.poliformismo.Cadastro#obterEndereco()
	 POLIFORMISMO: PERMITE QUE SEJA REDEFINIDO O COMPORTAMENTO DE UM M�TODO HERDADO. 
	 COMO EXEMPLO, TEMOS O M�TODO ObterEndereco() QUE FOI DEFINIDO NA CLASSE CADASTRO, E AQUI NA CLASSE ALUNO ESTE
	 M�TODO TEVE SEU COMPORTAMENTO MODIFICADO. 
	 *
	 */
	public String obterEndereco() {
		String tipo = "Endere�o do Aluno: ";
		tipo += super.obterEndereco();
		
		return tipo;
	}


}
