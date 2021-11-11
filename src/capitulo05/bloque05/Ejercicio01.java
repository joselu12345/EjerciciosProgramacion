package capitulo05.bloque05;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		
		
		int array[] = new int[(int) Math.round(Math.random()*100)];
		
		System.out.println("El array creado es:");
		
		int i;
		
		for ( i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 1000);
			System.out.print(array[i] + " ");
			
		}
		
		System.out.print("\nLa longitud del array es: " + array.length);
		
		int longitud = array.length;
		int posicion;
		
		if (array.length % 2 == 1) {
			
			posicion = longitud / 2;
			i = posicion;
			
			System.out.println("\nLa posicion central es: " + posicion);
			System.out.println("El valor central del array es: " + array[i]);	
		}
		if (array.length % 2 == 0) {
			
			System.out.println("\n-1");
			
		}
		

	}

}
