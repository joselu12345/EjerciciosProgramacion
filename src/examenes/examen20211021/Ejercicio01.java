package examenes.examen20211021;

public class Ejercicio01 {
	
public static void main (String[] args) {
		
		//declaramos las variables y las inicializamos
		
		int numero = 0, suma = 0, sumaImpares = 0, contadorImpares = 0 ; 
		float media = 1;
		
		for (int i = 0; i < 10; i++) { // iniciamos el blucle for para que se repita 10 veces
			
			numero = (int) Math.round(Math.random() * 100); //creamos numeros al azar
			
			System.out.println("numero al azar: " + numero);
			
			//si el numero es divisor de 5 se suma
			if (numero % 5 == 0) {
				suma += numero;
			}
			
			//si el numero es par lo sumamos y contamos para luego hacer la media
			if (numero % 2 == 1) {
				sumaImpares += numero;
				contadorImpares++;
				media = (float) sumaImpares/contadorImpares;
			}
			
			
		}
		
		System.out.println("la suma de los multiplos de 5 es: " + suma);
		
		
		System.out.println("la media de los numeros impares es: " + media);
		
		
		
	}


}
