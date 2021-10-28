package capitulo05.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		
		int array[] = new int[150];
		int limSuperior = 50, limInferior = 20;
		String str;
		
		str = JOptionPane.showInputDialog("Introduce un limite superior");
		limSuperior = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un limite inferior");
		limInferior = Integer.parseInt(str);		
		
		System.out.print("el array creado es: \n");
				
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (limSuperior - limInferior) + limInferior);

			System.out.print(array[i] + " ");
			
			
		}	
		

	}

}
