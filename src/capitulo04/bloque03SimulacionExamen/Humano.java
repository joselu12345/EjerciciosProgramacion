package capitulo04.bloque03SimulacionExamen;

public class Humano extends Personaje {
	
	public Humano() {
		super();
	}

	public Humano(int puntosVida, String nombre, boolean vivo) {
		super(puntosVida, nombre, vivo);
	}

	@Override
	public String toString() {
		return "Humano [getPuntosVida()=" + getPuntosVida() + ", getNombre()=" + getNombre() + ", isVivo()=" + isVivo() + "]";
	}

	//@Override
	//public String toString() {
	//	return "Humano [puntosVida=" + puntosVida + ", nombre=" + nombre + ", vivo=" + vivo + "]";
	//}
	
	

	
	

	
	
	
	


}
