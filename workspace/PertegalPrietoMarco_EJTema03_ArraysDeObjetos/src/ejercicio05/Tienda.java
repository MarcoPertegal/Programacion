package ejercicio05;

import java.util.Arrays;

public class Tienda {
	
	Electrodomestico [] lista;

	public Tienda(Electrodomestico[] lista) {
		super();
		this.lista = lista;
	}

	public Electrodomestico[] getLista() {
		return lista;
	}

	public void setLista(Electrodomestico[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Tienda [lista=" + Arrays.toString(lista) + "]";
	}
	
	public Electrodomestico findByPrecio(Electrodomestico e, double precio) {
		int i = 0;
		boolean encontrado=false;
		
		while (i < lista.length && !encontrado) {
			Electrodomestico deLista= lista[i];
			if (deLista.getPrecioBase()==precio) 
				encontrado = true;
			else 
				i++;
		}
		if (encontrado) 
			return lista[i];
		else
			return null;
	}
	
 }
