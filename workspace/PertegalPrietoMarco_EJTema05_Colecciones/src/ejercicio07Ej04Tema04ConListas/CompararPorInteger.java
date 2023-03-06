package ejercicio07Ej04Tema04ConListas;

import java.util.Comparator;

public class CompararPorInteger implements Comparator <Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		if (i1 > i2) {
			return -1;
		}else {
			if (i1 < i2) {
				return 1;
			}
			return 0;
		}
	}

}
