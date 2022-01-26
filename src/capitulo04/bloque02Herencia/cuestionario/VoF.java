package capitulo04.bloque02Herencia.cuestionario;

public class VoF extends Pregunta {
	
	protected boolean respuesta;

	public VoF() {
		super();
	}

	public VoF(String enunciado, boolean respuesta) {
		super(enunciado);
		this.respuesta = respuesta;
	}
	
	public void ComprobarRespuesta(boolean Respuesta) {
		if(Respuesta == this.respuesta) {
			System.out.println("correcto");
		}
		else {
			System.out.println("incorrecto");
		}
	}

	public boolean getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(boolean respuesta) {
		this.respuesta = respuesta;
	}

	@Override
	public String toString() {
		return "VoF [respuesta=" + respuesta + ", Enunciado=" + Enunciado + "]";
	}

	
	
	

}
