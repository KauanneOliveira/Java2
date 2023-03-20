import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
	
	private ArrayList <Carro> lista;
	private Scanner leitura;
	
	public Cadastro() {
		
		lista = new ArrayList<Carro>();
		leitura = new Scanner(System.in);
		Integer opcao = 0;
		
		do {
			
			System.out.println("\t1 - Cadastrar");
			System.out.println("\t2 - Listar");
			System.out.println("\t3 - Sair");
			System.out.print("\t1 - Digite a sua opção: ");
			opcao = leitura.nextInt();
			
			switch(opcao) {
			
				case 1 :
					cadastrar();
					break;
				case 2:
					listar();
					break;
				case 3:
					sair();
					break;
			}
				System.out.println("---------------------------------------------------------");
		} while( opcao < 3);
	}
	
	public void cadastrar() {
		
		System.out.println("\n\t\tCadastrar");
		System.out.println("Digite a marca:");
		String marca = leitura.next();
		System.out.println("Digite o modelo:");
		String modelo = leitura.next();
		System.out.println("Digite a cor:");
		String cor = leitura.next();
		
		lista.add( new Carro (marca, modelo, cor) );
	}
	
	public void listar() {
		System.out.println("\n\t\tListar");
		for(Carro x: lista) 
			System.out.println( x.toString() );
	}
	
	public void sair() {
		System.out.println("\nSaindo...");
	}
	
}
