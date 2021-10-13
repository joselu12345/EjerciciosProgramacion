package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		
		String str;
		int factibleMayor = 1, mayor = 0, factibleMenor = 1, menor = 0, var1 ;
		
		str = JOptionPane.showInputDialog("¿Cuantos numeros desea introducir?");
		var1 = Integer.parseInt(str);

		for (int i = 0; i < var1; i++) {

			str = JOptionPane.showInputDialog("Introduce un numero entero");
			factibleMayor = Integer.parseInt(str);
			factibleMenor = Integer.parseInt(str);
			
			if (i == 0) {				
				
				menor = factibleMenor;
				mayor = factibleMayor;	
				
			}else if (factibleMayor > mayor) {				
				mayor = factibleMayor;
			}
			
			if  (factibleMenor < menor){							
				menor = factibleMenor;				
			} 
			
		}
		System.out.println("el numero mayor es: " + mayor);
		System.out.println("el numero menor es: " + menor);
		
	}

}
