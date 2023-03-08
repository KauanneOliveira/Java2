package Exer2;

import java.time.LocalDate;

public class Navio {
	
	private String nome;
	private LocalDate funcionamento;
	
	public Navio() {
		this.nome = "";
		this.funcionamento= LocalDate.now();
	}
	
	public Navio(String nome, Integer dia, Integer mes, Integer ano) {
		this.nome = nome;
		this.funcionamento= LocalDate.of(ano, mes, dia);
	}
	
	public Navio(String nome) {
		this.nome = nome;
		this.funcionamento= LocalDate.now();
	}
	
	
}
