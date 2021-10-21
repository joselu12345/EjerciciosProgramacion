package examenes.examen20211021.copy;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {

		int limiteSuperior = 0, limiteInferior = 0;
		String str;

		str = JOptionPane.showInputDialog("Introduce el limite superior:");
		limiteSuperior = Integer.parseInt(str);

		while (limiteSuperior < 0) {
			str = JOptionPane.showInputDialog("el numero introducido debe ser positivo, prueba de nuevo");
			limiteSuperior = Integer.parseInt(str);
			return;
		}

		str = JOptionPane.showInputDialog("Introduce el limite inferior:");
		limiteInferior = Integer.parseInt(str);

		while (limiteInferior > 0) {
			str = JOptionPane.showInputDialog("el numero introducido debe ser negativo, prueba de nuevo");
			limiteInferior = Integer.parseInt(str);
			return;
		}

		int numero = (int) Math.round(Math.random() * limiteSuperior);

	}

}
