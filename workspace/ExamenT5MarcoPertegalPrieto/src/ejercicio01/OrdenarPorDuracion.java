package ejercicio01;

import java.util.Comparator;

public class OrdenarPorDuracion implements Comparator <Trayecto>{

	@Override
	public int compare(Trayecto t1, Trayecto t2) {
		double duracion1 = t1.getDuracion();
		double duracion2 = t2.getDuracion();
		
		if (duracion1 < duracion2) {
			return 1;
		}else {
			if (duracion1 > duracion2) {
				return -1;
			}
		}
		return 0;
	}
	
}
