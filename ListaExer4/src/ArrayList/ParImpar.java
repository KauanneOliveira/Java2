import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ParImpar {

	public static void main (String[] args) {
		
		ArrayList<Integer> par = new ArrayList<Integer>();
		ArrayList<Integer> impar = new ArrayList<Integer>();
		Integer numero = null;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println( "Digite um número positivo(para terminar a entrada insira o valor -1): ");;
			numero = sc.nextInt();			
			if( numero >= 0 ) {
				if( numero % 2 == 0) {
					par.add( numero );
				}
				else {
					impar.add( numero );
				}
			}
		}
		while( numero >= 0 );
		
		System.out.println();
		System.out.println();
		
		Collections.sort( par );
		Collections.sort( impar );
		
		System.out.println("Vetor com os números pares");
		for(Integer p : par) {
			System.out.print( p + " " );
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Vetor com os números ímpares");
		for(Integer i : impar) {
			System.out.print( i + " " );
		}	
	}	
}
