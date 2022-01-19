package capitulo04.bloque02Herencia.coleccionAntiguedades;

public class Joya extends Antiguedad {
	
	protected String metalFabricacion;

	public Joya() {
		super();
	}

	public Joya(String aņoFabricacion, String origen, double precio, String metalFabricacion) {
		super(aņoFabricacion, origen, precio);
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
		return "Joya [metalFabricacion=" + metalFabricacion + ", aņoFabricacion=" + aņoFabricacion + ", origen=" + origen + ", precio=" + precio + "]";
	}

	

	
	

}
