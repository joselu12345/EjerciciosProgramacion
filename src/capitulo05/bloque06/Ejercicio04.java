package capitulo05.bloque06;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		char[][] array = new char[20][10];
		inicializarArray(array);
		imprimirArray(array);
	}

	public static void inicializarArray(char[][] matriz) {
		
		int fila = (int) Math.round(Math.random() * (18 -1) +1);
		int columna = (int) Math.round(Math.random() * (8 -1) +1);
		

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {				
				
				if (i == 0 || i == matriz.length - 1) {
					matriz[i][j] = '*';
					
				} else if (j == 0 || j == matriz[0].length - 1) {
					matriz[i][j] = '*';
					
				} else if (i == fila && j == columna) {
					matriz[i][j] = '0';
					
				} else {
					matriz[i][j] = ' ';
					
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
