package capitulo05.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio06 {
	
	public static void main (String[] args) {
		
		int array[] = new int[5];
		int desDerecha, desIzquierda;
		
		System.out.println("El array creado es: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
			System.out.print(array[i] + " ");
		}
		
		String str;
		int var;
		
		str = JOptionPane.showInputDialog("¿En que direccion quieres que se desplace el array?" + "\n1 - Derecha" + "\n2 - Izquierda");
		var = Integer.parseInt(str);
		
		switch(var) {
		
		case 1:
			str = JOptionPane.showInputDialog("¿Cuantas posiciones desea desplazar el array?");
			desDerecha = Integer.parseInt(str);

			for (int j = 0; j < desDerecha; j++) {

				int aux = array[array.length - 1];

				for (int i = array.length - 1; i > 0; i--) {

					array[i] = array[i - 1];
				}

				array[0] = aux;

			}
			
			System.out.println("\nEl array desplazado a la derecha es: ");

			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			break;
		
		case 2:
			str = JOptionPane.showInputDialog("¿Cuantas posiciones desea desplazar el array?");
			desIzquierda = Integer.parseInt(str);
			
			for (int j = 0; j < desIzquierda; j++) {

				int aux = array[0];

				for (int i = 1; i < array.length; i++) {

					array[i - 1] = array[i];
				}

				array[array.length - 1] = aux;
			}
			
			System.out.println("\nEl array desplazado a la izquierda es: ");

			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			break;
		
		default:
			System.out.println("\nLa variable introducida no es valida");
			
		}
		
	}

}
