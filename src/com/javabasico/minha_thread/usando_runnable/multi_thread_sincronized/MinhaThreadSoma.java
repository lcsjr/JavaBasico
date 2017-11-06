package com.javabasico.minha_thread.usando_runnable.multi_thread_sincronized;

public class MinhaThreadSoma implements Runnable {
	
	private String nome;
	private int[] numers;
	
	private static Calculadora calc = new Calculadora();
	
	public MinhaThreadSoma(String nome, int[] numers) {
		this.nome = nome;
		this.numers = numers;
		// CODIGO ABAIXO ESTA SIMPLIFICADO.
		new Thread(this, nome ).start();
	}

	@Override
	public void run() {
		System.out.println(this.nome + " iniciada");
		
		int soma = calc.somaValores(this.numers);
	
		System.out.println("Resultado da soma para a thread " + this.nome + " é: " + soma);
		System.out.println(this.nome + " terminada.");
	}
	

}
