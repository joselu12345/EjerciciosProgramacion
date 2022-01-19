package capitulo04.bloque02Herencia.coleccionAntiguedades;

public class Antiguedad {
	
	protected String a�oFabricacion;
	protected String origen;
	protected double precio;
	
	public Antiguedad() {
		super();
	}

	public Antiguedad(String a�oFabricacion, String origen, double precio) {
		super();
		this.a�oFabricacion = a�oFabricacion;
		this.origen = origen;
		this.precio = precio;
	}

	public String getA�oFabricacion() {
		return a�oFabricacion;
	}

	public void setA�oFabricacion(String a�oFabricacion) {
		this.a�oFabricacion = a�oFabricacion;
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
		return "Antiguedad [a�oFabricacion=" + a�oFabricacion + ", origen=" + origen + ", precio=" + precio + "]";
	}
	
	
	

}
