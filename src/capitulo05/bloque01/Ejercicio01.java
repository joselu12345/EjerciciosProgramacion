package capitulo05.bloque01;

public class Ejercicio01 {

	public static void main(String[] args) {

		int array[] = new int[150];

		int suma = 0, mayor = 0, menor = 0; 
		float media = 0;
		
		System.out.print("el array creado es: \n");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);

			System.out.print(array[i] + " ");
			
			suma += array[i]; 
			media = (float) suma/array.length;
		}	
			
			menor = mayor = array[0];
			
		 for (int i = 1; i < array.length; i++) {
				
				if (array[i] > mayor ) {
					mayor = array[i];
				}
				if (array[i] < menor) {
					menor = array[i];
				}
				
			}
			
			

		
		System.out.println("\nla suma del array es: " + suma);
		System.out.println("la media del array es: " + media);
		System.out.println("el mayor es: " + mayor);
		System.out.println("el menor es: " + menor);	
		
		

	}

}
