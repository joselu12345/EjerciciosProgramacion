package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio04 {
	
public static void main(String[] args) {
		
		String str;
		int numero, limite ;
		
		str = JOptionPane.showInputDialog("Introduzca un número para saber sus multiplos:");
		numero = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca el limite para saber sus multiplos:");
		limite = Integer.parseInt(str);
		
		for (int i = 1; (i * numero) <= limite; i++) {
			
			System.out.println("los multiplos de " + numero + " hasta " + limite + " son: " + (i * numero));
			
		}
		
	}

}
