package capitulo04.bloque02Herencia.coleccionAntiguedades;

public class Coche extends Antiguedad {
	
	protected String marca;

	public Coche() {
		super();
	}

	public Coche(String anioFabricacion, String origen, double precio, String marca) {
		super(anioFabricacion, origen, precio);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", a�oFabricacion=" + anioFabricacion + ", origen=" + origen + ", precio=" + precio + "]";
	}
	
	

}
