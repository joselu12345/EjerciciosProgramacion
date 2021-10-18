package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio04 {
	
	public static void main(String[] args) {

		String str;
		int var = 1, contadorNegativos = 0, contadorPositivos = 0 ;

		for (; var != 0;) {

			str = JOptionPane.showInputDialog("Introduce numeros negativos y positivos \n Para salir introduzca 0");
			var = Integer.parseInt(str);			
			
			if (var == 0) {			
				break;
			} 
			
			if (var < 0) {
				contadorNegativos++;
			}
			
			if (var > 0) {
				contadorPositivos++;
			}
			
			
		}
		
		System.out.println("Se ha introducido " + contadorPositivos + " numeros positivos y " + contadorNegativos + " numeros negativos" );
	}

}
