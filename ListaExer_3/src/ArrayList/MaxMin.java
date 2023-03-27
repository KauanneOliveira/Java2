package ArrayList;

import java.util.*;

public class MaxMin {
	public static void main(String[] args) {
		
		ArrayList<Integer> valores = new ArrayList<Integer>();
		
		Random random = new Random(); // a classe Random gerar um fluxo de números pseudo-aleatórios
		
		do {
			valores.add( random.nextInt(100)); //está adicionando números aleatórios (podendo ser números até 100) em valores
		}
		while( valores.size() < 10 );
		
		System.out.println( "Valores: " +valores);
		
		Integer maior = Collections.max(valores);
		
		Integer menor = Collections.min(valores);
		
		System.out.println("Maior valor: " + maior );
		
		System.out.println("Menor valor: " + menor );
	}
}
