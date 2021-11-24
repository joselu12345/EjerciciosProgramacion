package capitulo05.bloque07;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {

		String str;

		str = JOptionPane.showInputDialog("Introduzca un numero");
		int numIntroducido = Integer.parseInt(str);

		System.out.println("El array creado es: ");
		int array[] = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 20);
			System.out.print(array[i] + " ");
		}

		int contador = countOcurrences(array, numIntroducido);
		System.out.println("\nEl numero " + numIntroducido + " se repite " + contador);

	}

	public static int countOcurrences(int array[], int numIntroducido) {

		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numIntroducido) {
				contador++;
			}

		}
		return contador;

	}

}
