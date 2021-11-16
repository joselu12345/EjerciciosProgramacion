package capitulo05.bloque06;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		int array[] = new int[7];
		int i = 0;
		
		System.out.println("El array creado es:");
		
		
		for (i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 49);
			
			
			
			System.out.print(array[i] + " ");
			
		}
/*		
		public static boolean (int [] array, int numero) {
			
			boolean repetido = false;
			for (i = 0; i < array.length; i++) {
				if (array[i] == numero) {
					repetido = true;
				}else if(array[i] != numero) {
					repetido = false;
				}
			}
			return repetido;
		}
*/
		System.out.println("\n");
		
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	
	}

}
