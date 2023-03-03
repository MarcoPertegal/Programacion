package ejercicio04;

import java.util.Comparator;

public class CompararPorID implements Comparator<Contacto>{

	@Override
	public int compare(Contacto c1, Contacto c2) {
		int id1 = c1.getId();
		int id2 = c2.getId();
		
		if(id1 < id2) {
			return -1;
		}else {
			if(id1 > id2) {
				return 1;
			}
			return 0;
		}
	}

}
