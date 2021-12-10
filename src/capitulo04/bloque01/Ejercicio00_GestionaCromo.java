package capitulo04.bloque01;

public class Ejercicio00_GestionaCromo {

	public static void main(String[] args) {
		
		Ejercicio00_cromoBaloncesto cromo1 = new Ejercicio00_cromoBaloncesto("Juan", 198, 104, 300.4f);
		Ejercicio00_cromoBaloncesto cromo2 = new Ejercicio00_cromoBaloncesto("Carlos", 190, 90, 124.8f);
		Ejercicio00_cromoBaloncesto cromo3 = new Ejercicio00_cromoBaloncesto("Alfredo", 180, 95, 54.7f);
		Ejercicio00_cromoBaloncesto cromo4 = new Ejercicio00_cromoBaloncesto("Alez", 208, 120, 230.5f);
		Ejercicio00_cromoBaloncesto cromo5 = new Ejercicio00_cromoBaloncesto("Jim", 186, 100, 159.3f);
		
		System.out.println(cromo1.toString());
	}

}
