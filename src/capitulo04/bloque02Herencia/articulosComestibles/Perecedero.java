package capitulo04.bloque02Herencia.articulosComestibles;

public class Perecedero extends Articulo {
	
	protected String fechaCaducidad;

	public Perecedero() {
		super();
	}


	public Perecedero(String nombre, String codigo, double precio, String fechaCaducidad) {
		super(nombre, codigo, precio);
		this.fechaCaducidad = fechaCaducidad;
		
	}


	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "Perecedero [fechaCaducidad=" + fechaCaducidad + "]";
	}
	
	

}
