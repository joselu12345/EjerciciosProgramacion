package capitulo04.bloque02Herencia.cuestionario;

public class OpcionUnica extends Pregunta{
	
	protected int respuesta;
	protected String opcion1;
	protected String opcion2;
	protected String opcion3;
	protected String opcion4;
	
	public OpcionUnica() {
		super();
	}

	public OpcionUnica(String enunciado, int respuesta, String opcion1, String opcion2, String opcion3, String opcion4) {
		super(enunciado);
		this.respuesta = respuesta;
		this.opcion1 = opcion1;
		this.opcion2 = opcion2;
		this.opcion3 = opcion3;
		this.opcion4 = opcion4;
	}
	
	public void ComprobarRespuesta(int Respuesta) {
		if (Respuesta == this.respuesta) {
			System.out.println("correcto");
		}
		else {
			System.out.println("incorrecto");
		}
	}

	public int getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(int respuesta) {
		this.respuesta = respuesta;
	}

	public String getOpcion1() {
		return opcion1;
	}

	public void setOpcion1(String opcion1) {
		this.opcion1 = opcion1;
	}

	public String getOpcion2() {
		return opcion2;
	}

	public void setOpcion2(String opcion2) {
		this.opcion2 = opcion2;
	}

	public String getOpcion3() {
		return opcion3;
	}

	public void setOpcion3(String opcion3) {
		this.opcion3 = opcion3;
	}

	public String getOpcion4() {
		return opcion4;
	}

	public void setOpcion4(String opcion4) {
		this.opcion4 = opcion4;
	}

	@Override
	public String toString() {
		return "OpcionUnica [respuesta=" + respuesta + ", opcion1=" + opcion1 + ", opcion2=" + opcion2 + ", opcion3="
				+ opcion3 + ", opcion4=" + opcion4 + ", Enunciado=" + Enunciado + "]";
	}
	
	
	
	
	
	
	
}
