package capitulo05.bloque01;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		int array[] = new int[10];
		int sumaIndicesPares = 0;
		
		System.out.println("El array creado es:");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
			System.out.print(array[i] + " ");
		}
		
		for (int i = 0; i < array.length; i++) {
			
			if(i % 2 == 0) {
				sumaIndicesPares += array[i];
			}
			
		}
		
		System.out.println("\nLa suma de los numeros pares es: " + sumaIndicesPares);

	}

}
