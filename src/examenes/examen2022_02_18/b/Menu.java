package examenes.examen2022_02_18.b;

import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		
		int var;
		String str;

		HashMap<String, CromoBaloncesto> hm = new HashMap<String, CromoBaloncesto>();

		hm.put("1", new CromoBaloncesto(1, "Jose", 20, 30));
		hm.put("2", new CromoBaloncesto(2, "Carlos", 50, 60));
		hm.put("3", new CromoBaloncesto(3, "Antonio", 70, 80));

		do {

			str = JOptionPane.showInputDialog(
					"¿Que desea hacer?" + "\n0 - Salir" 
										+ "\n1 - Visualizar los valores de todos los cromos guardados" 
										+ "\n2 - Introducir un nuevo cromo guardado"
										+ "\n3 - Eliminar un cromo, especificando su id numérico"
										+ "\n4 - Imprimir en consola los datos del jugador con mas puntos");
			var = Integer.parseInt(str);

			switch (var) {

			case 0:
				break;

			case 1:
				Iterator<CromoBaloncesto> cromo = hm.values().iterator();
				while (cromo.hasNext()) {
					System.out.println("Objeto obtenido: "  + cromo.next());
				}
					
				break;

			case 2:
				hm.put("1", new CromoBaloncesto(1, "Jose", 20, 30));
/**				
				if (cromo<String> hm == null) {
					cromo = new cromo()<String>;

					str = JOptionPane.showInputDialog("Introduzca el id: ");
					CromoBaloncesto.setId(Integer.parseInt(str));
					
					String nombre = JOptionPane.showInputDialog("Introduzca el nombre: ");
					CromoBaloncesto.setNombre(nombre);

					str = JOptionPane.showInputDialog("Introduzca puntos: ");
					CromoBaloncesto.setPuntos(Integer.parseInt(str));

					str = JOptionPane.showInputDialog("Introduzca rebotes: ");
					CromoBaloncesto.setRebotes(Integer.parseInt(str));
					
				}
				break;
*/				

			case 3:
				
				str = JOptionPane.showInputDialog("Introduzca el id del cromo que quiere borrar");
				
				hm.remove(str);
				
				break;
				
			case 4:
				
				System.out.println("Cromo con mayores puntos: " + hm.get("1"));  
				
				break;
			
			default:
				System.out.println("La variable introducida no es valida");

			}

		} while (var != 0);

	}

}
