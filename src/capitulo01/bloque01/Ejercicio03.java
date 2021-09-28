package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	
public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduzca el primer numero: "); 
		int var1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca el segundo numero: ");
		int var2 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca el tercer número: ");
		int var3 = Integer.parseInt(str);
		
		int var4 = var1 + var2 + var3;
		
		System.out.println("La suma de los tres numeros es: " + var4); // Imprime en la consola la suma de los tres numeros introducidos anteriormente

	}

}
