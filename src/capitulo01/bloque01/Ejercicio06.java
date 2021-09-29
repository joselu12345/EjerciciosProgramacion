package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio06 {

	public static void main(String[] args) {

		String str = JOptionPane.showInputDialog("Introduzca el Euribor: ");
		float euribor = Float.parseFloat(str);

		str = JOptionPane.showInputDialog("Introduzca el diferencial: ");
		float diferencial = Float.parseFloat(str);

		str = JOptionPane.showInputDialog("Introduzca el capital: ");
		float capital = Float.parseFloat(str);

		str = JOptionPane.showInputDialog("Introduzca el número de plazos: ");
		int nPlazos = Integer.parseInt(str);

		float interesAnual = euribor + diferencial;

		float interesMensual = (interesAnual / 12) / 100;

		float cuotaMensual = capital * (interesMensual * (float) Math.pow((1 + interesMensual), nPlazos))
				/ ((float) Math.pow((1 + interesMensual), nPlazos) - 1);

		System.out.println("La cuato mensual es de: " + cuotaMensual);

	}

}
