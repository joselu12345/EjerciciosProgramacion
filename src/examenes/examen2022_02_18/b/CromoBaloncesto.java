package examenes.examen2022_02_18.b;

public class CromoBaloncesto {
	
	private int id;
	private String nombre;
	private int puntos;
	private int rebotes;
	
	public CromoBaloncesto() {
		super();
	}

	public CromoBaloncesto(int id, String nombre, int puntos, int rebotes) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.puntos = puntos;
		this.rebotes = rebotes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getRebotes() {
		return rebotes;
	}

	public void setRebotes(int rebotes) {
		this.rebotes = rebotes;
	}

	@Override
	public String toString() {
		return "CromoBaloncesto [id=" + id + ", nombre=" + nombre + ", puntos=" + puntos + ", rebotes=" + rebotes + "]";
	}
	
	
	
	

}
