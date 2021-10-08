package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio04 {
	
public static void main(String[] args) {
		
		String str;
		float var1, var2, cambio, resto = 0 , devolver, resto1 = 0, resto2 = 0, resto3 = 0, resto4 = 0, devolver1 ;
		
		str = JOptionPane.showInputDialog("Importe completo de la compra");
		var1 = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Importe recibido");
		var2 = Float.parseFloat(str);
		
		cambio = var2 - var1;
		
		if (cambio < 0) {
			System.out.println("El importe recibido no es suficiente");
			return;
			
		} else if (cambio == 0) {
			
			System.out.println("El importe recibido es el justo");
			return;
			
			} else if (cambio > 0) {
				
				devolver = cambio/100;				
				resto = cambio % 100;
				System.out.println((int) devolver + " modenas de 100, que en total son " + ((devolver * 100) - resto));
				System.out.println("y una moneda de: " + resto);
				
				} else if (resto > 0) {
					
					devolver1 = resto/50;					
					resto1 = resto % 50;
					System.out.println(devolver1 + " modenas de 50, que en total son " + devolver1 * 50 );
					System.out.println(resto1);
					
					} else if (resto1 > 0) {
						
						devolver = resto/25;						
						resto2 = resto1 % 25;
						System.out.println(devolver + " modenas de 25, que en total son " + devolver * 25 );
						System.out.println(resto);
						
						} else if (resto2 > 0) {
							
							devolver = resto/5;							
							resto3 = resto2 % 5;
							System.out.println(devolver + " modenas de 5, que en total son " + devolver * 5 );
							System.out.println(resto);
							
							} else if (resto3 > 0) {
								
								devolver = resto/1;								
								resto4 = resto3 % 1;
								System.out.println(devolver + " modenas de 1, que en total son " + devolver * 1 );
								System.out.println(resto);
								
								}
		
	}
}
