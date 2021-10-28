package capitulo05.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	
	public static void main (String[] args) {
		
		int array[] = new int[150];
		String str;
		int var;
		
		str = JOptionPane.showInputDialog("Introduce un numero que multiplicara los elementos del array:");
		var = Integer.parseInt(str);
		
		System.out.println("El array creado es: ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
			System.out.print(array[i] + " ");
		}

		System.out.println("\nEl array multiplicaco por el numero introducido es:");

		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * var;
			System.out.print(array[i] + " ");
		}
		
	}
	

}
