
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
		final int prime= 13; //o 13 � colocado na conta do hashcode, pq se fazer contas matem�ticas com n�mero primo gera uma execu��o mais r�pido, mas pode ser outro n�mero primo sem problema. 
		int result= 1;
		result= prime* result + ((modelo == null) ? 0 : modelo.hashCode() ); // "?" � uma condi��o tern�ria, se for verdadeira executa o 0 e se for false executa o modelo.hashcode
		return result;
	}
}
