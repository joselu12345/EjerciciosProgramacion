package examenFinal.modelo;

public class Marca {
	
	private int id;
	private String denominacion;
	private int idPais;
	
	public Marca() {
	}

	public Marca(int id, String denominacion, int idPais) {
		this.id = id;
		this.denominacion = denominacion;
		this.idPais = idPais;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	@Override
	public String toString() {
		return "Marca [id=" + id + ", denominacion=" + denominacion + ", idPais=" + idPais + "]";
	}
	
	
	

}
