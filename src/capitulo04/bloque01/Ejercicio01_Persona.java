package capitulo04.bloque01;

public class Ejercicio01_Persona {

	private String nombre;
	private String apellido;
	private String dni;
	private String direccion;
	private String telefono;
	
	public Ejercicio01_Persona() {
		super();
	}

	public Ejercicio01_Persona(String nombre, String apellido, String dni, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Ejercicio01_Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", direccion="
				+ direccion + ", telefono=" + telefono + "]";
	}
	
	

}
