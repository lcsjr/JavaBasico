package com.javabasico.coletor_de_lixo;

import com.javabasico.orientacaoobjeto.construtores.Carro;

public class ColetorLixo {

	public static void obterMemoriaUsada() {
		
		final int MB = 1024 * 1024;
		
		Runtime runtime = Runtime.getRuntime(); //PESQUISAR PADRÃO SINGLETON (ONDE SÓ É PERMITIDO TER UMA INSTÂNCIA DA CLASSE) 
		
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
		// MARCA O OBJETO COMO FINALIZADO NA MEMÓRIA PARA QUE O 'GARBAGE COLLECTOR' REMOVA DA MEMÓRIA
		Runtime.getRuntime().runFinalization();
		// EXECUTA O 'GARBAGE COLLECTOR' PARA FORÇAR QUE O OBJETO SEJA REMOVIDO DA MEMÓRIA
		// OBS. NÃO É GARANTIDO QUE O GC() SEJA EXECUTADO. E TAMBÉM NÃO É UMA BOA PRÁTICA, APENAS EM CASOS MUITO CRÍTICO.
		Runtime.getRuntime().gc();
		
		System.out.println("Contatos removido da memória...!!!");
		
		obterMemoriaUsada();
		
		/*====================================================================================================
		 * EXISTE A 'JVISUALVM' FERRAMENTA DE PROFILING PARA MONITORAR O USO DA MEMÓRIA.
		 * PODE SER EXECUTADA PELO 'DOS' OU EXECUTAR O JVISUALVM.JAR NO DIRETÓRIO EM QUE O JAVA FOI INSTALADO
		 ======================================================================================================*/
	}

}
