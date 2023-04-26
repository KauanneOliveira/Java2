import java.util.HashMap;
import java.util.Scanner;

public class Exer1 {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> mapa = new HashMap<String, Integer>();
		String nomeCidade;
		Scanner sc = new Scanner(System.in);
				
		
		do {
			System.out.println("Digite um nome de uma cidade ou deixe o campo em branco para sair:");
			nomeCidade = sc.nextLine();                      //precisa do nomeCidade para a condição no do...while
			if( ! nomeCidade.isBlank())
				mapa.put(nomeCidade, nomeCidade.length() );    //vai adicionar o nomeCidade como chave e o tamanho do nomeChave vai ser o valor
		}
		while( ! nomeCidade.isBlank() );                     //se o nome for branco, não ter nada digitado
		
		for( String valor: mapa.keySet() ) {
			System.out.println( valor + "-" + mapa.get(valor) );
		}
		
	}
}
