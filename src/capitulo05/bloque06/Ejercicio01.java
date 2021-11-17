package capitulo05.bloque06;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		int array[] = new int[7];
		
		System.out.println("Los numeros de la loteria son:");
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 49);
			
			if (i != 0) {
				if (i < array.length) {
					for (int j = i; j > 0; j--) {
						if (array[i] == array[j - 1]) {
							array[i] = (int) Math.round(Math.random() * (49 - 1) + 1);
							j++;
						}
					}
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	
	}

}
