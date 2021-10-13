package capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio02 {
	
	public static void main(String[] args) {

		String str;
		int var1 = 0, var2 , suma = 0;
		
		str = JOptionPane.showInputDialog("¿Cuántos numeros desea introducir?");
		var2 = Integer.parseInt(str);

		for (int i = 0; i < var2; i++) {

			str = JOptionPane.showInputDialog("Introduce un numero entero");
			var1 = Integer.parseInt(str);

			if (var1 > 10)
				suma = var1 + suma;

		}
		System.out.println("la suma de numeros mayores que 10 es: " + suma);

	}

}
