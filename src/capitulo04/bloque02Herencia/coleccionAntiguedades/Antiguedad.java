package capitulo04.bloque02Herencia.coleccionAntiguedades;

public class Antiguedad {
	
	protected String aņoFabricacion;
	protected String origen;
	protected double precio;
	
	public Antiguedad() {
		super();
	}

	public Antiguedad(String aņoFabricacion, String origen, double precio) {
		super();
		this.aņoFabricacion = aņoFabricacion;
		this.origen = origen;
		this.precio = precio;
	}

	public String getAņoFabricacion() {
		return aņoFabricacion;
	}

	public void setAņoFabricacion(String aņoFabricacion) {
		this.aņoFabricacion = aņoFabricacion;
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
		return "Antiguedad [aņoFabricacion=" + aņoFabricacion + ", origen=" + origen + ", precio=" + precio + "]";
	}
	
	
	

}
