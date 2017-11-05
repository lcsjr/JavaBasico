package com.javabasico.minha_thread;

public class Teste {

	public static void main(String[] args) {

		MinhaThread thread1 = new MinhaThread("Thread #1", 400);
		MinhaThread thread2 = new MinhaThread("Thread #2", 800);
		MinhaThread thread3 = new MinhaThread("Thread #3", 1200);
	}

}
