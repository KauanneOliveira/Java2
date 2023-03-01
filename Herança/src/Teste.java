
public class Teste {
	
	public static void main(String args[]) {
		
		Pessoa p1 = new Pessoa("Kauanne", 24, 8, 2024);
		
		System.out.println( p1.toString() );
		
		Funcionario f1 = new Funcionario("Kauanne", 24, 8, 2024, "123456789", "12345678912");
		
		System.out.println( f1.toString() );
	}
}
