package com.javabasico.minha_thread;

public class MinhaThread extends Thread{
	
	private String nome;
	private int tempo;
	
	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		// INICIA A THREAD E EXECUTA O RUN() DIRETO NO CONSTRUTOR
		start();
	}
	
	public void run() {
		System.out.println("Executando a tarefa " + this.nome + "...");
		
		try {
			for (int i=0; i < 6; i++) {
			System.out.println(nome + " : contador " + i);
				Thread.sleep(this.tempo);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	System.out.println("A tarefa " + this.nome + " terminou sua execução.");
	
	}

}
