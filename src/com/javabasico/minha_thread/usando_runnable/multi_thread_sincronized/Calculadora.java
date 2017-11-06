package com.javabasico.minha_thread.usando_runnable.multi_thread_sincronized;

public class Calculadora {
	
	private int soma;
	
	/*====================================================================
	 * SYNCHRONIZED: N�O PERMITE QUE UM M�TODO COMPARTILHADO SEJA EXECUTADO NO MESMO TEMPO DE EXECU��O, OU SEJA, 
	 * SOMENTE SER� EXECUTADO POR OUTRA THREAD, AP�S O T�RMINO DA EXECU��O DA THREAD ATUAL
	 ====================================================================*/
	public synchronized int somaValores(int[] valores) {
		
		soma = 0;
		
		for (int i=0; i < valores.length; i++) {
			soma += valores[i];
			
			System.out.println("Executando a soma " + Thread.currentThread().getName() +
					" somando o valor " + valores[i] + " com total de: " + soma);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return soma;
	}

}
