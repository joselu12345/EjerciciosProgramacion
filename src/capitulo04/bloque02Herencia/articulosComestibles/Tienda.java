package capitulo04.bloque02Herencia.articulosComestibles;

import javax.swing.JOptionPane;

import capitulo04.bloque01.Ejercicio01_Persona;

public class Tienda {

	public static void main(String[] args) {
		
		Articulo arrayArticulos[] = new Articulo[4];

		String str;
		int var, var1; 

		do {

			str = JOptionPane.showInputDialog("Introduce un articulo" + "\n0 - Salir" + "\n1 - Introducir Datos"
					+ "\n2 - Ver las articulos");
			var = Integer.parseInt(str);

			switch (var) {

			case 0:
				break;

			case 1:
				
				for (int i = 0; i < arrayArticulos.length; i++) {
				
				str = JOptionPane.showInputDialog("¿Que tipo de articulo es?" + "\n1 - Perecedero" + "\n2 - No perecedero");
				var1 = Integer.parseInt(str);
				
				switch (var1) {
				
				case 1:
					System.out.println("Introduzca los datos: ");
					
					
						if (arrayArticulos[i] == null) {
							arrayArticulos[i] = new Perecedero();
	
							String nombre = JOptionPane.showInputDialog("Nombre: ");
							arrayArticulos[i].setNombre(nombre);
	
							String codigo = JOptionPane.showInputDialog("Codigo: ");
							arrayArticulos[i].setCodigo(codigo);
	
							str = JOptionPane.showInputDialog("precio: ");
							arrayArticulos[i].setPrecio(Double.parseDouble(str));
							
							String fechaCaducidad = JOptionPane.showInputDialog("fecha caducidad: ");
							((Perecedero)arrayArticulos[i]).setFechaCaducidad(fechaCaducidad);
							
						}
					
	
					break;
					
				case 2:
					System.out.println("Introduzca los datos: ");
					
					
						if (arrayArticulos[i] == null) {
							arrayArticulos[i] = new Articulo();
	
							String nombre = JOptionPane.showInputDialog("Nombre: ");
							arrayArticulos[i].setNombre(nombre);
	
							String codigo = JOptionPane.showInputDialog("Codigo: ");
							arrayArticulos[i].setCodigo(codigo);
	
							str = JOptionPane.showInputDialog("precio: ");
							arrayArticulos[i].setPrecio(Double.parseDouble(str));
							
						}
					
					break;
				}	
				break;
				
			}
			

			case 2:
				System.out.println("Mostrar datos: ");

				for (int i = 0; i < arrayArticulos.length; i++) {
					if (arrayArticulos[i] != null) {
						System.out.println(arrayArticulos[i].toString());
					}
				}

				break;

			default:
				System.out.println("\nLa variable introducida no es valida");

			}

		} while (var != 0);

	




	}

}
