package capitulo03.bloque04;

import javax.swing.JOptionPane;

public class Ejercicio01 {
	
	public static void main (String[] args) {
		
		int numero, i = 2;
		String str;
		
		str = JOptionPane.showInputDialog("Introduce un numero");
		numero = Integer.parseInt(str);
		
		boolean numPrimo = true;
		while (i < numero) {
			if(numero % i == 0) {
				numPrimo = false;				
			}
			i++;
		}		
		
		if (numPrimo == true) {
			System.out.println("El numero " + numero + " es primo");
		}
		if (numPrimo == false) {
			System.out.println("El numero " + numero + " es compuesto");
		}
	}

}
