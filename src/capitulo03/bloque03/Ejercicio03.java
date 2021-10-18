package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	
	public static void main(String[] args) {

		String str;
		int var = 1 ;

		for (; var != 0;) {

			str = JOptionPane.showInputDialog("Introduce los numeros de los que quiere obtener su tabla de multiplicar \n Para salir introduzca 0");
			var = Integer.parseInt(str);			
			
			if (var == 0) {			
				break;
			} 
			
			for (int i = 1; i <= 10; i++) {
				
				System.out.println(var + " x " + i + " = " + (var * i));
				
			}
			
		}

		
	}

}
