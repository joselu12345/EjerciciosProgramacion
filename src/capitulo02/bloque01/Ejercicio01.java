package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduce el primer numero");
		int var1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce el segundo numero");
		int var2 = Integer.parseInt(str);
		
		if (var1 > var2) {
			System.out.println("El mayor es: " + var1);
		} 
		else {
			System.out.println("El mayor es: " + var2);
		}
	}

}
