package capitulo02.bloque03;

public class Ejercicio01 {
	
	public static void notaClase() {
		
		int nota = 11;
		
		switch (nota) {
		
		case 0:
		case 1:
		case 2:
			System.out.println("Muy deficiente");
			break;
		case 3:
		case 4:
			System.out.println("Suspenso");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Has introducido un valor incorrecto");
		
		}
	}

}
