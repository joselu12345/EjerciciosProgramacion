package capitulo04.bloque02Herencia.coleccionAntiguedades;

public class Joya extends Antiguedad {
	
	protected String metalFabricacion;

	public Joya() {
		super();
	}

	public Joya(String añoFabricacion, String origen, double precio, String metalFabricacion) {
		super(añoFabricacion, origen, precio);
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
		return "Joya [metalFabricacion=" + metalFabricacion + ", añoFabricacion=" + añoFabricacion + ", origen=" + origen + ", precio=" + precio + "]";
	}

	

	
	

}
