package com.javabasico.coletor_de_lixo;

import com.javabasico.orientacaoobjeto.construtores.Carro;

public class ColetorLixo {

	public static void obterMemoriaUsada() {
		
		final int MB = 1024 * 1024;
		
		Runtime runtime = Runtime.getRuntime(); //PESQUISAR PADR�O SINGLETON (ONDE S� � PERMITIDO TER UMA INST�NCIA DA CLASSE) 
		
		System.out.println(( runtime.totalMemory() - runtime.freeMemory())/ MB );
	}
	
	public static void main(String[] args) {
		
		Carro[] carros = new Carro[100000];
		Carro carro;
		
		for (int i=0; i < carros.length; i++) {
			carro = new Carro("Mitsubhi"+i, "ASX"+i);
			carros[i] = carro;
		}

		System.out.println("Carros Criados!!");
		
		obterMemoriaUsada();
		
		carros = null;
		// MARCA O OBJETO COMO FINALIZADO NA MEM�RIA PARA QUE O 'GARBAGE COLLECTOR' REMOVA DA MEM�RIA
		Runtime.getRuntime().runFinalization();
		// EXECUTA O 'GARBAGE COLLECTOR' PARA FOR�AR QUE O OBJETO SEJA REMOVIDO DA MEM�RIA
		// OBS. N�O � GARANTIDO QUE O GC() SEJA EXECUTADO. E TAMB�M N�O � UMA BOA PR�TICA, APENAS EM CASOS MUITO CR�TICO.
		Runtime.getRuntime().gc();
		
		System.out.println("Contatos removido da mem�ria...!!!");
		
		obterMemoriaUsada();
		
		/*====================================================================================================
		 * EXISTE A 'JVISUALVM' FERRAMENTA DE PROFILING PARA MONITORAR O USO DA MEM�RIA.
		 * PODE SER EXECUTADA PELO 'DOS' OU EXECUTAR O JVISUALVM.JAR NO DIRET�RIO EM QUE O JAVA FOI INSTALADO
		 ======================================================================================================*/
	}

}
