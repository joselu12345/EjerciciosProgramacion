package capitulo05.bloque03;

public class Ejercicio04 {
	
	public static void main (String[] args) {
		
		int array[] = new int[150];
		
		System.out.println("El array creado es:");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 1000);
			System.out.print(array[i] + " ");	
			
		}
		
		System.out.println("\nEl array ordenado es:");
		
		int i, j, menor, pos, tmp;
		for (i = 0 ; i < array.length -1 ; i ++) {
			menor = array[i];
			pos = i;
			for (j = i + 1 ; j < array.length ; j++) {
				if (array[j] < menor) {
					menor = array[j];
					pos = j;
				}
			}
			if (pos != i) {
				tmp = array[i];
				array[i] = array[pos];
				array[pos] = tmp;
			}
		}
		
		for ( i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
