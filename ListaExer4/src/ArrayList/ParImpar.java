import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ParImpar {

	public static void main (String[] args) {
		
		ArrayList<Double> par = new ArrayList<Double>();
		ArrayList<Double> impar = new ArrayList<Double>();
		Double numero = 0.0;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println( "Digite um número (para terminar a entrada insira o valor -1): ");;
			numero = sc.nextDouble();			
			
			if( numero % 2 == 0) {
				par.add( numero );
			}
			else {
				impar.add( numero );
			}
		}
		while( numero != -1 ); //como fazer para não pegar o -1 ?
		
		System.out.println();
		System.out.println();
		
		Collections.sort( par );
		Collections.sort( impar );
		
		System.out.println("Vetor com os números pares");
		for(Double p : par) {
			System.out.print( p + " " );
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Vetor com os números ímpares");
		for(Double i : impar) {
			System.out.print( i + " " );
		}
		
	}	
}
