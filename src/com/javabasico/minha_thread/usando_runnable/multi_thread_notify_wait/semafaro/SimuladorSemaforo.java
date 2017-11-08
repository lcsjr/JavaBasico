package com.javabasico.minha_thread.usando_runnable.multi_thread_notify_wait.semafaro;

public class SimuladorSemaforo {

	public static void main(String[] args) {
		
		ThreadSemafaro semafaro = new ThreadSemafaro();
		
		for (int i=0; i < 10; i++) {
			System.out.println(semafaro.getCor());
			semafaro.esperaCorMudar();
		}
		
		semafaro.desligarSemafaro();

	}

}
