package capitulo03.bloque04;

import javax.swing.JOptionPane;

public class Ejercicio05 {
	
	public static void main (String[] args) {
		
		int factorial;
		String str;
		
		str = JOptionPane.showInputDialog("Introduzca un numero para saber su factorial");
		factorial = Integer.parseInt(str);
		
		int i = factorial - 1;
		while ( i > 1) {
			factorial = factorial * i;
			i--;
		}
		
		System.out.println("El factorial es: " + factorial);
		
	}

}
