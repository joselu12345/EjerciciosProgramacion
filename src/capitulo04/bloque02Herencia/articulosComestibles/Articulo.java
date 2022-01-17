package capitulo04.bloque02Herencia.articulosComestibles;

public class Articulo {

		protected String nombre;
		protected String codigo;
		protected double precio;

		public Articulo() {
			super();
		}

		public Articulo(String nombre, String codigo, double precio) {
			super();
			this.nombre = nombre;
			this.codigo = codigo;
			this.precio = precio;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		@Override
		public String toString() {
			return "Articulo [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + "]";
		}
		
		
		

	

}
