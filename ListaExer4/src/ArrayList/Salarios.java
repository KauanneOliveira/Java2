package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Salarios {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		ArrayList<Double> lista = new ArrayList<Double>();
		
		Double valor = 0.0;
		
		Double reajuste = 0.0;
		
		do {
			System.out.println("Digite o salario (quando acabar digite -1): " );
			valor = sc.nextDouble();
			if( valor >= 0 )
				lista.add(valor);
		}
		while( valor != -1  );
		
		System.out.println("\n\nDigite o valor do reajuste: " );
		reajuste = sc.nextDouble();

		
		for(Double x: lista) {
			System.out.println( "Salário ajustado: " +x );
		}
		
	}

}