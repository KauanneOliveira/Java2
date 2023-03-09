package ImplementandoEquals;

public class Mobile {
	
	private String marca;
	private String modelo;
	
	public Mobile() {
		this.marca= "";
		this.modelo= "";
	}
	
	public Mobile(String marca, String modelo) {
		this.marca = marca;
		this.modelo= modelo;
	}
	
	public Mobile(String marca) {
		this.marca= marca;
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
	
	public String toString() {
		return "[marca: " +this.marca+ ", modelo: " +this.modelo+ "]";
	}
	
	public boolean equals( Object obj ) {
		
		if( this == obj )
			return true;
		
		if( obj == null )
			return false;
		
		if( this.getClass() != obj.getClass() )
			return false;
		
		Mobile other = (Mobile) obj;
		
		if( this.modelo == null) {
			if( other.modelo != null)
				return false;
		}
		else if( ! this.modelo.equals(other.modelo) )
			return false;
		
		return true;
	}
}
