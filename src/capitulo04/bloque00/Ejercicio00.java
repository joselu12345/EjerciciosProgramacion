package capitulo04.bloque00;

public class Ejercicio00 {	
		
		private int pulgadas;
		private String relacionAspecto;
		private float resolucion;
		private float contraste;
		private float brillo;
		private String conectores;
		
		
		public Ejercicio00() {
		}

		public Ejercicio00(int pulgadas, String relacionAspecto, float resolucion, float contraste, float brillo,
				String conectores) {
			
			this.pulgadas = pulgadas;
			this.relacionAspecto = relacionAspecto;
			this.resolucion = resolucion;
			this.contraste = contraste;
			this.brillo = brillo;
			this.conectores = conectores;
		}

		public int getPulgadas() {
			return pulgadas;
		}

		public void setPulgadas(int pulgadas) {
			this.pulgadas = pulgadas;
		}

		public String getRelacionAspecto() {
			return relacionAspecto;
		}

		public void setRelacionAspecto(String relacionAspecto) {
			this.relacionAspecto = relacionAspecto;
		}

		public float getResolucion() {
			return resolucion;
		}

		public void setResolucion(float resolucion) {
			this.resolucion = resolucion;
		}

		public float getContraste() {
			return contraste;
		}

		public void setContraste(float contraste) {
			this.contraste = contraste;
		}

		public float getBrillo() {
			return brillo;
		}

		public void setBrillo(float brillo) {
			this.brillo = brillo;
		}

		public String getConectores() {
			return conectores;
		}

		public void setConectores(String conectores) {
			this.conectores = conectores;
		}

		@Override
		public String toString() {
			return "Ejercicio00 [pulgadas=" + pulgadas + ", relacionAspecto=" + relacionAspecto + ", resolucion="
					+ resolucion + ", contraste=" + contraste + ", brillo=" + brillo + ", conectores=" + conectores
					+ "]";
		}
		
		public void main(String[] args) {
			
			setPulgadas(10);
			
			getPulgadas();

		}
		
		
		
		
		

	

}
