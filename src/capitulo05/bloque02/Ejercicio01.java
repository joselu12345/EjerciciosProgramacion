package capitulo05.bloque02;

public class Ejercicio01 {
	
	public static void main (String[] args) {
		
		int array[] = new int[150];
		
		System.out.println("El array creado es: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (100 - (-100)) + (-100));
			System.out.print(array[i] + " ");
		}

		System.out.println("\nEl array con los numeros pares cambiados de signo es: ");

		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {
				array[i] = array[i] * -1;
			}
			System.out.print(array[i] + " ");
		}
		
	}

}
