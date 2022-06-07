package clasesRecuperacion.modelo;

public class Contrato {
	
	private int id;
	private String descripcion;
	private float saldo;
	private float limite;
	private int idTipoContrato;
	private int idUsuario;
	
	public Contrato() {
	}

	public Contrato(int id, String descripcion, float saldo, float limite, int idTipoContrato,
			int idUsuario) {
		this.id = id;
		this.descripcion = descripcion;
		this.saldo = saldo;
		this.limite = limite;
		this.idTipoContrato = idTipoContrato;
		this.idUsuario = idUsuario;
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

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public int getIdTipoContrato() {
		return idTipoContrato;
	}

	public void setIdTipoContrato(int idTipoContrato) {
		this.idTipoContrato = idTipoContrato;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public String toString() {
		return "Contrato [id=" + id + ", descripcion=" + descripcion + ", saldo=" + saldo + ", limite=" + limite
				+ ", idTipoContrato=" + idTipoContrato + ", idUsuario=" + idUsuario
				+ "]";
	}
	
	
	
	
	
	

}
