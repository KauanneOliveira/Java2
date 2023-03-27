package Heran�a;

public class Carro extends Veiculo {

	private String modelo;
	private String cor;
	
	public Carro() {
		super();
		this.modelo = "";
		this.cor = "";
	}
	public Carro( String placa, String modelo, String cor ) {
		super( placa );
		this.modelo = modelo;
		this.cor = cor;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode(); // tem que colocar super, para somar com o hash da placa tbm
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (!super.equals(obj) ) //em uma heran�a o segundo if � um super.equals(obj) pq a compara��o do nulo vai rolar na classe pai, a� t� puxando o equals do pai, pq se s� colocar nulo n�o vai comparar os atributos na classe pai. E � mais f�cil colocar a compara��o da placa aqui em cima, pq se a placa n�o for igual, j� n�o � o msm carro, ent�o retorna false		
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		 
		Carro other = (Carro) obj;
		
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		
		return true;
	}
	
	public String toString() {
		return super.toString() + " [modelo=" + modelo + ", cor=" + cor + "]";
	}
}