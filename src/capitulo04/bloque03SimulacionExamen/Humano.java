package capitulo04.bloque03SimulacionExamen;

public class Humano {
	
	private int puntosVida = (int) Math.round(Math.random() * (100 - 50) + 50);	
	private String nombre;
	private boolean vivo;
	
	public Humano() {
		super();
	}

	public Humano(int puntosVida, String nombre, boolean vivo) {
		super();
		this.puntosVida = puntosVida;
		this.nombre = nombre;
		this.vivo = vivo;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	@Override
	public String toString() {
		return "Humano [puntosVida=" + puntosVida + ", nombre=" + nombre + ", vivo=" + vivo + "]";
	}
	
	
	


}
