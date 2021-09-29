package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {

		String str = JOptionPane.showInputDialog("Introduzca un numero entero: "); // Saca en pantalla una ventana y
																					// obtiene un string
		int var1 = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("Introduzca un número flotante");
		float var2 = Float.parseFloat(str);

		str = JOptionPane.showInputDialog("Introduzca un número double");
		double var3 = Double.parseDouble(str);

		System.out.println("Numero entero: " + var1 + " - Numero flotante: " + var2 + " - Numero double: " + var3); 
	}

}
