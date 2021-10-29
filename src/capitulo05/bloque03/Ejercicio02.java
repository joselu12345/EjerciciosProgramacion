package capitulo05.bloque03;

public class Ejercicio02 {
	
	public static void main (String[] args) {
		
		int array[] = new int[150];
		
		System.out.println("El array creado es:");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 1000);
			System.out.print(array[i] + " ");
			
		}
		
		System.out.println("\nEl array ordenado es:");
		
		int aux, i , j ;
		for ( i = 1; i < array.length; i++) {
			aux = array[i];
			
			for ( j = i ; (j >0) && (aux < array[j-1]); j--) {
				array[j] = array[j-1];
				
			}
			array[j] = aux;
		
		}
		for ( i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
