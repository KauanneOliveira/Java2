package Interfaces;

import java.util.HashSet;
import java.util.Iterator;

public class MetodosSet { 
	public static void main(String[] args) {
		
		HashSet<Integer> lista = new HashSet<Integer>();  //HashSet � uma classe usada para criar uma cole��o 
		
		// m�todo add adiciona elemento ao final do vetor( retorna um boolean)
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		
		for( Integer x: lista )
			System.out.println( x );	// 1...2...3...4
		
		
		//o m�todo size retorna o n�mero de elementos neste conjunto( retorna um int )
		System.out.println( lista.size() ); //4
		
		
		// m�todo contains verifica se existe o elemento armazenado no vetor(retorna um boolean)
		System.out.println( lista.contains(5) ); //false
		System.out.println( lista.contains(1) ); //true
		
		
		// m�todo containsAll verifica se existe os elementos armazenados no vetor(retorna um boolean, retorna true caso encontre TODOS os elementos e false caso contr�rio)
		HashSet<Integer> lista2 = new HashSet<Integer>();
		lista2.add(1);
		lista2.add(2);
		
		HashSet<Integer> lista3 = new HashSet<Integer>();
		lista3.add(5);
		lista3.add(2);
		
		System.out.println( lista.containsAll( lista2 ) ); //true
		System.out.println( lista.containsAll( lista3 ) ); //false
		
		
		//o m�todo isEmpty retorna verdade se este conjunto n�o contiver elementos(retorna um boolean)
		HashSet<Integer> num = new HashSet<Integer>();
		
		System.out.println( lista.isEmpty() ); //false
		System.out.println( num.isEmpty() ); //true
		
		
		// m�todo iterator retorna objeto Iterator utilizado para navegar entre os objetos do vetor
		Iterator<Integer> it = lista.iterator();
			
		while( it.hasNext() ) { //hasNext pula de elemento�a elemento 
			System.out.println( it.next() ); //next vai carregar o elemento //1...2...3...4
		}
		
		
		// m�todo removeAll remove todos os elementos armazenados no vetor passado como argumento (retorna um boolean)
		lista.removeAll(lista2); //est� removendo todos os elemenos da lista que tem na lista2 
		
		for( Integer x: lista2 )
			System.out.println( x ); //1...2
		
	}
}
