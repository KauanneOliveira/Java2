package ImplementandoEquals;

public class TesteEquals {
	public static void main(String args[]) {
		
		Carro palio = new Carro("Palio");
		
		Carro gol = new Carro("Gol");
		
		Carro fusca = new Carro("Gol");
		
		System.out.println(palio.equals(gol));
		
		System.out.println(gol.equals(fusca));
	}
}
