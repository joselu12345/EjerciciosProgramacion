package capitulo04.bloque02Herencia.coleccionAntiguedades;

public class Antiguedad {
	
	protected String añoFabricacion;
	protected String origen;
	protected double precio;
	
	public Antiguedad() {
		super();
	}

	public Antiguedad(String añoFabricacion, String origen, double precio) {
		super();
		this.añoFabricacion = añoFabricacion;
		this.origen = origen;
		this.precio = precio;
	}

	public String getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(String añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
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
		return "Antiguedad [añoFabricacion=" + añoFabricacion + ", origen=" + origen + ", precio=" + precio + "]";
	}
	
	
	

}
