package capitulo03.bloque04;

import javax.swing.JOptionPane;

public class Ejercicio04 {
	
	public static void main (String[] args) {
		
		String str;
		int num, i = (int) Math.pow(2, 30);
		
		str = JOptionPane.showInputDialog("Introduzca un numero decimal para saber su equivalencia en binario");
		num = Integer.parseInt(str);
		
		while ( i > 0 ) {
			
			if ((num & i) != 0) {
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
			
			i/=2;
		}
		
		
	}

}
