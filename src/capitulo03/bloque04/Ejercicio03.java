package capitulo03.bloque04;

public class Ejercicio03 {
	
	public static void main (String[] args) {
		
		int factor = 0, multiplicador = 1;
		
		do { 
			factor++;		
		
			do { System.out.println(factor + " x " +  multiplicador  + " = " + (factor * multiplicador));
				multiplicador++;
				
			} while (multiplicador <= 10); 
			  multiplicador = 1;
		
		} while ( factor < 15);
			
      
	}

}
