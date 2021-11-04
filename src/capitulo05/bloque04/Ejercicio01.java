package capitulo05.bloque04;

import java.util.Iterator;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		int array[] = new int[20];
		int arrayImpares[] = new int[i];
		
		System.out.println("El array creado es:");
		
		for ( i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
			System.out.print(array[i] + " ");
			
		}
		
		for ( i = 0; i < arrayImpares.length; i++) {
			if (array[i] % 2 == 1) {
				arrayImpares[i] = array[i];
			}
			
		}
		System.out.println(arrayImpares[i]);
		
		
	}

}
