package capitulo05.bloque03;

public class Ejercicio01 {
	
	public static void main (String[] args) {
		
		int array[] = new int[150];
		
		System.out.println("El array creado es:");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 1000);
			System.out.print(array[i] + " ");
			
		}
		int i, j, aux;		
		
		System.out.println("\nEl array ordenado es: ");
		
		for ( i = 0; i < array.length - 1; i++) {
			for (j = 0; j < (array.length - i - 1); j++) {
				
				if (array[j + 1] < array[j]) {
					aux = array[j + 1];
					array[j + 1] = array[j];
					array[j] = aux;
				}				
				
			}
			
		}
		for ( i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		
	}

}
