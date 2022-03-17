package capitulo04.bloque02Herencia.coleccionAntiguedades;

public class Mueble extends Antiguedad{
	
	protected String tamanio;

	public Mueble() {
		super();
	}

	public Mueble(String anioFabricacion, String origen, double precio, String tamanio) {
		super(anioFabricacion, origen, precio);
		this.tamanio = tamanio;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public String toString() {
		return "Mueble [tama�o=" + tamanio + ", a�oFabricacion=" + anioFabricacion + ", origen=" + origen + ", precio=" + precio + "]";
	}
	
	

}
