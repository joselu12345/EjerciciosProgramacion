package capitulo04.bloque02Herencia.cuestionario;

public class Pregunta {
	
	protected String Enunciado;

	public Pregunta() {
		super();
	}

	public Pregunta(String enunciado) {
		super();
		Enunciado = enunciado;
	}

	public String getEnunciado() {
		return Enunciado;
	}

	public void setEnunciado(String enunciado) {
		Enunciado = enunciado;
	}

	@Override
	public String toString() {
		return "Pregunta [Enunciado=" + Enunciado + "]";
	}
	
	

}
