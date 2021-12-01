package examenes.examen2021_11_26;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	
	public static void main (String[] args) {
		
		int array[] = new int[10];
		String str;
		int posBorrada = 0;
		
		str = JOptionPane.showInputDialog("Indique una posicion del array");
		posBorrada = Integer.parseInt(str);
		
		System.out.println("El array creado es:");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
			System.out.print(array[i] + " ");
			
		}
		
		for (int i = 0; i < array.length; i++) {
			if (i == posBorrada) {
				i++;
			}
			array[array.length - 1] = (int) Math.round(Math.random() * 100);
			System.out.print("\n" + array[i] + " ");
		}
		
		
		
	}

}
