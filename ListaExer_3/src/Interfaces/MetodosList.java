package Interfaces;

import java.util.*;

public class MetodosList {
	public static void main(String[] args) {	
		
		//ArrayList é uma classe genérica usada para criar coleções 
		List<Integer> lista = new ArrayList<Integer>();  // na hora de declara vc pode declarar com a interface, mas na hora de instanciar vc só pode instanciar com uma implementação dessa interface(ou seja, uma classe dela)			
                   
		// o método add() adiciona um elemento especifico no final desta lista( retorna um boolean)		
		System.out.println( lista.add(10) ); // true 
		System.out.println( lista.add(11) ); // true	
		System.out.println( lista.add(12) ); //true
		lista.add(3, 10); //está adicionando 10 no índice 3
		System.out.println(lista); // saída: [10, 11, 12, 10]

		//método addAll adiciona no vetor os elementos do vetor que foi passado como argumento do método( retorna um boolean)
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		
		lista2.add(3);
		lista2.add(3);
		lista2.add(3);
		
		System.out.println( lista.addAll(lista2) ); //true //está adicionando todos os elementos da lista2 na lista
		
		for( Integer x: lista )
			System.out.print( x + " "); //10 11 12 10 3 3 3
		
		
		// em casos de duplicada usamos o indexOf e o lastIndexOf para retornar o índice do primeiro ou do último número duplicado 
		
		// método indexOf retorna posição da primeira ocorrência do elemento, ou -1 se não encontrar( retorna um  int)
		System.out.println( "\nposição no vetor: " + lista.indexOf(3) );  //posição no vetor: 4
		
		// método lastIndexOf retorna posição da última ocorrência do elemento, ou -1 se não encontrar( retorna um  int)
		System.out.println( "posição no vetor: " + lista.lastIndexOf(3) ); //posição no vetor: 6
		
		
		//método sort classifica esta lista de acordo com a ordem especifica do usuário(retorna void)
		Collections.sort(lista);
		System.out.println(lista); //[3, 3, 3, 10, 10, 11, 12]
				
		
		// método retainAll mantém os elementos que tem nos dois vetores e exclui o restante (retorna um boolean)
		ArrayList<Integer> lista3 = new ArrayList<Integer>();
		lista3.add(10);
		lista3.add(12);
		
		lista.retainAll(lista3);
		
		for( Integer x: lista )
			System.out.print( x + " " );  // 10 12 10
		 
		
		// remove todos os elementos desta lista(retorna um void)
		lista.clear(); 			
		System.out.println("\n" +lista); //saída: []
		
	}
}
