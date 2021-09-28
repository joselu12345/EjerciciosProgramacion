package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio02 {
	
public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduzca un numero entero: "); 
		int var1 = Integer.parseInt(str);
		System.out.println("el numero entero es: " + var1); // Imprime en la consola la variable introducida
		
		str = JOptionPane.showInputDialog("Introduzca un número flotante");
		float var2 = Float.parseFloat(str);
		System.out.println("el numero flotante es: " + var2); // Imprime en la consola la variable introducida
		
		str = JOptionPane.showInputDialog("Introduzca un número double");
		double var3 = Double.parseDouble(str);		
		System.out.println("el numero double es : " + var3); // Imprime en la consola la variable introducida

	}

}
