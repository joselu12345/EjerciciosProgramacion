package capitulo04.bloque02Herencia.coleccionAntiguedades;

public class Mueble extends Antiguedad{
	
	protected String tamaño;

	public Mueble() {
		super();
	}

	public Mueble(String añoFabricacion, String origen, double precio, String tamaño) {
		super(añoFabricacion, origen, precio);
		this.tamaño = tamaño;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Mueble [tamaño=" + tamaño + ", añoFabricacion=" + añoFabricacion + ", origen=" + origen + ", precio=" + precio + "]";
	}
	
	

}
