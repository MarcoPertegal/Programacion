package ejercicio09Ej06Tema04ConArrayList;

import java.util.Comparator;

public class OrdenarPorNombre implements Comparator <Cuenta>{

	@Override
	public int compare(Cuenta c1, Cuenta c2) {
		String nombre1 = c1.getC().getNombre();
		String nombre2 = c2.getC().getNombre();
		
		return nombre1.toLowerCase().compareTo(nombre2.toLowerCase());
	}
	
	
}
