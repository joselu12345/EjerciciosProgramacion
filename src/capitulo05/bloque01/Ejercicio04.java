package capitulo05.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio04 {
	
	public static void main(String[] args) {
		
		int array[] = new int[20];
		int var, posicion = 0, cont = 0;
		String str;
		
		str = JOptionPane.showInputDialog("Introduce el valor que quieres buscar");
		var = Integer.parseInt(str);
		
		System.out.print("el array creado es: \n");

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 20);
			System.out.print(array[i] + " ");

			
		}
		
		for (int i = 0; i < array.length; i++) {
			if (var == array[i]) {
				posicion = i;
				//System.out.println("\nEl numero introducido se encuentra en la posición: " + posicion);
				cont += 1;
				if (posicion != 0) {
					System.out.println("\nEl numero introducido se encuentra en la posición: " + posicion);
				}
			}
		}
		
	

		if (cont == 0) {
			System.out.println("\nNo se encuentra el valor introducido en el array");
			cont += 1;
		}

	}

}
