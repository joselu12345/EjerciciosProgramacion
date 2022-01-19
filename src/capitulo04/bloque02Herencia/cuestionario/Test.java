package capitulo04.bloque02Herencia.cuestionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int contador = 0;
		List <Pregunta> Test = new ArrayList <Pregunta>();
		VoF Pregunta1 = new VoF("La capital de Andalucia es Cordoba", false);
		VoF Pregunta2 = new VoF("La capital de España es Sevilla", false);
		VoF Pregunta3 = new VoF("El mejor equipo de futbol del mundo es el AT. Madrid", true);
		OpcionUnica Pregunta4 = new OpcionUnica("¿En que año se descubrio America?", 0 , "1492", "1512", "1365", "1624");
		OpcionUnica Pregunta5 = new OpcionUnica("¿Quien descubrio America?" , 0 , "Cristobal Colon", "Carlos V", "Gandhi", "Magallanes");
		
		Test.add(Pregunta1);
		Test.add(Pregunta2);
		Test.add(Pregunta3);
		Test.add(Pregunta4);
		Test.add(Pregunta5);
		
		for (Pregunta P : Test) {
			boolean respuestaVoF = true;
			int respuestaOpcionUnica = 0;
			
			Scanner sc = new Scanner(System.in);
			if (P instanceof VoF) {
				System.out.println(P.getEnunciado());
				respuestaVoF = sc.hasNextLine();
				
				((VoF) P).ComprobarRespuesta(respuestaVoF);
				
				if (respuestaVoF == ((VoF) P).getRespuesta()) {
					contador++;
				}
			}
			
			if (P instanceof OpcionUnica) {
				System.out.println(P.getEnunciado());
				System.out.println("0 - " + ((OpcionUnica) P).getOpcion1());
				System.out.println("1 - " + ((OpcionUnica) P).getOpcion2());
				System.out.println("2 - " + ((OpcionUnica) P).getOpcion3());
				System.out.println("3 - " + ((OpcionUnica) P).getOpcion4());
				respuestaOpcionUnica = sc.nextInt();
				
				((OpcionUnica) P).ComprobarRespuesta(respuestaOpcionUnica);
				if (respuestaOpcionUnica == ((OpcionUnica) P).getRespuesta()) {
					contador++;
				}
			}
		}
		System.out.println("Respuesta acertadas: " + contador);

	}

}
