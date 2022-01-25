package capitulo04.bloque03SimulacionExamen;

public class Malvado extends Personaje {
	
	public Malvado() {
		super();
	}

	public Malvado(int puntosVida, String nombre, boolean vivo) {
		super(puntosVida, nombre, vivo);
	}

	@Override
	public String toString() {
		return "Malvado [getPuntosVida()=" + getPuntosVida() + ", getNombre()=" + getNombre() + ", isVivo()=" + isVivo() + "]";
	}

	

	
	
	
	

}
