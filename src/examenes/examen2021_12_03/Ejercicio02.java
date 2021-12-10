package examenes.examen2021_12_03;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		
		int array1[]  = new int [5];
		int array2[]  = new int [5];
		int aleat = (int) Math.round(Math.random());
		boolean aleatorio ;
		
		for (int i = 0; i < array1.length; i++) {			
			array1[i] = (int) Math.round(Math.random() * 100);
			System.out.print(array1[i] + " ");

		}
		
		System.out.println("\nEl array desordenado es: ");
		
/**		for (int i = 0; i < array2.length; i++) {			
			array2[i] = array1[i * aleatorio];
			System.out.print(array2[i] + " ");

		}
*/		
		for (int i = 0; i < array1.length; i++) {
			
			
			do {
				int j = 0;
				aleatorio = false;
				array2[i] = array1[j * aleat];
				
				
				for ( j = 0; j < i; j++) {
					if (array1[i] == array2[j]) {
						aleatorio = true;
					}
				}
			} while (aleatorio == true);
		}
		
		for (int j = 0; j < array2.length; j++) {			
			
			System.out.print(array2[j] + " ");

		}
		
	}

}
