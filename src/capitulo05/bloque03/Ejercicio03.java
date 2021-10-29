package capitulo05.bloque03;

public class Ejercicio03 {
	
	public static void main (String[] args) {
		
		int array[] = new int[150];
		
		System.out.println("El array creado es:");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 1000);
			System.out.print(array[i] + " ");
			
		}
		
		System.out.println("\nEl array ordenado es:");
		
		int salto, aux, i;
		boolean cambios;
		
		for (salto = array.length/2; salto != 0 ; salto /= 2) {
			cambios = true;
			while (cambios) {
				cambios = false;
				for (i = salto; i < array.length; i ++) {
					if (array[i - salto] > array[i]) {
						aux = array[i];
						array[i] = array[i - salto];
						array[i - salto] = aux;
						cambios = true;
					}
				}
			}
		}
		
		for ( i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
