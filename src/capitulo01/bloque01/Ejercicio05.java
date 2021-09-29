package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String[] args) {

		String str = JOptionPane.showInputDialog("Introduzca el primer numero: ");
		int var1 = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("Introduzca el segundo numero: ");
		int var2 = Integer.parseInt(str);

		int Auxiliar = var1;
		var1 = var2;
		var2 = Auxiliar;

		System.out.println("El primer número valia: " + Auxiliar + " y ahora vale: " + var1);
		System.out.println("El segundo número valia: " + var1 + " y ahora vale: " + var2);

	}

}
