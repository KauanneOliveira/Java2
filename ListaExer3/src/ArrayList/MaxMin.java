package ArrayList;

import java.util.*;

public class MaxMin {
	public static void main(String[] args) {
		
		ArrayList<Integer> valores = new ArrayList<Integer>();
		
		Random random = new Random(); // a classe Random gerar um fluxo de n�meros pseudo-aleat�rios
		
		do {
			valores.add( random.nextInt(100)); //est� adicionando n�meros aleat�rios (podendo ser n�meros at� 100) em valores
		}
		while( valores.size() < 10 );
		
		System.out.println( "Valores: " +valores);
		
		Integer maior = Collections.max(valores);
		
		Integer menor = Collections.min(valores);
		
		System.out.println("Maior valor: " + maior );
		
		System.out.println("Menor valor: " + menor );
	}
}
