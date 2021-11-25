package capitulo05.bloque07;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		String str;
		
		str = JOptionPane.showInputDialog("Introduzca el numero que desea reemplazar");
		int numBuscado = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca el numero que desea introducir");
		int numIntroducido = Integer.parseInt(str);
		
		int  array[] = new int [20];
		
		System.out.println("El array creado es: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random() * 20);
			System.out.print(array[i] + " ");
		}
		
		
		findAndReplace(array, numBuscado, numIntroducido);
		
		System.out.println("\nEl nuevo array es:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	/**
	 * 
	 * @param array
	 * @param numeroBuscado
	 * @param numeroSustituto
	 */
	public static int[] findAndReplace (int array[], int numBuscado, int numIntroducido) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numBuscado) {
				array[i] = numIntroducido;
			}
		}
		
		return array;
		
	}
}