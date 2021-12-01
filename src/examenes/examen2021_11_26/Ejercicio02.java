package examenes.examen2021_11_26;

public class Ejercicio02 {
	
	public static void main(String[] args) {

		char[][] array = new char[10][10];
		inicializarArray(array);
		imprimirArray(array);
	}

	public static void inicializarArray(char[][] matriz) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
					
				if (i == 0 || i == matriz.length - 1 || j == 0 || j == matriz[0].length - 1) {
					matriz[i][j] = '*';
					
				} else if (matriz[i][j] % 2 == 1) {
					matriz[i][j] = '0';
					
				} else {
					matriz[i][j] = '1';
				}

			}
		}
	}
	
	public static void imprimirArray(char[][] array) {
		
		for(char [] i : array) {
			for(char j : i) {
				System.out.print(j + "  ");
			}
			System.out.println();
		}
		
	}

}
