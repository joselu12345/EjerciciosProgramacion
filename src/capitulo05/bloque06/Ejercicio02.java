package capitulo05.bloque06;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		
		int i, j = 0;
		char matriz[][] = new char[10][30];
		
		for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < (int) Math.round(Math.random() * 30); j++) {
                
                System.out.print("*");
            }
            System.out.println(" ");
        }
		
		
	}

}
