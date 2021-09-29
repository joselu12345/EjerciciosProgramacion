package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {

		String str = JOptionPane.showInputDialog("Introduzca el primer numero: ");
		float var1 = Float.parseFloat(str);

		str = JOptionPane.showInputDialog("Introduzca el segundo numero: ");
		float var2 = Float.parseFloat(str);

		str = JOptionPane.showInputDialog("Introduzca el tercer número: ");
		float var3 = Float.parseFloat(str);

		float media = (var1 + var2 + var3) / 3;

		System.out.println("La suma de los tres numeros es: " + media); // Imprime en la consola la suma de los tres numeros introducidos anteriormente
																		

	}

}
