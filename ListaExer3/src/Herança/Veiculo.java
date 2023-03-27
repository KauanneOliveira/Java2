package Herança;

public class Veiculo {

		private String placa;
		
		public Veiculo() {
			this.placa= "";
		}
		
		public Veiculo( String placa ) {
			this.placa= placa;
		}
		
		public String getPlaca() {
			return placa;
		}
		
		public void setPlaca( String placa ) {
			this.placa= placa;
		}

		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((placa == null) ? 0 : placa.hashCode());
			return result;
		}

		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Veiculo other = (Veiculo) obj;
			if (placa == null) {
				if (other.placa != null)
					return false;
			} else if (!placa.equals(other.placa))
				return false;
			return true;
		}
		
		public String toString() {
			return "[placa=" + placa + "]"; 
		}
		
		
}
