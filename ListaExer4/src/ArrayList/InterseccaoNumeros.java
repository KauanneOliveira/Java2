import java.util.ArrayList;
import java.util.Scanner;

public class InterseccaoNumeros {

	public static void main (String[] args) {
		
		ArrayList<Integer> lista1 = new ArrayList<Integer>(); 
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		Integer numero = null;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println( "Digite um número para ser armazenado na primeira lista(quando finalizar -1):  ");
			numero = sc.nextInt();
			lista1.add( numero );
		}
		while( numero != -1 );
		
		do {
			System.out.println( "Digite um número para ser armazenado na segunda lista(quando finalizar -1):  ");
			numero = sc.nextInt();
			lista2.add( numero );
		}
		while( lista2.size() < lista1.size() - 1 );
		
		System.out.println();
		
		lista1.retainAll(lista2);
		
		System.out.println("Os números que são repetidos nas duas listas são:" );
		
		for(Integer x: lista1) {
			System.out.println( x );
		}
	}
}
