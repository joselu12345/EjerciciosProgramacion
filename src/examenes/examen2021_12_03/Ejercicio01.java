package examenes.examen2021_12_03;



public class Ejercicio01 {

	public static void main(String[] args) {
		
		

		
		int matriz[][] = new int[][] {  {1,		2, 		3, 		4},
										{5, 	6, 		7, 		8},
										{9,  	10,     11,     12},
										{13, 	14, 	15, 	16}
		};
		
		mostrarMatriz(matriz);
		
		
		
		
		
		
	}
	
	public static void mostrarMatriz (int matriz[][]) {
		System.out.println("Contenido de la matriz");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static boolean esMatrizOrdenada (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if ( i < i+1 && j < j +1 ) {
					return false;
				}
			}
		}
		return true;
	}
	
/**	public static boolean ordenado (int matriz[][]) {
		boolean ordenado;
		
		do {
			ordenado = false;

			for (int i = 0; i < matriz.length - 1; i++) {
				if (matriz[i][j] < matriz[i+1][j]) {
					
					ordenado = true;
				}
			}

		} while (ordenado == true);
		
	}
	
*/		
	


	

}
