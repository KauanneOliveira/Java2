import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class DataDiaSemana {

	public static void main(String[] args) {
		
		HashMap<LocalDate,String> mapa = new HashMap<LocalDate,String>();
		Scanner sc = new Scanner(System.in);
		Integer dia; Integer mes; Integer ano;
		
		do {
			
			System.out.println("Digite o dia: ");
			dia = sc.nextInt();
			System.out.println("Digite o mes: ");
			mes = sc.nextInt();
			System.out.println("Digite o ano: ");
			ano = sc.nextInt();
			
			if(  dia > 0 && mes > 0 && ano > 0 ) {
				LocalDate data = LocalDate.of(ano, mes, dia); //armazena dia, mes e ano em só uma variavel 
				mapa.put( data, data.getDayOfWeek().name() ); // pega o nome do dia da semana (Monday, Saturday...) 
			}
			
		}
		while( dia > 0 && mes > 0 && ano > 0 );

		for( LocalDate x: mapa.keySet() )
			System.out.println( x + " - " + mapa.get(x) );
	}

}
