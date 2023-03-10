package ejercicio08Ej06Tema04;

import java.util.Comparator;

public class CompararPorNombre implements Comparator <Cuenta>{

	@Override
	public int compare(Cuenta c1, Cuenta c2) {
		String nombre1 = c1.getC().getNombre();
		String nombre2= c2.getC().getNombre();
		
		return nombre1.toLowerCase().compareTo(nombre2.toLowerCase());
	}

}
