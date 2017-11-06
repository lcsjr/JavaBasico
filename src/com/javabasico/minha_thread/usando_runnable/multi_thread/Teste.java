package com.javabasico.minha_thread.usando_runnable.multi_thread;

public class Teste {

	public static void main(String[] args) {
		MinhaThreadRunnable1 thread1 = new MinhaThreadRunnable1("Contador", 300);
		MinhaThreadRunnable2 thread2 = new MinhaThreadRunnable2("Soma", 600);
		MinhaThreadRunnable3 thread3 = new MinhaThreadRunnable3("Multiplica��o", 900);
		
		Thread t1 = new Thread(thread1);
		t1.start();
		Thread t2 = new Thread(thread2);
		t2.start();
		Thread t3 = new Thread(thread3);
		t3.start();
	
		// NESSE FORMATO CADA THREAD � EXECUTADA AP�S A FINALIZA��O DA THREAD ANTERIOR.
		try {
			t1.join();
			t2.join();
			t3.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("Programa de Execu��o de Threads terminou.");
	}

}
