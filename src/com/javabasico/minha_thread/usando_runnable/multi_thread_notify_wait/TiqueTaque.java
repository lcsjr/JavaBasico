package com.javabasico.minha_thread.usando_runnable.multi_thread_notify_wait;

/*===========================================================================================================================
 * TENHO QUE ESTUDAR MAIS. NÃO ENTENDI MUITO BEM A SISTÊMICA DOS CÓDIGOS.
 ===========================================================================================================================*/

public class TiqueTaque {
	
	boolean tique;
	
	synchronized void tique(boolean executandoTique) {
		
		if (!executandoTique) {
			tique = true;
			notify();
			return;
		}
		
		System.out.print("Tique ");
		tique = true;
		
		notify();
		
		while(tique) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	synchronized void taque(boolean executandoTique) {
		
		if (!executandoTique) {
			tique = false;
			notify();
			return;
		}
		
		System.out.println("Taque ");
		tique = false;
		
		notify();
		
		while(!tique) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
