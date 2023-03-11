
public class TesteHashcode {

	public static void main(String[] args) {
	
		Carro  ca1 = new Carro("Fusca");
		Carro  ca2 = new Carro("Ferrari");
		Carro  ca3 = new Carro("Ferrari");
		
		System.out.println("carro 1: " +ca1.toString()+ ", hashCode: " +ca1.hashCode() );
		//carro 1: [ modelo: Fusca], hashCode: 68245711
		System.out.println("carro 2: " +ca2.toString()+ ", hashCode: " +ca2.hashCode() );
		//carro 2: [ modelo: Ferrari], hashCode: 701066918
		System.out.println("carro 3: " +ca3.toString()+ ", hashCode: " +ca3.hashCode() );
		//carro 3: [ modelo: Ferrari], hashCode: 701066918
	}
}