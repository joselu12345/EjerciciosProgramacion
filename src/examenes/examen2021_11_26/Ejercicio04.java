package examenes.examen2021_11_26;

public class Ejercicio04 {
	
public static void main (String[] args) {
		
		int array[] = new int[100];
		float media = 0;
		int suma = 0;
		int debajoMedia = 0;
		int porcentaje = 0;
		
		System.out.println("El array creado es:");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (100 - (-100)) + (-100));
			//System.out.print(array[i] + " ");
			suma += array[i];
			media = (float) suma/array.length;
			if (array[i] < media) {
				debajoMedia++;
			}
			porcentaje = debajoMedia * (array.length/100);
			
		}
		
			
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\nLa media es: " + media);
		System.out.println("\nEl porcentaje por debajo de la media es: " + porcentaje + "%");
		
		
	}

}
