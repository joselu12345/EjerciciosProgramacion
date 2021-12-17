package capitulo04.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio01_MenuPersona {

	public static void main(String[] args) {

		Ejercicio01_Persona arrayPersonas[] = new Ejercicio01_Persona[3];

		String str;
		int var;

		do {

			str = JOptionPane.showInputDialog("Menu Personas" + "\n0 - Salir" + "\n1 - Introducir Datos"
					+ "\n2 - Ver las personas introducidas, con todos sus datos");
			var = Integer.parseInt(str);

			switch (var) {

			case 0:
				break;

			case 1:

				System.out.println("Introduzca los datos: ");

				for (int i = 0; i < arrayPersonas.length; i++) {
					if (arrayPersonas[i] == null) {
						arrayPersonas[i] = new Ejercicio01_Persona();

						String nombre = JOptionPane.showInputDialog("Nombre: ");
						arrayPersonas[i].setNombre(nombre);

						String apellido = JOptionPane.showInputDialog("Apellido: ");
						arrayPersonas[i].setApellido(apellido);

						String dni = JOptionPane.showInputDialog("dni: ");
						arrayPersonas[i].setDni(dni);

						String direccion = JOptionPane.showInputDialog("direccion: ");
						arrayPersonas[i].setDireccion(direccion);

						String telefono = JOptionPane.showInputDialog("telefono: ");
						arrayPersonas[i].setTelefono(telefono);
					}
				}

				break;

			case 2:
				System.out.println("Mostrar datos: ");

				for (int i = 0; i < arrayPersonas.length; i++) {
					if (arrayPersonas[i] != null) {
						System.out.println(arrayPersonas[i].toString());
					}
				}

				break;

			default:
				System.out.println("\nLa variable introducida no es valida");

			}

		} while (var != 0);

	}

}
