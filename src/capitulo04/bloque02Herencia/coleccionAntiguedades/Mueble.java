package capitulo04.bloque02Herencia.coleccionAntiguedades;

public class Mueble extends Antiguedad{
	
	protected String tama�o;

	public Mueble() {
		super();
	}

	public Mueble(String a�oFabricacion, String origen, double precio, String tama�o) {
		super(a�oFabricacion, origen, precio);
		this.tama�o = tama�o;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Mueble [tama�o=" + tama�o + ", a�oFabricacion=" + a�oFabricacion + ", origen=" + origen + ", precio=" + precio + "]";
	}
	
	

}
