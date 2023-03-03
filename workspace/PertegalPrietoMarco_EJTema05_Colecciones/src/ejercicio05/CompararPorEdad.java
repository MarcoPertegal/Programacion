package ejercicio05;

import java.util.Comparator;

public class CompararPorEdad implements Comparator <Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {
		int edad1 = p1.getEdad();
		int edad2 = p2.getEdad();
		
		if (edad1 < edad2) {
			return -1;
		}else {
			if (edad1 > edad2) {
				return 1;
			}
			return 0;
		}
	}

	
	
	
	
	
	

}
