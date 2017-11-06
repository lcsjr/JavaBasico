package com.javabasico.minha_thread.usando_runnable.multi_thread;

public class MinhaThreadRunnable2 implements Runnable {

	private String nome;
	private int tempo;

	public MinhaThreadRunnable2(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		//Thread t = new Thread(this);
		//t.start();
	}

	@Override
	public void run() {
		int total = 0;
		try {
			for( int i=0; i<6; i++) {
				System.out.println("Tarefa: "+ nome + " |Executando a Soma: " + total++);
				Thread.sleep(this.tempo);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("=========================================================================");
		System.out.println("Terminou a execução da tarefa: " + this.nome);
		System.out.println("=========================================================================");
	}

}
