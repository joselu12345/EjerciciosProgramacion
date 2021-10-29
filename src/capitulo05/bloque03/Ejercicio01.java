package capitulo05.bloque03;

public class Ejercicio01 {
	
	public static void main (String[] args) {
		
		int array[] = new int[15];
		
		System.out.println("El array creado es:");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 1000);
			System.out.print(array[i] + " ");
			
		}
		int iteracion = 0;
		boolean permutacion;
		
		System.out.println("\nEl array ordenado es: ");
		
		while (permutacion =  true) {
			permutacion = false;
			iteracion++;
			for (int i = 0; i < (array.length - iteracion); i++) {
				
				if (array[i] < array[i + 1]) {
					permutacion = true;
					array[i] = array[i +1];
				}
				
				
				
			}
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			
		}
			
		
		
	}

}
