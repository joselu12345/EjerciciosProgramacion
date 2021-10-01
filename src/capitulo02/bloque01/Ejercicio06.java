package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio06 {
	
	public static void main(String[] args) {
		
		String str;		
		int var;
		
		str = JOptionPane.showInputDialog("Introduce un numero:");
		var = Integer.parseInt(str);
		
		if (var % 2 == 0)	{
			System.out.println("El numero es par");
			
		} else {
			System.out.println("El numero es impar");
		}
		
	}

}
