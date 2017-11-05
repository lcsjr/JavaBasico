package com.javabasico.minha_thread.usando_runnable;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", 300);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", 600);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 900);
		
	}

}
