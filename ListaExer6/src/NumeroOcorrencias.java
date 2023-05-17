import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NumeroOcorrencias {

	public static void main(String args[]) {
	
		HashMap<String, Integer> mapa = new HashMap<String,Integer>();
		HashSet<String> valores = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		String frase = "";
		
		do {
			
			System.out.println("Digite a frase:");			
			frase = sc.nextLine();
			//quebrando a frase em blocos, sendo cada bloco uma palavra
			StringTokenizer st = new StringTokenizer(frase);
			//enquanto st tem mais elementos...
			while( st.hasMoreElements() )
				valores.add( st.nextToken() );
			
			if( !frase.isBlank() )
				mapa.put(frase, valores.size() ); //mapa = frase e o tanto de palavras que tem
			
			//tá limpando para não contar com esses valores na prózima frase
			valores.clear();
		}
		while( ! frase.isBlank() );			
		
		for( String f: mapa.keySet() )
			System.out.println( f + " - " + mapa.get(f) );		
		
	}
	
}
