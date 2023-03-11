
public class Teste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("Ferrari", "Ferrari", "Azul");
		Carro c2 = new Carro("Fiat", "Touro", "Preto");
		Carro c3 = new Carro("Ferrari", "Ferrari", "Azul"); 
		
		System.out.println("Carro 1 = Carro 2: " +c1.equals(c2) ); //Carro 1 = Carro 2: false
		System.out.println("Carro 1 = Carro 3: " +c1.equals(c3) ); //Carro 1 = Carro 3: true
		
		System.out.println("Carro 1: " +c1.toString()+ ", hashCode: " +c1.hashCode() ); //Carro 1: [marca: Ferrari, modelo: Ferrari,cor: Azul], hashCode: -440771813
		System.out.println("Carro 2: " +c2.toString()+ ", hashCode: " +c2.hashCode() ); //Carro 2: [marca: Fiat, modelo: Touro,cor: Preto], hashCode: 537106932
		System.out.println("Carro 3: " +c3.toString()+ ", hashCode: " +c3.hashCode() ); //Carro 3: [marca: Ferrari, modelo: Ferrari,cor: Azul], hashCode: -440771813
		System.out.println();
		
		
		Navio nv1 = new Navio("Navio KD", 6, 9, 2023);
		Navio nv2 = new Navio("Raio Negro", 10, 2, 2022);
		Navio nv3 = new Navio("Navio KD", 6, 9, 2023);
		
		System.out.println("Navio 1 = Navio 2: " +nv1.equals(nv2) ); //Navio 1 = Navio 2: false
		System.out.println("Navio 1 = Navio 3: " +nv1.equals(nv3) ); //Navio 1 = Navio 3: true
		
		System.out.println("Navio 1: " +nv1.toString()+ ", hashCode: " +nv1.hashCode() ); //Navio 1: [ nome: Navio KD, Funcionamento: 2023-09-06], hashCode: -1885554785
		System.out.println("Navio 2: " +nv2.toString()+ ", hashCode: " +nv2.hashCode() ); //Navio 2: [ nome: Raio Negro, Funcionamento: 2022-02-10], hashCode: -1599760691
		System.out.println("Navio 3: " +nv3.toString()+ ", hashCode: " +nv3.hashCode() ); //Navio 3: [ nome: Navio KD, Funcionamento: 2023-09-06], hashCode: -1885554785
		System.out.println();
		
		
		Relogio re1 = new Relogio("Cássio", "Rosa", true);
		Relogio re2 = new Relogio("Magnum", "Dourado", true);
		Relogio re3 = new Relogio("Preto");
		Relogio re4 = new Relogio("Magnum", "Dourado", true);
		
		System.out.println("Relógio 1 = Relógio 2: " +re2.equals(re1) ); //Relógio 1 = Relógio 2: false
		System.out.println("Relógio 2 = Relógio 3: " +re3.equals(re2) ); //Relógio 2 = Relógio 3: false
		System.out.println("Relógio 2 = Relógio 4: " +re2.equals(re4) ); //Relógio 2 = Relógio 4: true
		
		System.out.println("Relógio 1: " +re1.toString()+ ", hashCode: " +re1.hashCode() ); //Relógio 1: [ marca: Cássio, cor: Rosa, tamanho: true], hashCode: -861061129
		System.out.println("Relógio 2: " +re2.toString()+ ", hashCode: " +re2.hashCode() ); //Relógio 2: [ marca: Magnum, cor: Dourado, tamanho: true], hashCode: 66946851
		System.out.println("Relógio 3: " +re3.toString()+ ", hashCode: " +re3.hashCode() ); //Relógio 3: [ marca: , cor: Preto, tamanho: false], hashCode: 1005925520
		System.out.println("Relógio 4: " +re4.toString()+ ", hashCode: " +re4.hashCode() ); //Relógio 4: [ marca: Magnum, cor: Dourado, tamanho: true], hashCode: 66946851
	}
}
