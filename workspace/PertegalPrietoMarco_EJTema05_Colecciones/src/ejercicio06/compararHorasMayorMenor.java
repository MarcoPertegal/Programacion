package ejercicio06;

import java.util.Comparator;

public class compararHorasMayorMenor implements Comparator <Trabajador>{

	@Override
	public int compare(Trabajador t1, Trabajador t2) {
		double horas1 = t1.getHoras();
		double horas2 = t2.getHoras();
		if (horas1 < horas2) {
			return 1;
		}else {
			if (horas1 > horas2) {
				return -1;
			}
		}
		return 0;
	}
	
	//mismo codigo que en la pojo pero ordenar alreves

}
