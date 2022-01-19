package capitulo04.bloque02Herencia.coleccionAntiguedades;

public class Libro extends Antiguedad {
	
	protected String autor;

	public Libro() {
		super();
	}

	public Libro(String añoFabricacion, String origen, double precio, String autor) {
		super(añoFabricacion, origen, precio);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", añoFabricacion=" + añoFabricacion + ", origen=" + origen + ", precio=" + precio + "]";
	}

	

	
	
	

}
