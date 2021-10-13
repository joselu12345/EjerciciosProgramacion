package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio01 {
	
	public static void main(String[] args) {

		String str;
		int var1 = 0, var2 , suma = 0;
		
		str = JOptionPane.showInputDialog("¿Cuantos numeros desea introducir?");
		var2 = Integer.parseInt(str);

		for (int i = 0; i < var2; i++) {

			str = JOptionPane.showInputDialog("Introduce un numero entero");
			var1 = Integer.parseInt(str);

			suma = var1 + suma;

		}
		System.out.println("la media de los numeros introducidos es: " + ((float) suma/var2));

	}

}
