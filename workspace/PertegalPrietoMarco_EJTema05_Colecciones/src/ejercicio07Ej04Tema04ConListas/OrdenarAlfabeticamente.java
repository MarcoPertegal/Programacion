package ejercicio07Ej04Tema04ConListas;

import java.util.Comparator;

public class OrdenarAlfabeticamente implements Comparator <LineaVenta>{

	@Override
	public int compare(LineaVenta lineaV1, LineaVenta lineaV2) {
		String nombre1 = lineaV1.getP().getNombre();
		String nombre2 = lineaV2.getP().getNombre();
		
		return (nombre1.toLowerCase().compareTo(nombre2.toLowerCase()));
	}
	
}
