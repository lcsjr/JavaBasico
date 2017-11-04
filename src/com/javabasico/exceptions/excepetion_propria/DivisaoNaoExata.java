package com.javabasico.exceptions.excepetion_propria;

public class DivisaoNaoExata extends Exception {
	
	private int num;
	private int dem;
	
	public DivisaoNaoExata(int num, int dem) {
		super();
		this.num = num;
		this.dem = dem;
	}

	@Override
	public String toString() {
		return "Resultado de "+ num +" / " +dem + " não é um inteiro.";
	}
	

}
