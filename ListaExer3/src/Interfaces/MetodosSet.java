package Interfaces;

import java.util.HashSet;
import java.util.Iterator;

public class MetodosSet { 
	public static void main(String[] args) {
		
		HashSet<Integer> lista = new HashSet<Integer>();  //HashSet é uma classe usada para criar uma coleção 
		
		// método add adiciona elemento ao final do vetor( retorna um boolean)
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		
		for( Integer x: lista )
			System.out.println( x );	// 1...2...3...4
		
		
		//o método size retorna o número de elementos neste conjunto( retorna um int )
		System.out.println( lista.size() ); //4
		
		
		// método contains verifica se existe o elemento armazenado no vetor(retorna um boolean)
		System.out.println( lista.contains(5) ); //false
		System.out.println( lista.contains(1) ); //true
		
		
		// método containsAll verifica se existe os elementos armazenados no vetor(retorna um boolean, retorna true caso encontre TODOS os elementos e false caso contrário)
		HashSet<Integer> lista2 = new HashSet<Integer>();
		lista2.add(1);
		lista2.add(2);
		
		HashSet<Integer> lista3 = new HashSet<Integer>();
		lista3.add(5);
		lista3.add(2);
		
		System.out.println( lista.containsAll( lista2 ) ); //true
		System.out.println( lista.containsAll( lista3 ) ); //false
		
		
		//o método isEmpty retorna verdade se este conjunto não contiver elementos(retorna um boolean)
		HashSet<Integer> num = new HashSet<Integer>();
		
		System.out.println( lista.isEmpty() ); //false
		System.out.println( num.isEmpty() ); //true
		
		
		// método iterator retorna objeto Iterator utilizado para navegar entre os objetos do vetor
		Iterator<Integer> it = lista.iterator();
			
		while( it.hasNext() ) { //hasNext pula de elemento a elemento 
			System.out.println( it.next() ); //next vai carregar o elemento //1...2...3...4
		}
		
		
		// método removeAll remove todos os elementos armazenados no vetor passado como argumento (retorna um boolean)
		lista.removeAll(lista2); //está removendo todos os elemenos da lista que tem na lista2 
		
		for( Integer x: lista2 )
			System.out.println( x ); //1...2
		
	}
}
