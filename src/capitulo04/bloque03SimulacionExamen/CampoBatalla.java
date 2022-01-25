package capitulo04.bloque03SimulacionExamen;

import java.util.Iterator;

public class CampoBatalla {
	
	private Humano arrayHumano[] = new Humano [20];
	private Malvado arrayMalvado[] = new Malvado [20];
	private byte disparosM = 0;
	private byte disparosH = 0;
	
	private static CampoBatalla instance = null;
	
	public static CampoBatalla getInstance() {
		if(instance == null) {
			instance = new CampoBatalla();
		}
		return instance;
	}
	
	public void mezclarArray(Personaje array[]) {
		byte random = 0;
		Personaje aux = null;
		for (int i = 0; i < array.length; i++) {
			random = (byte) Math.round(Math.random() * array.length -2);
			if (random < 0 || random > 10) {
				i--;
				break;
			}
			aux = array[random];
			array[random] = array[random + 1];
			array[random + 1] = aux;
		}
	}
	
	public void batalla() {
		boolean algunVivo = true;
		byte mayor = 0, indiceMasDificil = 0;
		Humano primerHumanoVivo = null;
		Malvado primerMalvadoVivo = null;
		byte arrayStatsMalvados[] = new byte[20];
		byte arrayStatsHumanos[] = new byte[20];
		
		do {
			primerHumanoVivo = (Humano) instance.getPrimerPersonajeVivo(arrayHumano);
			primerMalvadoVivo = (Malvado) instance.getPrimerPersonajeVivo(arrayMalvado);
			
			for (int i = 0; i < arrayHumano.length; i++) {
				System.out.println(arrayHumano[i].toString());
				
			}
			System.out.println("");
			for (int i = 0; i < arrayMalvado.length; i++) {
				System.out.println(arrayMalvado[i].toString());
			}
			System.out.println("");
			
		} while(algunVivo = true);
	}

}



















