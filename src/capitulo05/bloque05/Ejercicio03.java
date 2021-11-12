package capitulo05.bloque05;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		float array[] = new float[20];
		int entero;
		float decimal;
		int contador = 0;
		
		for (int i = 0; i < array.length; i++) {
			entero = (int) Math.round(Math.random() * 100);
			decimal = (float) Math.round(Math.random() * 100) / 100;
			
			array[i] = entero + decimal;
			
			if (decimal <= 0.49) {
				contador ++;	 
				System.out.print(array[i] + " - ");
			}
		}
		System.out.println("\nLa cantidad de numeros cuyo decimal esta comprendido entre 0.00 y 0.49 es: " + contador);		
	}

}
