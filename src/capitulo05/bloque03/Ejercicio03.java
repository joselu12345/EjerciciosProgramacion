package capitulo05.bloque03;

public class Ejercicio03 {
	
	public static void main (String[] args) {
		
		int array[] = new int[150];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 1000);
			System.out.print(array[i] + " ");
			
		}
		
	}

}
