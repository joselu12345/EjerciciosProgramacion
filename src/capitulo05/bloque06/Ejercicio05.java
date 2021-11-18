package capitulo05.bloque06;

public class Ejercicio05 {

	public static void main(String[] args) {

		char[][] array = new char[20][10];
		inicializarArray(array);
		imprimirArray(array);
	}

	public static void inicializarArray(char[][] matriz) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				int num = (int) Math.round(Math.random() * 1);
				char relleno = (char) (num + '0');
				
				if (i == 0 || i == matriz.length - 1) {
					matriz[i][j] = '*';
					
				} else if (j == 0 || j == matriz[0].length - 1) {
					matriz[i][j] = '*';
					
				} else {
					matriz[i][j] = relleno;
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
