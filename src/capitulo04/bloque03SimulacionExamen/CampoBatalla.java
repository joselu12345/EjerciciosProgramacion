package capitulo04.bloque03SimulacionExamen;

import java.util.Arrays;

public class CampoBatalla {
	
	private String nombre;
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
			
			instance.dispara(primerHumanoVivo, primerMalvadoVivo, arrayStatsMalvados, arrayStatsHumanos);
			
			if(instance.getPrimerPersonajeVivo(arrayHumano) == null) {
				algunVivo = false;
				System.out.println("Los malvados han ganado");
			}
			
			if (instance.getPrimerPersonajeVivo(arrayMalvado) == null) {
				algunVivo = false;
				System.out.println("Los Humanos han ganado");
			}
			
			for (byte i = 0; i < arrayStatsHumanos.length; i++) {
				mayor = arrayStatsHumanos[0];
				if (mayor < arrayStatsHumanos[i]) {
					mayor = arrayStatsHumanos[i];
					indiceMasDificil = i;
				}
			}
			
			System.out.println("El humano mas resistente es: " + arrayHumano[indiceMasDificil].toString() + " muriendo con " + mayor + " disparos");
			mayor = 0;
			indiceMasDificil = 0;
			
			for (byte i = 0; i < arrayStatsHumanos.length; i++) {
				mayor = arrayStatsMalvados[0];
				if (mayor < arrayStatsMalvados[i]) {
					mayor = arrayStatsMalvados[i];
					indiceMasDificil = i;
				}
			}
			
			System.out.println("El malvado mas resistente es: " + arrayMalvado[indiceMasDificil].toString() + " muriendo con " + mayor + " disparos ");
			
		} while(algunVivo = true);
	}
	
	public void dispara (Humano h, Malvado m, byte arrayStatsMalvados[], byte arrayStatsHumanos[]) {
		byte danio = 0;
		int i = 0, j = 0;
		
		danio = (byte) Math.round(Math.random() * (25 - 5) + 5);
		m.setPuntosVida(m.getPuntosVida() - danio);
		disparosM = contadorDisparos(disparosM);
		if (m.getPuntosVida() <= 0) {
			m.setVivo(false);
			System.out.println(m.toString() + " Disparos para morir: " + disparosM);
			arrayStatsMalvados[i] = disparosM;
			disparosM = 0;
			i++;
		}
		
		danio = (byte) Math.round(Math.random() * (25 - 5) + 5);
		h.setPuntosVida(h.getPuntosVida() - danio);
		disparosH = contadorDisparos(disparosH);
		if (h.getPuntosVida() <= 0) {
			h.setVivo(false);
			System.out.println(h.toString() + " Disparos para morir: " + disparosH);
			arrayStatsHumanos[i] = disparosH;
			disparosH = 0;
			j++;
		}
	}
	
	private byte contadorDisparos(byte c) {
		c++;
		return c;
	}
	
	public Personaje getPrimerPersonajeVivo(Personaje array[]) {
		for (Personaje p : array) {
			if (p.isVivo()) {
				return p;
			}
		}
		return null;
		
	}
	
	public CampoBatalla() {
		this.nombre = "Campo 1";
		
		for (int i = 0; i < arrayHumano.length; i++) {
			arrayHumano[i] = new Humano();
		}		
		arrayHumano[arrayHumano.length - 1].setPuntosVida(arrayHumano[arrayHumano.length - 1].getPuntosVida() * 2);
		
		for (int i = 0; i < arrayMalvado.length; i++) {
			arrayMalvado[i] = new Malvado();			
		}
		arrayMalvado[arrayMalvado.length - 1].setPuntosVida(arrayMalvado[arrayMalvado.length - 1].getPuntosVida() * 2);
		
	}

	public CampoBatalla(String nombre, Humano[] arrayHumano, Malvado[] arrayMalvado) {
		this.nombre = nombre;
		this.arrayHumano = arrayHumano;
		this.arrayMalvado = arrayMalvado;
	}

	public Humano[] getArrayHumano() {
		return arrayHumano;
	}

	public void setArrayHumano(Humano[] arrayHumano) {
		this.arrayHumano = arrayHumano;
	}

	public Malvado[] getArrayMalvado() {
		return arrayMalvado;
	}

	public void setArrayMalvado(Malvado[] arrayMalvado) {
		this.arrayMalvado = arrayMalvado;
	}

	@Override
	public String toString() {
		return "CampoBatalla [nombre=" + nombre + ", arrayHumano=" + Arrays.toString(arrayHumano) + ", arrayMalvado="
				+ Arrays.toString(arrayMalvado) + "]";
	}
	
	
	
	
	
	
	
	

}