package com.javabasico.orientacaoobjeto.heranca.poliformismo;

/*==================================================================================================================
 * EXTENDS: indica que esta classe recebe como herança uma outra classe
 ==================================================================================================================*/
public class Professor extends Cadastro{
	
	private double salario;
	private String nomeCurso;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.javabasico.orientacaoobjeto.heranca.poliformismo.Cadastro#obterEndereco()
	 OLIFORMISMO: PERMITE QUE SEJA REDEFINIDO O COMPORTAMENTO DE UM MÉTODO HERDADO. 
	 COMO EXEMPLO, TEMOS O MÉTODO ObterEndereco() QUE FOI DEFINIDO NA CLASSE CADASTRO, E AQUI NA CLASSE PROFESSOR ESTE
	 MÉTODO TEVE SEU COMPORTAMENTO MODIFICADO. 
	 *
	 */
	public String obterEndereco() {
		String tipo = "Endereço do Professor: ";
		tipo += super.obterEndereco();
		return tipo;
	}

}
