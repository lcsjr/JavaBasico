package com.javabasico.minha_thread.usando_runnable.multi_thread_notify_wait.semafaro;

public class ThreadSemafaro implements Runnable {

	private CorSemafaro cor;
	private boolean parar;
	private boolean corMudou;

	public ThreadSemafaro() {
		this.cor = CorSemafaro.VERMELHO;
		this.parar = false;
		this.corMudou = false;

		new Thread(this).start();
	}

	@Override
	public void run() {

		while(!parar) {
			try {
				/*switch (this.cor) {
				case VERMELHO:
					Thread.sleep(2000);
					break;
				case AMARELO: 
					Thread.sleep(300);
					break;
				case VERDE:
					Thread.sleep(1000);
					break;
				default:
					break;
				}*/
				
				//ESTE CÓDIGO FOI IMPLEMENTADO COMO MELHORIA UTILIZANDO OS RECURSOS DE ENUM EM CorSemafaro()
				//SUBSTITUINDO O CÓDIGO ACIMA COMENTADO.
				Thread.sleep(this.cor.getTempoEspera());

				// MUDAR A COR
				this.mudarCor();

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public CorSemafaro getCor() {
		return cor;
	}

	private synchronized void mudarCor() {

		switch (this.cor) {
		case VERMELHO:
			this.cor = CorSemafaro.VERDE;
			break;
		case AMARELO:
			this.cor = CorSemafaro.VERMELHO;
			break;
		case VERDE:
			this.cor = CorSemafaro.AMARELO;
			break;
		default:
			break;
		}
		
		this.corMudou = true;
		notify();
	}
	
	public synchronized void esperaCorMudar() {
		
		while(!this.corMudou) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		this.corMudou = false;	
	}
	
	public synchronized void desligarSemafaro() {
		this.parar = true;
	}
}
