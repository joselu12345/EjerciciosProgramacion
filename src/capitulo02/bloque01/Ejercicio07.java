package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio07 {
	
	public static void main(String[] args) {

		String str;
		int var, mascara = 1;

		str = JOptionPane.showInputDialog("Introduzca el número:");
		var = Integer.parseInt(str);

		if ((var & mascara) == 1) {
			System.out.println("El número es impar");

		} else {
			System.out.println("El numero es par");
		}

	}


}
