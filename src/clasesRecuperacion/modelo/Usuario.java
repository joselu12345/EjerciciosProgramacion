package clasesRecuperacion.modelo;

public class Usuario {
	
	private int id;
	private String nombreUsuario;
	private String password;
	private String email;
	private String colorPreferido;
	
	public Usuario() {
	}

	public Usuario(int id, String nombreUsuario, String password, String email, String colorPreferido) {
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.email = email;
		this.colorPreferido = colorPreferido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getColorPreferido() {
		return colorPreferido;
	}

	public void setColorPreferido(String colorPreferido) {
		this.colorPreferido = colorPreferido;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombreUsuario=" + nombreUsuario + ", password=" + password + ", email=" + email
				+ ", colorPreferido=" + colorPreferido + "]";
	}
	
	
	
	
	
	

}
