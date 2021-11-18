package capitulo05.bloque06;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		int num = 0, suma = 0, contador = 0;
		float media = 0;
		
		do {
			
			num = (int) Math.round(Math.random() * (1000 - 1) + 1);
			suma += num;
			contador++;
			media = (float) suma / contador;
			
		} while (media < 499.5f || media > 500.5f);
		
		System.out.println("El total de numeros aleatorios generados es: " + contador);

	}

}
