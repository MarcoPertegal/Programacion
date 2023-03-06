package ejercicio06;

import java.util.Comparator;

public class CompararPorSueldo implements Comparator <Trabajador>{

	@Override
	public int compare(Trabajador t1, Trabajador t2) {
		double trabajador1 = t1.getSueldo();
		double trabajador2 = t2.getSueldo();
		
		if (trabajador1 < trabajador2) {
			return -1;
		}else {
			if (trabajador1 > trabajador2) {
				return 1;
			}
			return 0;
		}
	}
	
}
