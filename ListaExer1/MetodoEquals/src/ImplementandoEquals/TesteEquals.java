package ImplementandoEquals;

public class TesteEquals {
	public static void main(String args[]) {
		
		Carro palio = new Carro("Palio");		
		Carro gol = new Carro("Gol");		
		Carro fusca = new Carro("Gol");
		
		System.out.println(palio.equals(gol)); //false
		System.out.println(gol.equals(fusca)); //true
		
		
		Mobile m1 = new Mobile("Samsung", "J5 Prime");
		Mobile m2 = new Mobile("Apple ", "iPhone 14 Pro Max");
		Mobile m3 = new Mobile("Samsung", "J5 Prime");
		
		System.out.println(m1.equals(m2)); //false
		System.out.println(m1.equals(m3)); //true
		System.out.println( m1.toString() ); //[marca: Samsung, modelo: J5 Prime]
		System.out.println( m2.toString() ); //[marca: Apple , modelo: iPhone 14 Pro Max]
		System.out.println( m3.toString() ); //[marca: Samsung, modelo: J5 Prime]
	
	}
}