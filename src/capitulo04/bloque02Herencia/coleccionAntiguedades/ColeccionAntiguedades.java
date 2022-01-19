package capitulo04.bloque02Herencia.coleccionAntiguedades;

import javax.swing.JOptionPane;

public class ColeccionAntiguedades {

	public static void main(String[] args) {
		
		int var, var1;
		String str;
		Antiguedad arrayAntiguedad[] = new Antiguedad[4];
		
		do {
			
			str = JOptionPane.showInputDialog("�Que desea hacer?" 
													+ "\n0 - Salir" 
													+ "\n1 - Introducir antiguedad"
													+ "\n2 - Mostrar antiguedades");
			var = Integer.parseInt(str); 
			
				switch (var) {
				
				case 0:
					break;
					
				case 1:
					
					for (int i = 0; i < arrayAntiguedad.length; i++) {
						
						str = JOptionPane.showInputDialog("�Que tipo de antiguedad es?" 
																+ "\n1 - Joya"
																+ "\n2 - Libro"
																+ "\n3 - Mueble"
																+ "\n4 - Coche");
						
						var1 = Integer.parseInt(str);
						
						switch (var1) {
						
						case 1:
							
							if (arrayAntiguedad[i] == null) {
								arrayAntiguedad[i] = new Joya();
			
								String metalFabricacion = JOptionPane.showInputDialog("Metal de Fabricacion: ");
								((Joya)arrayAntiguedad[i]).setMetalFabricacion(metalFabricacion);
								
								String añoFabricacion = JOptionPane.showInputDialog("A�o de Fabricacion: ");
								arrayAntiguedad[i].setAnioFabricacion(añoFabricacion);
			
								String origen = JOptionPane.showInputDialog("Origen: ");
								arrayAntiguedad[i].setOrigen(origen);
			
								str = JOptionPane.showInputDialog("precio: ");
								arrayAntiguedad[i].setPrecio(Double.parseDouble(str));
								
							}
							break;
							
						case 2:
							
							if (arrayAntiguedad[i] == null) {
								arrayAntiguedad[i] = new Libro();
			
								String autor = JOptionPane.showInputDialog("Autor: ");
								((Libro)arrayAntiguedad[i]).setAutor(autor);
								
								String añoFabricacion = JOptionPane.showInputDialog("A�o de Fabricacion: ");
								arrayAntiguedad[i].setAnioFabricacion(añoFabricacion);
			
								String origen = JOptionPane.showInputDialog("Origen: ");
								arrayAntiguedad[i].setOrigen(origen);
			
								str = JOptionPane.showInputDialog("precio: ");
								arrayAntiguedad[i].setPrecio(Double.parseDouble(str));
								
							}
							
							break;
							
						case 3:
							
							if (arrayAntiguedad[i] == null) {
								arrayAntiguedad[i] = new Mueble();
			
								String tamaño = JOptionPane.showInputDialog("Tama�o: ");
								((Mueble)arrayAntiguedad[i]).setTamaño(tamaño);
								
								String añoFabricacion = JOptionPane.showInputDialog("A�o de Fabricacion: ");
								arrayAntiguedad[i].setAnioFabricacion(añoFabricacion);
			
								String origen = JOptionPane.showInputDialog("Origen: ");
								arrayAntiguedad[i].setOrigen(origen);
			
								str = JOptionPane.showInputDialog("precio: ");
								arrayAntiguedad[i].setPrecio(Double.parseDouble(str));
								
							}
							break;
							
						case 4:
							
							if (arrayAntiguedad[i] == null) {
								arrayAntiguedad[i] = new Coche();
			
								String marca = JOptionPane.showInputDialog("Marca del coche: ");
								((Coche)arrayAntiguedad[i]).setMarca(marca);
								
								String añoFabricacion = JOptionPane.showInputDialog("A�o de Fabricacion: ");
								arrayAntiguedad[i].setAnioFabricacion(añoFabricacion);
			
								String origen = JOptionPane.showInputDialog("Origen: ");
								arrayAntiguedad[i].setOrigen(origen);
			
								str = JOptionPane.showInputDialog("precio: ");
								arrayAntiguedad[i].setPrecio(Double.parseDouble(str));
								
							}
							break;
							
						default:
							System.out.println("La variable introducida no es valida");
							
						}
						
					}
					break;	
					
						
				case 2:
					
					for (int i = 0; i < arrayAntiguedad.length; i++) {
						if (arrayAntiguedad[i] != null) {
							System.out.println(arrayAntiguedad[i].toString());
						}
					}
					
					break;
					
				default:
					System.out.println("La variable introducida no es valida");
				
				}
			
		} while (var != 0);
		
	}
}
