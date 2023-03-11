
public class Carro {
	
	private String marca;
	private String modelo;
	private String cor;
	
	public Carro() {
		this.marca= "";
		this.modelo= "";
		this.cor= "";
	}
	
	public Carro(String marca, String modelo,String cor) {
		this.marca= marca;
		this.modelo= modelo;
		this.cor= cor;
	}
	
	public Carro(String marca, String cor) {
		this.marca= marca;
		this.cor= cor;
		this.modelo= "";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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
	
	public String toString() {
		return "[marca: " + this.marca + ", modelo: " +this.modelo+ ",cor: " + this.cor + "]";
	}
	
	
	public boolean equals( Object obj) {
		
		if(this == obj)
			return true;
		
		if(obj == null)
			return false;
		
		if(this.getClass() != obj.getClass() )
			return false;
		
		Carro other = (Carro) obj;
		
		if(this.marca == null) {
			if(other.marca != null)
				return false;
		}
		else if( ! this.marca.equals(other.marca) )
			return false;
		
		if(this.modelo == null) {
			if(other.modelo != null)
				return false;
		}
		else if( ! this.modelo.equals(other.modelo) )
			return false;
		
		if(this.cor == null) {
			if(other.cor != null)
				return false;
		}
		else if( ! this.cor.equals(other.cor) )
			return false;
		
		return true;
	}
	
	public int hashCode() {
		int primo= 5;
		int total= 1;
		total= primo * total + (marca == null ? 0 : marca.hashCode() );
		total= primo * total + (modelo == null ? 0 : modelo.hashCode() );
		total= primo * total + (cor == null ? 0 : cor.hashCode() );
		
		return total;
	}
	
}
