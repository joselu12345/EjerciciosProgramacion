package capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio01 {
	
public static  void main (String [] args) {
		
		String str;
		int var1 = 0, suma = 0;		
		
		for (int i = 0; i < 4; i++) {
			
			str = JOptionPane.showInputDialog("Introduce un numero entero");
			var1 = Integer.parseInt(str);
			
			if (var1 > 10)
				suma = var1 + suma;		
			
		}
		System.out.println("la suma de numeros mayores que 10 es: " + suma);
		
	}


}
