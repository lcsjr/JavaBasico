package com.javabasico.minha_thread.usando_runnable.multi_thread_sincronized;

public class Teste {

	public static void main(String[] args) {

		int[] valores = {1,2,3,4,5};
		MinhaThreadSoma t1 = new MinhaThreadSoma("#1", valores);
		MinhaThreadSoma t2 = new MinhaThreadSoma("#2", valores);

	}

}
