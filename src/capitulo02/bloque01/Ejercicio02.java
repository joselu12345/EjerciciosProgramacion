package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		String str;
		int var1, var2;

		str = JOptionPane.showInputDialog("Introduce el primer numero");
		var1 = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("Introduce el segundo numero");
		var2 = Integer.parseInt(str);

		if (var1 < var2) {
			System.out.println("El menor es: " + var1);
		} else {
			System.out.println("El menor es: " + var2);
		}

	}

}
