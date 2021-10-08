package capitulo02.bloque03;

import java.util.Scanner;

public class Ejercicio02 {
	
public static void main (String[] args) {
		
		System.out.println("1 - Raiz");
		System.out.println("2 - Potencia");
		System.out.println("3 - Modulo");
		System.out.println("4 - Salir");
		
		int opcion,potencia, modulo,  dividendo, divisor;
		float base, exponente, raiz;
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Escoja una opción");		
		opcion = sc.nextInt();
		
		switch(opcion) {
		
			case 1:
			
				Scanner varRaiz1 = new Scanner(System.in);		
				System.out.println("Introduzca la base: ");		
				base = varRaiz1.nextFloat();
				
				Scanner varRaiz2 = new Scanner(System.in);		
				System.out.println("Introduzca el exponente: ");		
				exponente = varRaiz2.nextFloat();
				
				raiz = (float) Math.pow(base, 1/exponente);
				System.out.println("la raiz es: " + raiz);
				
				break;
				
			case 2:
				
				Scanner varPotencia1 = new Scanner(System.in);		
				System.out.println("Introduzca la base: ");		
				base = varPotencia1.nextInt();
				
				Scanner varPotencia2 = new Scanner(System.in);		
				System.out.println("Introduzca el exponente: ");		
				exponente = varPotencia2.nextInt();
				
				potencia = (int) Math.pow(base, exponente);
				System.out.println("la potencia es: " + potencia);
				
				break;
				
			case 3:
				
				Scanner varModulo1 = new Scanner(System.in);		
				System.out.println("Introduzca el dividendo: ");		
				dividendo = varModulo1.nextInt();
				
				Scanner varModulo2 = new Scanner(System.in);		
				System.out.println("Introduzca el divisor: ");		
				divisor = varModulo2.nextInt();
				
				modulo = dividendo % divisor;
				System.out.println("el modulo es: " + modulo);
				
				break;
				
			case 4:
				
				return;
				
			default:
				
				System.out.println("Introduzca una de las cuatro opciones");
		}
		
	}


}
