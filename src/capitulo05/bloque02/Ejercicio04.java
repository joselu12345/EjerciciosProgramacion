package capitulo05.bloque02;

public class Ejercicio04 {
	
	public static void main (String[] args) {
		
		int array[] = new int[5];
		
		System.out.println("El array creado es: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
			System.out.print(array[i] + " ");
		}

		System.out.println("\n\nEl array desplazado a la derecha es:");

		int aux = array[array.length - 1];

		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}

		array[0] = aux;

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
