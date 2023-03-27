package Herança;

public class Teste {
	public static void main(String[] args) {
		
		Carro c1 = new Carro("BBR5T90", "Uno", "Rosa");
		Carro c2 = new Carro("ABC1D23", "Touro", "Preto");
		Carro c3 = new Carro("BBR5T90", "Uno", "Rosa"); 
		
		System.out.println("Carro 1 = Carro 2: " +c1.equals(c2) ); //Carro 1 = Carro 2: false
		System.out.println("Carro 1 = Carro 3: " +c1.equals(c3) ); //Carro 1 = Carro 3: true
		
		System.out.println("Carro 1: " +c1.toString()+ ", hashCode: " +c1.hashCode() ); // Carro 1: [placa=BBR5T90] [modelo=Uno, cor=Rosa], hashCode: 1465241682
		System.out.println("Carro 2: " +c2.toString()+ ", hashCode: " +c2.hashCode() ); // Carro 2: [placa=ABC1D23] [modelo=Touro, cor=Preto], hashCode: 821078606
		System.out.println("Carro 3: " +c3.toString()+ ", hashCode: " +c3.hashCode() ); // Carro 3: [placa=BBR5T90] [modelo=Uno, cor=Rosa], hashCode: 1465241682
	}
}
