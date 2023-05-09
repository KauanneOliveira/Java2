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
			System.out.println("Digite um nome (quando não querer mais, digite [N]): " );
			nome = sc.nextLine();
			lista.add(nome);
		}
		while( nome != "N" || nome != "n"  ); //não quer parar, oq fazer ?
		
		Collections.sort(lista);
		
		for(String x : lista) {
			System.out.println( x );
		}
    
	}
  
}
