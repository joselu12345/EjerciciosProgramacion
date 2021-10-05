package capitulo02.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio02 {
	
public static void main(String[] args) {
		
		String str;
		int var1, var2, var3, var4, var5;
		
		str = JOptionPane.showInputDialog("Introduzca el primer numero");
		var1 = Integer.parseInt(str);
		if (var1 < 0) {
			return;
		}
		
		str = JOptionPane.showInputDialog("Introduzca el segundo numero");
		var2 = Integer.parseInt(str);
		if (var2 < 0) {
			return;
		}
		
		str = JOptionPane.showInputDialog("Introduzca el tercer numero");
		var3 = Integer.parseInt(str);
		if (var3 < 0) {
			return;
		}
		
		str = JOptionPane.showInputDialog("Introduzca el cuarto numero");
		var4 = Integer.parseInt(str);
		if (var4 < 0) {
			return;
		}
		
		str = JOptionPane.showInputDialog("Introduzca el quinto numero");
		var5 = Integer.parseInt(str);
		if (var5 < 0) {
			return;
		}
		
		int a = 0 , b = 0 , c = 0 , contador = 0;
		
		
						
		if ((var1 >= 0 && var1 <= 25) ) {
			
			a = contador + 1  ;
			
			} else if (var1 >= 26 && var1 <= 250) {
				
				b = contador + 1;
				
				} else if (var1 > 250) {
					
					c = contador + 1;
					}
		
		
		
		int a1 = a , b1 = b , c1 = c ;
				
								
		if ((var2 >= 0 && var2 <= 25) ) {
					
				a1 = a + 1 ;
					
				} else if (var2 >= 26 && var2 <= 250) {
						
					b1 = b1 + 1;
						
					} else if (var2 > 250) {
							
						c1 = c1 + 1 ;
						}
				
		int a2 = a1 , b2 = b1 , c2 = c1 ;
				
		if ((var3 >= 0 && var3 <= 25) ) {
					
			a2 = a1 +1 ;
					
			} else if (var3 >= 26 && var3 <= 250) {
						
				b2 = b2 + 1;
						
				} else if (var3 > 250) {
							
					c2 = c2 + 1;
					}
		
		int a3 = a2 , b3 = b2 , c3 = c2 ;
		
		if ((var4 >= 0 && var4 <= 25) ) {
					
			a3 = a2 + 1 ;
					
			} else if (var4 >= 26 && var4 <= 250) {
						
				b3 = b3 + 1;
						
				} else if (var4 > 250) {
							
					c3 = c3 + 1;
					}
		
		int a4 = a3 , b4 = b3 , c4 = c3 ;
		
		if ((var5 >= 0 && var5 <= 25) ) {
					
			a4 = a3 + 1 ;
					
			} else if (var5 >= 26 && var5 <= 250) {
						
				b4 = b4 + 1;
						
				} else if (var5 > 250) {
							
					c4 = c4 + 1;
					}
		
		System.out.println("el total de numeros entre 0 y 25 es: " + a4 );
		System.out.println("la suma de los numeros entre 26 y 250 es: " + b4 );
		System.out.println("la suma de los numeros mayores a 250 es: " + c4 );
			
	}

}
