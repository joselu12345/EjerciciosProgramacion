package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	
	public static void main(String[] args) {
		
		String str;
		int numero;
		
		str = JOptionPane.showInputDialog("Introduzca un número para saber sus multiplos hasta 100:");
		numero = Integer.parseInt(str);
		
		for (int i = 1; (i * numero) <= 100; i++) {
			
			System.out.println("los multiplos de " + numero + " hasta 100 son: " + (i * numero));
			
		}
		
	}

}
