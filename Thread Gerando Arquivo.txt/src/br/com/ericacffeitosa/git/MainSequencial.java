package br.com.ericacffeitosa.git;
import java.io.IOException;

public class MainSequencial {

	public static void main(String[] args) throws IOException {
		long inicio = System.currentTimeMillis(); //retorna tempo inicial atual em milissegundos
		new Arquivo("Sequencial", 0, 400000000).gerarArquivo(); //chama método da classo Arquivo
		long fim = System.currentTimeMillis(); //retorna tempo final atual em milissegundos
		
		long tempo = fim - inicio; //Tempo de execução
		
		System.out.printf("Tempo: %d milissegundos\n", tempo);
	}
}