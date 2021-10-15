package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio02 {
	
public static void main (String[] args) {
		
		String str;
		int var1 = 1, mayor = 0, menor = 0, pMayor, pMenor ;
		
		for (; var1 != 0;) {
			
			str = JOptionPane.showInputDialog("Introduce un numero entero \n Para salir introduzca 0");
			var1 = Integer.parseInt(str);
			pMayor = Integer.parseInt(str);
			pMenor = Integer.parseInt(str);
			
			
			
			if (var1 != 0) {				
				
				menor = pMenor;
				mayor = pMayor;				
				
				} else if (menor > pMenor) {
						menor = pMenor;
					}
					
					if (mayor < pMayor) {
						mayor = pMayor;
					}
				
			
			
		}
		
		System.out.println("el numero mayor es: " + mayor + " y el menor es: " + menor);
		
	}

}
