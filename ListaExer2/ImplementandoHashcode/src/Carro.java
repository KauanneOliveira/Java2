
public class Carro {
	
	private String modelo;
	
	public Carro(String modelo) {
		this.modelo= modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo( String modelo) {
		this.modelo= modelo;
	}
	
	public String toString() {
		return "[ modelo: " +this.modelo+ "]";
	}
	
	public int hashCode() {
		final int prime= 13; //o 13 é colocado na conta do hashcode, pq se fazer contas matemáticas com número primo gera uma execução mais rápido, mas pode ser outro número primo sem problema. 
		int result= 1;
		result= prime* result + ((modelo == null) ? 0 : modelo.hashCode() ); // "?" é uma condição ternária, se for verdadeira executa o 0 e se for false executa o modelo.hashcode
		return result;
	}
}
