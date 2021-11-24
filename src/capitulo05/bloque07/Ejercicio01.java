package capitulo05.bloque07;

public class Ejercicio01 {

	public static void main(String[] args) {
		int array[] = new int[] {65, 66, 67};
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Los valores del array son: " + array[i]);
		}
		
		String str = stringFromArray(array);
		
		System.out.println("str: " + str);
	}
		
		
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static String stringFromArray (int array[]) {
		
		String arrayPalabras = "";
		
		for (int i = 0; i < array.length; i++) {
			arrayPalabras = arrayPalabras + (char)array[i];
			
		}
		return arrayPalabras;
	}


}
