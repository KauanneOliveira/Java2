import java.util.Objects;

public class ClassObject {
public static void main(String[] args) {
		
		// A classe java.util.Objects é uma classe introduzida no Java 7. 
		// Fornecer métodos estáticos para auxiliar na manipulação de objetos em Java. 
		// Essa clase faz a comparação entre dois Objects, e retorna true se os objetos forem o mesmo, e false se não forem o mesmo		
		
		String aluno = "Kauanne Oliveira";
		String aluno2 = "Valeria Nascimento";
		String aluno3 = "Fernando Ferreira";
		String aluno4 = "Kauanne Oliveira";
		
		System.out.println( Objects.equals( aluno, aluno2 ) ); //false
		System.out.println( Objects.equals( aluno, aluno4 ) ); //true
		
		//método hash gera um código de hash para uma sequência de valores de entrada.
		System.out.println( Objects.hash( aluno) ) ; //125585273
		System.out.println( Objects.hash( aluno2) ); //-1698948956 
		System.out.println( Objects.hash( aluno2, aluno3) ); //904169403
	}
}
