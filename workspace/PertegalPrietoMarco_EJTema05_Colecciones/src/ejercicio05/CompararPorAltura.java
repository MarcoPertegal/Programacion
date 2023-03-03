package ejercicio05;

import java.util.Comparator;

public class CompararPorAltura implements Comparator <Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {
		double altura1 = p1.getAltura();
		double altura2 = p2.getAltura();
		
		if (altura1 < altura2) {
			return -1;
		}else {
			if (altura1 > altura2) {
				return 1;
			}
			return 0;
		}
	}
	
	
}
