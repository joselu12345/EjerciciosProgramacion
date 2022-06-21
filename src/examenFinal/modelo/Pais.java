package examenFinal.modelo;

public class Pais {
	
	private int id;
	private String descripcion;
	private int idContinente;
	
	public Pais() {
	}

	public Pais(int id, String descripcion, int idContinente) {
		this.id = id;
		this.descripcion = descripcion;
		this.idContinente = idContinente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdContinente() {
		return idContinente;
	}

	public void setIdContinente(int idContinente) {
		this.idContinente = idContinente;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", descripcion=" + descripcion + ", idContinente=" + idContinente + "]";
	}
	
	

}
