package capitulo04.bloque03SimulacionExamen;

public class Partida {

	public static void main(String[] args) {
		
		CampoBatalla.getInstance().mezclarArray(CampoBatalla.getInstance().getArrayHumano());
		CampoBatalla.getInstance().mezclarArray(CampoBatalla.getInstance().getArrayMalvado());
		CampoBatalla.getInstance().batalla();

	}

}
