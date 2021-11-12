package capitulo05.bloque05;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		
		int array[] = new int[20];
		int aprobados = 0, suspensos = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 10);
			System.out.print(array[i] + " ");
			
			if (array[i] >= 5) {
				aprobados++;
			}
			if (array[i] < 5) {
				suspensos++;
			}
		}
		
		System.out.println("\nEl porcentaje de aprobados es: " + (aprobados*100)/array.length + "%");
		System.out.println("\nEl porcentaje de suspensos es: " + (suspensos*100)/array.length + "%");	
		
	}

}
