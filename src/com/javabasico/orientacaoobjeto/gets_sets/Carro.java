package com.javabasico.orientacaoobjeto.gets_sets;

/* ===========================================================================================================================
 * Este procedimento de esconder os atributos e utilizar os Getters e Setters é chamado de ENCAPSULAMENTO.
 =============================================================================================================================*/

public class Carro {

	/*=========================================================================================================================
	 * com a definição Private na variável, indica que é de uso exclusivo e interno da classe.
	 ==========================================================================================================================*/
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capacidadeCombustivel;
	private double consumoCombustivel;
	
	/*=========================================================================================================================
	 *  Os Gets e Sets podem ser definidos manualmente, entretando a IDE já fornece um recurso para facilitar esta codificação:
	 *  Menu: -> Source -> Generate Getters and Setters.
	 ==========================================================================================================================*/
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumPassageiros() {
		return numPassageiros;
	}
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	public double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}
	public void setCapacidadeCombustivel(double capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}
	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}
	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}
	
}
