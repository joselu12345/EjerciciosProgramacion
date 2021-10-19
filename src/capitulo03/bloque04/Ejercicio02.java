package capitulo03.bloque04;

import javax.swing.JOptionPane;

public class Ejercicio02 {
	
	public static void main (String[] args) {
		
		String str;
		int limiteSuperior, limiteInferior;  

		
		str = JOptionPane.showInputDialog("Introduce el limite inferior para comprobar numeros primos");
		limiteInferior = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce el limite superior para comprobar numeros primos");
		limiteSuperior = Integer.parseInt(str);
		
		
		while (limiteInferior <= limiteSuperior ) {
		
			boolean numPrimo = true;
			int i = 2;
			while ( i < limiteInferior) {
				if (limiteInferior % i == 0) {
					numPrimo = false;				
				}				
				 i++;
			}
			
			
			if (numPrimo == true) {
				System.out.println("El numero " + limiteInferior + " es primo");
			}
			if (numPrimo == false) {
				System.out.println("El numero " + limiteInferior + " es compuesto");
			}
			
			limiteInferior++;
			
		}
		
	}

}
