package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class LeituraExibicao {
	public static void main(String[] args) {
		
		ArrayList <Integer> valores = new ArrayList<Integer>();
		Scanner leitor = new Scanner(System.in);
		

		while( valores.size() < 5 ) {
			System.out.println("Digite o " + (valores.size()+1) + " valor : " );
			Integer valor = leitor.nextInt();
			valores.add(valor);
		}
		
		for( Integer x: valores )
			System.out.println( x );
		
	}
}
