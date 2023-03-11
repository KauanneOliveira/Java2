
public class Relogio {
	
	private String marca;
	private String cor;
	private Boolean tamanho;
	
	public Relogio() {
		this.marca= "";
		this.cor= "";
		this.tamanho= false;
	}
	
	public Relogio(String marca, String cor, Boolean tamanho) {
		this.marca= marca;
		this.cor= cor;
		this.tamanho= tamanho;
	}
	
	public Relogio(String cor) {
		this.cor= cor;
		this.marca= "";
		this.tamanho= false;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca= marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Boolean getTamanho() {
		return tamanho;
	}

	public void setTamanho(Boolean tamanho) {
		this.tamanho = tamanho;
	}
	
	public boolean equals( Object obj) {
		
		if( this == obj)
			return true;
		
		if( obj == null)
			return false;
		
		if( this.getClass() != obj.getClass() )
			return false;
		
		Relogio other = (Relogio) obj;
		
		if( marca == null) {
			if( other.marca != null)
				return false;
		}
		else if( ! marca.equals(other.marca) )
			return false;
		
		if( cor == null) {
			if( other.cor != null)
				return false;
		}
		else if( ! cor.equals(other.cor) )
			return false;
		
		if( tamanho == null) {
			if( other.tamanho != null)
				return false;
		}
		else if( ! tamanho.equals(other.tamanho) )
			return false;
		
		return true;
	}
	
	public int hashCode() {
		final int primo= 13;
		int total = 1;
		total= primo * total + ((marca == null) ? 0 : marca.hashCode() );
		total= primo * total + ((cor == null) ? 0 : cor.hashCode() );
		total= primo * total + ((tamanho == null) ? 0 : tamanho.hashCode() );
		
		return total;
	}
	
	public String toString() {
		return "[ marca: " +this.marca+ ", cor: " +this.cor+ ", tamanho: " +this.tamanho+ "]";
	}
	
}
