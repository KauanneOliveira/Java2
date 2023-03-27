package Interfaces;

import java.util.*;

public class MetodosList {
	public static void main(String[] args) {	
		
		//ArrayList � uma classe gen�rica usada para criar cole��es 
		List<Integer> lista = new ArrayList<Integer>();  // na hora de declara vc pode declarar com a interface, mas na hora de instanciar vc s� pode instanciar com uma implementa��o dessa interface(ou seja, uma classe dela)			
                   
		// o m�todo add() adiciona um elemento especifico no final desta lista( retorna um boolean)		
		System.out.println( lista.add(10) ); // true 
		System.out.println( lista.add(11) ); // true	
		System.out.println( lista.add(12) ); //true
		lista.add(3, 10); //est� adicionando 10 no �ndice 3
		System.out.println(lista); // sa�da: [10, 11, 12, 10]

		//m�todo addAll adiciona no vetor os elementos do vetor que foi passado como argumento do m�todo( retorna um boolean)
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		
		lista2.add(3);
		lista2.add(3);
		lista2.add(3);
		
		System.out.println( lista.addAll(lista2) ); //true //est� adicionando todos os elementos da lista2 na lista
		
		for( Integer x: lista )
			System.out.print( x + " "); //10 11 12 10 3 3 3
		
		
		// em casos de duplicada usamos o indexOf e o lastIndexOf para retornar o �ndice do primeiro ou do �ltimo n�mero duplicado 
		
		// m�todo indexOf retorna posi��o da primeira ocorr�ncia do elemento, ou -1 se n�o encontrar( retorna um  int)
		System.out.println( "\nposi��o no vetor: " + lista.indexOf(3) );  //posi��o no vetor: 4
		
		// m�todo lastIndexOf retorna posi��o da �ltima ocorr�ncia do elemento, ou -1 se n�o encontrar( retorna um  int)
		System.out.println( "posi��o no vetor: " + lista.lastIndexOf(3) ); //posi��o no vetor: 6
		
		
		//m�todo sort classifica esta lista de acordo com a ordem especifica do usu�rio(retorna void)
		Collections.sort(lista);
		System.out.println(lista); //[3, 3, 3, 10, 10, 11, 12]
				
		
		// m�todo retainAll mant�m os elementos que tem nos dois vetores e exclui o restante (retorna um boolean)
		ArrayList<Integer> lista3 = new ArrayList<Integer>();
		lista3.add(10);
		lista3.add(12);
		
		lista.retainAll(lista3);
		
		for( Integer x: lista )
			System.out.print( x + " " );  // 10 12 10
		 
		
		// remove todos os elementos desta lista(retorna um void)
		lista.clear(); 			
		System.out.println("\n" +lista); //sa�da: []
		
	}
}
