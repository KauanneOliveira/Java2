
public class Teste {

	public static void main( String args[] ) {
	
		Pessoa p1 = new Pessoa();
		
		Pessoa p2 = new Pessoa( "Bernardo", 9, 6, 1972 );
		
		System.out.println( p2.toString() );
		
		Aluno a1 = new Aluno();
		
		Aluno a2 = new Aluno("Bernardo",9,6,1972,"sp12345");
		
		System.out.println( a2.toString() );				
	}		
}

