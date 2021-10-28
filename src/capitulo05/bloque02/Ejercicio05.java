package capitulo05.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio05 {
	
	public static void main (String[] args) {
		
		int array[] = new int[5];
		
		System.out.println("El array creado es: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
			System.out.print(array[i] + " ");
		}

		String str;
		int var;
		
		str = JOptionPane.showInputDialog("¿Cuantas posiciones dessea desplazar el array?");
		var = Integer.parseInt(str);

		for (int j = 0; j < var; j++) {

			int aux = array[array.length - 1];

			for (int i = array.length - 1; i > 0; i--) {

				array[i] = array[i - 1];
			}

			array[0] = aux;

		}
		
		System.out.println("\nEl array desplazado a la derecha " + var + " posiciones es: " );

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
