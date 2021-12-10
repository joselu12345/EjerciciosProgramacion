package capitulo04.bloque01;

public class Ejercicio00_cromoBaloncesto {
		
	private String nombre;
	private int altura;
	private int peso;
	private float puntos;
	
	public Ejercicio00_cromoBaloncesto() {
		
	}

	public Ejercicio00_cromoBaloncesto(String nombre, int altura, int peso, float puntos) {
		
		this.nombre = nombre;
		this.altura = altura;
		this.peso = peso;
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Ejercicio01_cromoBaloncesto [nombre=" + nombre + ", altura=" + altura + ", peso=" + peso + ", puntos="
				+ puntos + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public float getPuntos() {
		return puntos;
	}

	public void setPuntos(float puntos) {
		this.puntos = puntos;
	}
	
	
	
	
		

	

}
