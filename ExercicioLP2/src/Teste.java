
public class Teste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("Ferrari", "Ferrari", "Azul");
		Carro c2 = new Carro("Fiat", "Touro", "Preto");
		Carro c3 = new Carro("Ferrari", "Ferrari", "Azul");
		
		System.out.println( c1.equals(c2) );
		System.out.println( c1.equals(c3) );
		
		System.out.println( c1.hashCode() );
		System.out.println( c2.hashCode() );
		System.out.println( c3.hashCode() );
	}

}
