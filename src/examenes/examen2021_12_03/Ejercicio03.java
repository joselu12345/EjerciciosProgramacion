package examenes.examen2021_12_03;

public class Ejercicio03 {
	
public static void main(String[] args) {
		
		float array[]  = new float [10];
		
		
		for (int i = 1; i < array.length - 1; i++) {
			
			array[0] = 1;
			
			array[i] = ((array[i] * (array[i - 1])) + (array[i - 1]/2));

		}
		
		for (int i = 0; i < array.length; i++) {
			
		
			System.out.print(array[i] + "    ");

		}
		
	}

}
