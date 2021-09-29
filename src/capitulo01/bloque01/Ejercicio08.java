package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio08 {

	public static void main(String[] args) {

		String str = JOptionPane.showInputDialog("Introduzca el primer numero: ");
		int var1 = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("Introduzca el segundo numero");
		int var2 = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("Introduzca el tercer número");
		int var3 = Integer.parseInt(str);

		int mayor;

		mayor = var1 > var2 ? (var1 > var3 ? var1 : (var2 > var3 ? var2 : var3)) : (var2 > var3 ? var2 : var3);

		int menor;

		menor = var1 < var2 ? (var1 < var3 ? var1 : (var2 < var3 ? var2 : var3)) : (var2 < var3 ? var2 : var3);

		System.out.println("El numero mayor es: " + mayor + " y el numero menor es: " + menor);

	}

}
