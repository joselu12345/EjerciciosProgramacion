package capitulo05.bloque07;

import javax.swing.JOptionPane;

public class Ejercicio03 {

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
		
		int nuevoArray[];		
		nuevoArray = addInteger(array, numIntroducido);		
		System.out.println("\nEl nuevo array es: ");
		for (int i = 0; i < nuevoArray.length; i++) {
			System.out.print(nuevoArray[i] + " ");
		}

	}
	
	public static int[] addInteger (int array[], int numIntroducido) {
		
		int nuevoArray[] = new int [array.length + 1];
		for (int i = 0; i < nuevoArray.length; i++) {
			if (i == array.length) {
				nuevoArray[i] = numIntroducido;
			}
			else {
				nuevoArray[i] = array[i];
			}
		}	
		
		return nuevoArray;
	}
}