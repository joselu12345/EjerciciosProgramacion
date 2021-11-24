package capitulo05.bloque07;

import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String[] args) {

		String str;

		str = JOptionPane.showInputDialog("Introduzca un numero para borrar");
		int numBorrado = Integer.parseInt(str);

		System.out.println("El array creado es: ");
		int array[] = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 20);
			System.out.print(array[i] + " ");
		}

		int nuevoArray[];		
		nuevoArray = removeInteger(array, numBorrado);		
		System.out.println("\nEl nuevo array es: ");
		for (int i = 0; i < nuevoArray.length; i++) {
			System.out.print(nuevoArray[i] + " ");
		}

	}

	public static int[] removeInteger(int array[], int numBorrado) {

		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numBorrado) {
				contador++;
			}

		}
		int arrayBorrado[] = new int[array.length - contador];
		for (int i = 0; i < arrayBorrado.length; i++) {
			if (array[i] == numBorrado) {
				i--;
			} else {
				arrayBorrado[i] = array[i];
			}

		}
		return arrayBorrado;

	}
	
}