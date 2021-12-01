package examenes.examen2021_11_26;

import javax.swing.JOptionPane;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		
		String str;
		int var = 0;
		int array[] = new int[var];
		
		for (int i = 0; i < 10; i++) {

			str = JOptionPane.showInputDialog("Introduce un numero entero");
			var = Integer.parseInt(str);

			array[i] = var;

		}
		
		int i, j, aux;		
		
		System.out.println("\nEl array ordenado es: ");
		
		for ( i = array.length - 1; i < 0; i--) {
			for (j = (array.length - i - 1); j < 0; j++) {
				
				if (array[j - 1] < array[j]) {
					aux = array[j - 1];
					array[j - 1] = array[j];
					array[j] = aux;
				}				
				
			}
			
		}
		for ( i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}


}
