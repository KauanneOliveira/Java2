/*Escreva o c�digo fonte de um programa Java que solicite ao usu�rio o nome do
arquivo de leitura, utilizando o tratamento de exce��es para arquivos que n�o
existem, caso o arquivo n�o exista o programa deve solicitar novamente ao
usu�rio o nome do arquivo de leitura. O programa deve solicitar o nome do
arquivo de leitura at� receber um nome de arquivo que existe. Quando o
programa receber um nome de arquivo que existe, deve imprimir na tela do
computador os n�meros inteiros que representam os bytes armazenados no
arquivo.*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ArquivoLeitura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Boolean sair = false;
		do {
			try {
				
					System.out.println("Digite o nome do arquivo: ");
					String arquivo = sc.nextLine();				
					FileInputStream in = new FileInputStream(arquivo);
					sair = true;
					int c = 0;
					while( ( c = in.read() ) != -1 )
						System.out.println(c);
				
			} 
			catch (FileNotFoundException e) {
				System.out.println("Arquivo n�o encontrado !!");
			} 
			catch (IOException e) {
				System.out.println("Falha na leitura do arquivo !!");
			}
		}
		while( sair );
	}

}