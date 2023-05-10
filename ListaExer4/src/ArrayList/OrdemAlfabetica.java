package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdemAlfabetica {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		String nome;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite um nome (para terminar a entrada entre com o campo vazio)" );
			nome = sc.nextLine();
			lista.add(nome);
		}
		while( ! nome.isBlank() ); //enquanto nome não for vazio
		
		//while( ! (nome.equals( "N" ) || nome.equals("n")) );
		
		Collections.sort(lista);
		
		for(String x : lista) {
			System.out.println( x );
		}
    
	}
  
}
