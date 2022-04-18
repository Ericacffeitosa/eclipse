package br.com.ericacffeitosa.git;

import java.io.IOException;

public class ContadorRunnable implements Runnable { 
	//Implementamos a Biblioteca Runnable para implementar run()
	
	private Arquivo arquivo;
	public ContadorRunnable (Arquivo arquivo) { //contrutor classe Arquivo
		this.arquivo = arquivo;
	}
	public void run() { //run() responsavel por executar a tarefa da Thread
		long inicio = System.currentTimeMillis(); //retorna tempo inicial atual em milissegundos
		try {
			arquivo.gerarArquivo(); 
		} catch (IOException e) {
			e.printStackTrace();
		}	
		long fim = System.currentTimeMillis(); //retorna tempo final atual em milissegundos
		
		long tempo = fim - inicio; //Tempo de execução

		System.out.printf("Tempo: %d milissegundos\n", tempo );
	}
}