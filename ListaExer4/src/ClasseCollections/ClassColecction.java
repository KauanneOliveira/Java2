package ClasseCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ClassColecction {

	public static void main(String[] args) {
		
		// A classe java.util.Collections é uma classe utilitária introduzida no Java 1.2 
		// ela fornece métodos estáticos para auxiliar na manipulação de objetos armazenados em coleções Java
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		Random random = new Random();
		
		do {
			lista.add( random.nextInt(1, 10)); //está adicionando números aleatórios de 1 até 10
		}
		while( lista.size() < 5 );
			
		
		System.out.println("Menor valor: " + Collections.min(lista) ); // min: retorna o menor valor do vetor
		
		System.out.println("Maior valor: " + Collections.max(lista) ); // max: seleciona o maior valor do vetor 
		
		for( Integer i: lista )
			System.out.println( i );
		
		System.out.println();

		
		Collections.sort( lista, Collections.reverseOrder() ); // reverseOrder: coloca os elementos em ordem inversa
		
		for( Integer i: lista )
			System.out.println( i );
		
		System.out.println();
		
		Collections.sort( lista ); // sort: ordena em ordem crescentre os elementos no vetor
		
		for( Integer i: lista )
			System.out.println( i );
		
		System.out.println();
		
		
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		
		lista2.add(500);
		lista2.add(500);
		
		Collections.copy( lista, lista2 ); // copy: copia os elementos de um vetor para outro vetor, os elementos da list2 são sobrepostos na lista
		
		for( Integer i: lista )
			System.out.println( i );
		
		
		
	}

}