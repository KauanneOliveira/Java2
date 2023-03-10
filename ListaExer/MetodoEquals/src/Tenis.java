
public class Tenis {
	
	private String marca;
	private String cor;
	private Integer tamanho;
	
	public Tenis() {
		this.marca= "";
		this.cor= "";
		this.tamanho= 0;
	}
	
	public Tenis( String marca, String cor, Integer tamanho ) {
		this.marca= marca;
		this.cor= cor;
		this.tamanho= tamanho;
	}
	
	public Tenis(String marca) {
		this.marca= marca;
		this.cor= "";
		this.tamanho= 0;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String toString() {
		return "[ marca: " +this.marca+ ", cor: " +this.cor+ ", tamanho: " +this.tamanho+ "]";
	}
	
	public boolean equals(Object obj) {
		
		if( this == obj )
			return true;
		
		if( obj == null )
			return false;
		
		if( this.getClass() != obj.getClass() )
			return false;
		
		Tenis other = (Tenis) obj;
		
		if( this.marca == null ) {
			if( other.marca != null)
				return false;
		}
		else if( ! this.marca.equals(other.marca) )
			return false;
		
		if( this.cor == null ) {
			if( other.cor != null)
				return false;
		}
		else if( ! this.cor.equals(other.cor) )
			return false;
		
		if( this.tamanho == null ) {
			if( other.tamanho != null)
				return false;
		}
		else if( ! this.tamanho.equals(other.tamanho) )
			return false;
		
		return true;
	}
}
