package capitulo02.bloque03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	
public static void main(String[] args) {
		
		System.out.println("1 - Hipotenusa del triangulo");
		System.out.println("2 - Superficie de circumferencia");
		System.out.println("3 - Perímetro de la circumferencia");
		System.out.println("4 - Área rectángulo");
		System.out.println("5 - Área triangulo");
		System.out.println("0 - Salir");		
		
		String str;		
		int opcion;
		double hipotenusa, sCircunferencia, pCircunferencia, aRectangulo, aTriangulo, cateto1, cateto2, radio, base, altura ;
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Escoja una opción");		
		opcion = sc.nextInt();
		
		switch(opcion) {
		
			case 1:
				str = JOptionPane.showInputDialog("Introduce el cateto 1");
				cateto1 = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("Introduce el cateto 2");
				cateto2 = Integer.parseInt(str);
				
				hipotenusa = Math.pow((Math.pow(cateto1, 2) +  Math.pow(cateto2, 2)), 1/2.f);
				System.out.println("La hipotenusa es: " + hipotenusa);
				
				break;
				
			case 2: 
				str = JOptionPane.showInputDialog("Introduce el radio de la circunferencia");
				radio = Integer.parseInt(str);
				
				sCircunferencia =  Math.PI * Math.pow(radio, 2);
				System.out.println("La superficie de la circumferencia es: " + sCircunferencia);
				
				break;
				
			case 3:
				str = JOptionPane.showInputDialog("Introduce el radio de la circunferencia");
				radio = Integer.parseInt(str);
				
				pCircunferencia = Math.PI * 2 * radio;
				System.out.println("El perímetro de la circumferencia es: " + pCircunferencia);
				
				break;
				
			case 4:
				str = JOptionPane.showInputDialog("Introduce la base del rectangulo");
				base = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("Introduce la altura del rectangulo");
				altura = Integer.parseInt(str);
				
				aRectangulo = base * altura;
				System.out.println("El área del rectangulo es: " + aRectangulo);
				
				break;
				
			case 5:
				str = JOptionPane.showInputDialog("Introduce la base del triangulo");
				base = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("Introduce la altura del triangulo");
				altura = Integer.parseInt(str);
				
				aTriangulo = (base * altura)/2;
				System.out.println("El área del triángulo es: " + aTriangulo);
				
				break;
				
			case 0:
				System.exit(0);
				
			default:
				System.out.println("opcion incorrecta");
				return;
		}
				
	}

}
