package capitulo02.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio01 {
	
public static void main(String[] args) {
		
		String str;
		int var1, var2, var3, var4, var5;
		
		str = JOptionPane.showInputDialog("Introduzca el primer numero");
		var1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca el segundo numero");
		var2 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca el tercer numero");
		var3 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca el cuarto numero");
		var4 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca el quinto numero");
		var5 = Integer.parseInt(str);
		
		int a = 0 , b = 0 , c = 0 , d = 0 ;
		
		if ((var1 < 0 )) {
				
			a = var1 ;
						
		}else if ((var1 >= 0 && var1 <= 25) ) {
			
			b = var1 ;
			
			} else if (var1 >= 26 && var1 <= 250) {
				
				c = var1;
				
				} else if (var1 > 250) {
					
					d = var1 ;
					}
		
		
		
		int a1 = 0 , b1 = 0 , c1 = 0 , d1 = 0 ;
				
		if ((var2 < 0 )) {
						
			a1 = var2 ;
								
				} else if ((var2 >= 0 && var2 <= 25) ) {
					
					b1 = var2 ;
					
					} else if (var2 >= 26 && var2 <= 250) {
						
						c1 = var2;
						
						} else if (var2 > 250) {
							
							d1 = var1 ;
							}
				
		int a2 = 0 , b2 = 0 , c2 = 0 , d2 = 0 ;
				
		if ((var3 < 0 )) {
						
				a2 = var3 ;
								
			} else if ((var3 >= 0 && var3 <= 25) ) {
					
				b2 = var3 ;
					
				} else if (var3 >= 26 && var3 <= 250) {
						
					c2 = var3;
						
					} else if (var3 > 250) {
							
						d2 = var3 ;
						}
		
		int a3 = 0 , b3 = 0 , c3 = 0 , d3 = 0 ;
		
		if ((var4 < 0 )) {
						
				a3 = var4 ;
								
			} else if ((var4 >= 0 && var4 <= 25) ) {
					
				b3 = var4 ;
					
				} else if (var4 >= 26 && var4 <= 250) {
						
					c3 = var4;
						
					} else if (var4 > 250) {
							
						d3 = var4 ;
						}
		
		int a4 = 0 , b4 = 0 , c4 = 0 , d4 = 0 ;
		
		if ((var5 < 0 )) {
						
				a4 = var5 ;
								
			} else if ((var5 >= 0 && var5 <= 25) ) {
					
				b4 = var5 ;
					
				} else if (var5 >= 26 && var5 <= 250) {
						
					c4 = var5;
						
					} else if (var5 > 250) {
							
						d4 = var5 ;
						}
		
		System.out.println("la suma de los numeros negativos es: " + (a + a1 + a2 + a3 + a4 ));
		System.out.println("la suma de los numeros entre 0 y 25 es: " + (b + b1 + b2 + b3 + b4 ));
		System.out.println("la suma de los numeros entre 26 y 250 es: " + (c + c1 + c2 + c3 + c4 ));
		System.out.println("la suma de los numeros mayores a 250 es: " + (d + d1 + d2 + d3 + d4 ));
			
	}


}
