package capitulo05.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio04 {
	
	public static void main(String[] args) {
		
		int array[] = new int[150];
		int var, posicion = 0, cont = 0;
		String str;
		
		System.out.print("el array creado es: \n");

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
			System.out.print(array[i] + " ");	
		}
		
		str = JOptionPane.showInputDialog("Introduce el valor que quieres buscar");
		var = Integer.parseInt(str);
		
		for (int i = 0; i < array.length; i++) {
			if (var == array[i]) {
				posicion = i + 1;
				cont += 1;
				if (posicion != 0) {
					System.out.println("\nEl numero introducido se encuentra en la posicion: " + posicion);
				}
			}
		}
		
		if (cont == 0) {
			System.out.println("\nNo se encuentra el valor introducido en el array");
		}

	}

}
