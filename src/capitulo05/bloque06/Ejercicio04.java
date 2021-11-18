package capitulo05.bloque06;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		int i, j = 0;
		char matriz[][] = new char[10][20];
		
		for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
            	
            	if (i == 0 || i == matriz.length - 1) {
            		
            		System.out.print("*");
            		
            	} else {
            		
            		if (i == 0 || i == matriz.length - 1) {
            			System.out.println("*");
            		}
            		if (i != 0 && i == matriz.length -1) {
            			System.out.println(" ");
            		}
            	}
                if (i == matriz.length - 1) {
                	System.out.println("\n");
                }
                	
            }
            
        }

	}

}
