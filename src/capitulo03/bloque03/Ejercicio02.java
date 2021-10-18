package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {

		String str;
		int var1 = 1, mayor = 0, menor = 0;

		for (int i = 0; var1 != 0; i++) {

			str = JOptionPane.showInputDialog("Introduce un numero entero \n Para salir introduzca 0");
			var1 = Integer.parseInt(str);			
			
			if (var1 == 0) {			
				break;
			} 
			
			if (i == 0) {
	
			menor = var1;
			mayor = var1;
			}
			
			if (var1 > mayor) {
				mayor = var1;				
			}
			
			if (var1 < menor) {
				menor = var1;
			}
			
		}

		System.out.println("el numero mayor es: " + mayor + " y el menor es: " + menor);
	}
}
