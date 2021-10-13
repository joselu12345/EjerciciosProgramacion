package capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	
	public static void main(String[] args) {

		String str;
		int var1 = 0, var2 , contadorNegativos = 0, contadorPositivos = 0;
		
		str = JOptionPane.showInputDialog("¿Cuántos numeros desea introducir?");
		var2 = Integer.parseInt(str);

		for (int i = 0; i < var2; i++) {

			str = JOptionPane.showInputDialog("Introduce un numero entero");
			var1 = Integer.parseInt(str);

			if (var1 >= 0)
				contadorPositivos++;
			
			if (var1 < 0)
				contadorNegativos++;

		}
		System.out.println("el total de numeros positivos es: " + contadorPositivos);
		System.out.println("el total de numeros negativos es: " + contadorNegativos);

	}

}
