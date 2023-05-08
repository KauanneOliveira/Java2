package Herança;

public class Teste {
	public static void main(String[] args) {
		
		RG rg1 = new RG("123456789", 3, 9, 2002);
		RG rg2 = new RG("012345678", 17, 1, 2012);
		RG rg3 = new RG("123456789", 3, 9, 2002); 
		
		System.out.println("RG 1 = RG 2: " +rg1.equals(rg2) ); //RG 1 = RG 2: false
		System.out.println("RG 1 = RG 3: " +rg1.equals(rg3) ); //RG 1 = RG 3: true
		
		System.out.println();
		
		System.out.println("RG 1: " +rg1.toString()+ ", hashCode: " +rg1.hashCode() ); // RG 1: [numero=123456789, nascimento=2002-09-03], hashCode: -1740256749
		System.out.println("RG 2: " +rg2.toString()+ ", hashCode: " +rg2.hashCode() ); // RG 2: [numero=012345678, nascimento=2012-01-17], hashCode: 1702886980
		System.out.println("RG 3: " +rg3.toString()+ ", hashCode: " +rg3.hashCode() ); // RG 3: [numero=123456789, nascimento=2002-09-03], hashCode: -1740256749
		
		System.out.println();
		System.out.println();
		
		
		Pessoa p1 = new Pessoa("Zendaya", "123456789", 3, 9, 2002);
		Pessoa p2 = new Pessoa("Rue", "012345678", 17, 1, 2012);
		Pessoa p3 = new Pessoa("MJ", "123456789", 3, 9, 2002); 
		
		System.out.println("Pessoa 1 = Pessoa 2: " +p1.equals(p2) ); //Pessoa 1 = Pessoa 2: false
		System.out.println("Pessoa 1 = Pessoa 3: " +p1.equals(p3) ); //Pessoa 1 = Pessoa 3: false
		
		System.out.println();
		
		System.out.println("Pessoa 1: " +p1.toString()+ ", hashCode: " +p1.hashCode() ); // Pessoa 1: [nome=Zendaya, identidade=[numero=123456789, nascimento=2002-09-03]], hashCode: -1141190314
		System.out.println("Pessoa 2: " +p2.toString()+ ", hashCode: " +p2.hashCode() ); // Pessoa 2: [nome=Rue, identidade=[numero=012345678, nascimento=2012-01-17]], hashCode: 1249972319
		System.out.println("Pessoa 3: " +p3.toString()+ ", hashCode: " +p3.hashCode() ); //Pessoa 3: [nome=MJ, identidade=[numero=123456789, nascimento=2002-09-03]], hashCode: 1886619051
		
		System.out.println();
		System.out.println();
		
		Aluno a1 = new Aluno("Zendaya", "123456789", 3, 9, 2002,"sp12345");
		Aluno a2 = new Aluno("Rue", "012345678", 17, 1, 2012, "sp54321");
		Aluno a3 = new Aluno("MJ", "123456789", 3, 9, 2002, "sp12345"); 
		
		System.out.println("Aluno 1 = Aluno 2: " +a1.equals(a2) ); //Aluno 1 = Aluno 2: false
		System.out.println("Aluno 1 = Aluno 3: " +a1.equals(a3) ); //Aluno 1 = Aluno 3: false
		
		System.out.println();
		
		System.out.println("Aluno 1: " +a1.toString()+ ", hashCode: " +a1.hashCode() ); // Aluno 1: [nome=Zendaya, identidade=[numero=123456789, nascimento=2002-09-03]][prontuario=sp12345], hashCode: 1219804512
		System.out.println("Aluno 2: " +a2.toString()+ ", hashCode: " +a2.hashCode() ); // Aluno 2: [nome=Rue, identidade=[numero=012345678, nascimento=2012-01-17]][prontuario=sp54321], hashCode: -1959811593
		System.out.println("Aluno 3: " +a3.toString()+ ", hashCode: " +a3.hashCode() ); //Aluno 3: [nome=MJ, identidade=[numero=123456789, nascimento=2002-09-03]][prontuario=sp12345], hashCode: 592614315
	}
}