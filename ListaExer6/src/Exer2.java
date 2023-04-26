import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exer2 {
	
	public static void main(String[] args) {
	
	String frase = "";
	Scanner sc = new Scanner(System.in);
	HashSet<String> repetida = new HashSet<String>();	
	
	System.out.println("Digite uma frase");
	frase = sc.nextLine();
	
	StringTokenizer st = new StringTokenizer(frase); //vai separar a frase em blocos, sendo que cada bloco será uma palavra
	
	while( st.hasMoreElements() ) //pega ps próximos elementos
		repetida.add( st.nextToken() ); //pega o elemento que o hasMoreElements tá apontando
	
	
	for( String r : repetida) //por repetida ser HashSet ela não vai armazenar duplicadas, ao exibir no system do size, vai ter apenas as palavras não repetidas  
		System.out.println( r );
	
	System.out.println("Número de palavras não repetidas: " +repetida.size() ); 
	
	}
}
