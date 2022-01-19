package capitulo04.bloque02Herencia.coleccionAntiguedades;

public class Mueble extends Antiguedad{
	
	protected String tamanio;

	public Mueble() {
		super();
	}

	public Mueble(String anioFabricacion, String origen, double precio, String tamaño) {
		super(anioFabricacion, origen, precio);
		this.tamanio = tamaño;
	}

	public String getTamaño() {
		return tamanio;
	}

	public void setTamaño(String tamaño) {
		this.tamanio = tamaño;
	}

	@Override
	public String toString() {
		return "Mueble [tama�o=" + tamanio + ", a�oFabricacion=" + anioFabricacion + ", origen=" + origen + ", precio=" + precio + "]";
	}
	
	

}
