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
		
		int a = 0 , b = 0 , c = 0 , d = 0 , e = 0;
		
		if ((var1 >= 0 && var1 <= 25) || (var2 >= 0 && var2 <= 25) || (var3 >= 0 && var3 <= 25) || (var4 >= 0 && var4 <= 25) || (var5 >= 0 && var5 <= 25)){
			
			a = var1 ;
			b = var2 ;
			c = var3 ;
			d = var4 ;
			e = var5 ;
			
			System.out.println("La suma de numeros entre 0 y 25 es: " + (a + b + c + d + e));
			
		} else if ((var1 >= 26 && var1 <=250) || (var2 >= 26 && var2 <=250) || (var3 >= 26 && var3 <=250) || (var4 >= 26 && var4 <=250) || (var5 >= 26 && var5 <=250)) {
			
			System.out.println("La suma de numeros entre 26 y 250 es: " + (var1 + var2 + var3 + var4 + var5));
			
		}
			
		
			
		
		
	}


}
