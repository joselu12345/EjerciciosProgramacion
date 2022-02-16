package capitulo06;

public class HmArticulo {

	private String CodigoBarras;
	private String NumEstante;	
	private int Stock;
	
	public HmArticulo() {
		super();
	}

	public HmArticulo(String codigoBarras, String numEstante, int stock) {
		super();
		CodigoBarras = codigoBarras;
		NumEstante = numEstante;
		Stock = stock;
	}

	public String getCodigoBarras() {
		return CodigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		CodigoBarras = codigoBarras;
	}

	public String getNumEstante() {
		return NumEstante;
	}

	public void setNumEstante(String numEstante) {
		NumEstante = numEstante;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	@Override
	public String toString() {
		return "HmArticulo [CodigoBarras=" + CodigoBarras + ", NumEstante=" + NumEstante + ", Stock=" + Stock + "]";
	}
	
	
	
	

}
