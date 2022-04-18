package br.com.ericacffeitosa.git;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
//Classe que gera um arquivo txt com os números sequenciais. 
public class Arquivo {
	
	private String nome;
	private int inicio;
	private int fim;
	
	public Arquivo(String nome, int inicio, int fim) { //Construtor
		this.nome = nome;
		this.inicio = inicio;
		this.fim = fim;
	}	
	public void gerarArquivo() throws IOException { //Método gerar Arquivo
		File file = Paths.get("c:\\arquivos\\" + nome + ".txt").toFile();
		if (file.exists()) {
			file.delete();  
		}
		file.createNewFile();
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		for (int i=inicio; i<=fim; i++) {
			bw.write(i + "\n");
		}
		bw.flush();
		bw.close();
	}
}