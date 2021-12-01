package capitulo04.bloque01;

public class GestionaCromo {

	public static void main(String[] args) {
		
		Ejercicio01_cromoBaloncesto cromo1 = new Ejercicio01_cromoBaloncesto("Juan", 198, 104, 300.4f);
		Ejercicio01_cromoBaloncesto cromo2 = new Ejercicio01_cromoBaloncesto("Carlos", 190, 90, 124.8f);
		Ejercicio01_cromoBaloncesto cromo3 = new Ejercicio01_cromoBaloncesto("Alfredo", 180, 95, 54.7f);
		Ejercicio01_cromoBaloncesto cromo4 = new Ejercicio01_cromoBaloncesto("Alez", 208, 120, 230.5f);
		Ejercicio01_cromoBaloncesto cromo5 = new Ejercicio01_cromoBaloncesto("Jim", 186, 100, 159.3f);
		
		System.out.println(cromo1.toString());
	}

}
