package com.javabasico.minha_thread.usando_runnable.multi_thread_notify_wait;

/*===========================================================================================================================
 * TENHO QUE ESTUDAR MAIS. N�O ENTENDI MUITO BEM A SIST�MICA DOS C�DIGOS.
 ===========================================================================================================================*/

public class Teste {

	public static void main(String[] args) {
		
		TiqueTaque tt = new TiqueTaque();
		ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
		ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tt);
		
		try {
			tique.t.join();
			taque.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
