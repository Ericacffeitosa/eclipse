package br.com.ericacffeitosa.git;
public class MainThread {
//Gera 4 Threads
	public static void main(String[] args) { 
		//Thread será responsável por excutar no processador de forma alternada.
		new Thread (new ContadorRunnable(new Arquivo("Thread #1", 1, 100000000))).start(); 
		new Thread (new ContadorRunnable(new Arquivo("Thread #2", 100000001, 200000000))).start();
		new Thread (new ContadorRunnable(new Arquivo("Thread #3", 200000001, 300000000))).start();
		new Thread (new ContadorRunnable(new Arquivo("Thread #4", 300000001, 400000000))).start();
	}
}