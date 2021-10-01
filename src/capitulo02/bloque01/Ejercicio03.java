package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		String str;
		int var1, var2, var3, var4, var5;

		str = JOptionPane.showInputDialog("Introduce el primer numero");
		var1 = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("Introduce el segundo numero");
		var2 = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("Introduce el tercer numero");
		var3 = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("Introduce el cuarto numero");
		var4 = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("Introduce el quinto numero");
		var5 = Integer.parseInt(str);

		if (var1 > var2 && var1 > var3 && var1 > var4 && var1 > var5) {
			System.out.println("El numero mayor es: " + var1);
			
		} else if (var2 > var1 && var2 > var3 && var2 > var4 && var2 > var5) {
			System.out.println("El numero mayor es: " + var2);
			}
			
			else if (var3 > var1 && var3 > var2 && var3 > var4 && var3 > var5) {
				System.out.println("El numero mayor es: " + var3);
			}
				
				else if (var4 > var1 && var4 > var2 && var4 > var3 && var4 > var5) {
					System.out.println("El numero mayor es: " + var4);
				} 
					
					else if (var5 > var1 && var5 > var2 && var5 > var3 && var5 > var4) {
						System.out.println("El numero mayor es: " + var5);
					}
	}

}
