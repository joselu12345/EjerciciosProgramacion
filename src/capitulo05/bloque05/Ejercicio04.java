package capitulo05.bloque05;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		int [][] matriz = crearMatriz();
		boolean solucion = positiva(matriz);
		System.out.println(solucion);
		boolean solucion1 = diagonal(matriz);
		System.out.println(solucion1);
		boolean solucion2 = dispersa(matriz);
		System.out.println(solucion2);
		boolean solucion3 = matrizTriangular(matriz);
		System.out.println(solucion3);
		int [] arrayFinal = convertirArray(matriz);
		int [][] traspuesta = trasponerMatriz(matriz);
		int [][] opuesta = oponerMatriz(matriz);
		int [][] sinfila = quitarFila(matriz);		
	}
	
	
	
	public static int[][] crearMatriz(){
		String str;
		int a, b;
		str = JOptionPane.showInputDialog("introduzca el numero de filas: ");
		a = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("introduzca el numero de columnas: ");
		b = Integer.parseInt(str);
		
		int matriz [][] = new int [a][b];
		
		for (int i = 0; i < matriz.length; i++) {
			matriz[i][i] = (int) Math.round(Math.random() * 100);
			for (int j = 0; j < matriz.length; j++) {
				matriz [i][j] = (int) Math.round(Math.random() * 100);
				System.out.print(matriz[i][j] + "\t");				
			}
			System.out.println("");
		
		}
		return matriz;
	}
	
	public static boolean positiva(int [][] matriz) {
		
		boolean esPositiva = false;
		System.out.println("");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println(matriz[i][j] + "\t");
				if (matriz [i] [j] >= 0) {
					esPositiva = true;
				}
			}
			System.out.print("");
		}
		return esPositiva;
	}
	
	public static boolean diagonal(int[][] matriz) {
		
		boolean esDiagonal = false;
		System.out.println("");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println(matriz [i][j] + "\t");
				if (i != j && matriz [i][j] == 0) {
					esDiagonal = true;
				}
			}
			System.out.println("");
		}
		return esDiagonal;
	}
	
	public static int[] convertirArray(int[][] matriz) {
		int i = 0;
		int j = 0;
		int contador = matriz.length * matriz[i].length;
		int union [] = new int [contador];
		int c = 0;
		System.out.println("");
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				union[c] = matriz[i][j];
				c++;
			}
		}
		for (c = 0; c < contador; c++) {
			System.out.println(union[c] + "\t");
		}
		System.out.println("");
		return union;
	}
	
	public static int [][] trasponerMatriz (int[][] matriz ){
		int i = 0;
		int j = 0;
		int matrizOpesta[][] = new int [matriz.length][matriz[i].length];
		System.out.println("");
		for (j = 0; j < matriz[j].length; j++) {
			for (i = 0; i < matriz[j].length; i++) {
				System.out.println(matriz[i][j] + "\t");				
			}
			System.out.println("");
		}
		return matriz;
	}
	
	public static int [][] oponerMatriz(int[][] matriz){
		int i = 0;
		int j = 0;
		System.out.println("");
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz.length; j++) {
				if (matriz[i][j] < 0) {
					matriz[i][j] = -1 * (matriz[i][j]);
				}
				if (matriz[i][j] > 0) {
					matriz[i][j] = -1 * (matriz[i][j]);
				}
				System.out.println(matriz [i][j] + "\t");
			}
			System.out.println("");
		}
		return matriz;
	}
	
	public static int[][] quitarFila(int[][] matriz) {
		int i = 0;
		int j = 0;
		String str = JOptionPane.showInputDialog("indique la fila que desea quitar: ");
		int quitar = Integer.parseInt(str);
		System.out.println("");
		for (i = 0; i < matriz.length; i++) {
			if (i != quitar) {
				for (j = 0; j < matriz.length; j++) {
					System.out.println(matriz[i][j] + "\t");
				}
			}
			System.out.println("");
		}
		return matriz;
	}
	
	public static boolean dispersa(int[][] matriz) {
		int i = 0;
		int j = 0;
		boolean esDispersa = false;
		System.out.println("");
		for (i = 0; i < matriz.length; i++) {
			esDispersa = false;
			for (j = 0; j < matriz.length; j++) {
				if (matriz[i][j] == 0) {
					esDispersa = true;
				}
				System.out.println(matriz[i][j] + "\t");
			}
			System.out.println("");
		}
		return esDispersa;
	}
	
	public static boolean matrizTriangular (int[][] matriz) {
		int i = 0;
		int j = 0;
		boolean esTriangular = false;
		System.out.println("");
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				if ((j < i) && (matriz[i][j] == 0)) {
					esTriangular = true;
				}
				System.out.println(matriz[i][j] + "\t");
			}
			System.out.println("");
		}
		return esTriangular;
	}
	
}
