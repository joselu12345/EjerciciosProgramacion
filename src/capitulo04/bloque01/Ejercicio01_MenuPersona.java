package capitulo04.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio01_MenuPersona {
	
	public static void main(String[] args) {
		
		Ejercicio01_Persona arrayPersonas [] = new Ejercicio01_Persona [3];
		
		String str;
		int var;
		
		str = JOptionPane.showInputDialog("Menu Personas" + "\n0" + "\n1 - Derecha" + "\n2 - Izquierda");
		var = Integer.parseInt(str);

		/**
		 
		switch(var) {
		
		case 1:
			str = JOptionPane.showInputDialog("�Cuantas posiciones desea desplazar el array?");
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
			str = JOptionPane.showInputDialog("�Cuantas posiciones desea desplazar el array?");
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
		*/
		
	}

}
