package capitulo04.bloque02Herencia.coleccionAntiguedades;

public class Antiguedad {
	
	protected String anioFabricacion;
	protected String origen;
	protected double precio;
	
	public Antiguedad() {
		super();
	}

	public Antiguedad(String anioFabricacion, String origen, double precio) {
		super();
		this.anioFabricacion = anioFabricacion;
		this.origen = origen;
		this.precio = precio;
	}

	public String getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(String anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Antiguedad [a�oFabricacion=" + anioFabricacion + ", origen=" + origen + ", precio=" + precio + "]";
	}
	
	
	

}
