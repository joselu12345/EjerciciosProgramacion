package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio01 {
	
	public static void main (String[] args) {
		
		String str;
		int var1 = 1, suma = 0, contador = 0;
		float media = 0;
		
		for (; var1 != 0;) {
			
			str = JOptionPane.showInputDialog("Introduce un numero entero \n Para salir introduzca 0");
			var1 = Integer.parseInt(str);
			
			if (var1 != 0) {				

				suma = var1 + suma;
				contador++;
				media = (float) suma/contador;
				
			}
			
		}
		
		System.out.println("la suma de los numeros introducidos es: " + suma + " y la media es: " + media);
		
	}

}
