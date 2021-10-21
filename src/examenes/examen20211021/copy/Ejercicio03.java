package examenes.examen20211021.copy;

public class Ejercicio03 {

	public static void main(String[] args) {

		//declaramos las variables 
		int numero = 0, numeroSelec = 0;
		
		//iniciamos el bucle for para que se repita 10 veces
		for (int i = 0; i < 10; i++) {

			numero = (int) Math.round(Math.random() * 100);		// generamos numeros al azar
			
			//introducimos las condiciones para selecionar aquellos numeros que las cumplan
			if (numero %2 == 0 && ((numero >= 20 && numero <= 30) || (numero >= 40 && numero <= 50))) {
				numeroSelec = numero;
				
			}
			
			System.out.println("numero al azar: " + numeroSelec);
			

		}
		
				
	}

}
