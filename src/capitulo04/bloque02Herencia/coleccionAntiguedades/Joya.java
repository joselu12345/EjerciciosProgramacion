package capitulo04.bloque02Herencia.coleccionAntiguedades;

public class Joya extends Antiguedad {
	
	protected String metalFabricacion;

	public Joya() {
		super();
	}

	public Joya(String anioFabricacion, String origen, double precio, String metalFabricacion) {
		super(anioFabricacion, origen, precio);
		this.metalFabricacion = metalFabricacion;
	}

	public String getMetalFabricacion() {
		return metalFabricacion;
	}

	public void setMetalFabricacion(String metalFabricacion) {
		this.metalFabricacion = metalFabricacion;
	}

	@Override
	public String toString() {
		return "Joya [metalFabricacion=" + metalFabricacion + ", a�oFabricacion=" + anioFabricacion + ", origen=" + origen + ", precio=" + precio + "]";
	}

	

	
	

}
