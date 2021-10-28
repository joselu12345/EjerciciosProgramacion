package capitulo05.bloque01;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		int array[] = new int[150];
		int sumaPares = 0, sumaImpares = 0;
		
		System.out.println("El array creado es:");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
			System.out.print(array[i] + " ");
		}
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] % 2 == 0) {
				sumaPares += array[i];
			}
			if(array[i] % 2 == 1) {
				sumaImpares += array[i];
			}
			
		}
		
		System.out.println("\nLa suma de los numeros pares es: " + sumaPares);
		System.out.println("La suma de los numeros impares es: " + sumaImpares);

	}

}
