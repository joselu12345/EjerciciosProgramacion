package examenFinal.modelo;

import java.sql.Date;

public class Continente {
	
	private int id;
	private String descripcion;
	
	public Continente() {
	}

	public Continente(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
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

	@Override
	public String toString() {
		return "Continente [id=" + id + ", descripcion=" + descripcion + "]";
	}

}
