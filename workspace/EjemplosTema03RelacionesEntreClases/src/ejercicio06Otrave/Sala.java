package ejercicio06Otrave;

import java.util.Arrays;
import java.util.Iterator;

public class Sala {
	
	private String codigoSala;
	private int numEntradas;
	private Entrada [] lista;
	
	public Sala(String codigoSala, int numEntradas, Entrada[] lista) {
		super();
		this.codigoSala = codigoSala;
		this.numEntradas = numEntradas;
		this.lista = lista;
	}

	public String getCodigoSala() {
		return codigoSala;
	}

	public void setCodigoSala(String codigoSala) {
		this.codigoSala = codigoSala;
	}

	public int getNumEntradas() {
		return numEntradas;
	}

	public void setNumEntradas(int numEntradas) {
		this.numEntradas = numEntradas;
	}

	public Entrada[] getE() {
		return lista;
	}

	public void setE(Entrada[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Sala [codigoSala=" + codigoSala + ", numEntradas=" + numEntradas + ", e=" + Arrays.toString(lista) + "]";
	}
	
	//metodos míos
	public void add(Entrada e, int posicion) {
		lista[posicion] = e;
	}
	public void imprimirTodo() {
		for (int i = 0; i < lista.length && lista[i] !=null; i++) {
			System.out.println((i+1)+" ."+lista[i]);
		}
	}
	
	public void comprarEntrada(Entrada e) {
		if (e.isLibre()) {
			System.out.println("Entrada comprada con exito");
			e.setLibre(false);
		}else {
			System.out.println("La entrada ya ha sido comprada");
		}
	}
	
	public Entrada findById(String codEntrada) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < lista.length && !encontrado) {
			Entrada deLista = lista[i];
			if (deLista.getCodigoEntrada().equalsIgnoreCase(codEntrada)) 
				encontrado = true;
			else
				i++;
		}
		if (encontrado) 
			return lista[i];
		else
			return null;
	}
	
	public void imprimirLibres() {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].isLibre()) 
				System.out.println((i+1)+". "+lista[i]);
		}
	}
	
	public double calcularGanancia() {
		double ganancia=0.0;
		
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			if (lista[i].isLibre()) 
				ganancia += lista[i].getPrecio();
		}
		return ganancia;
	}
	
	public void editPrecio(Entrada e, double nuevoPrecio) {
		e.setPrecio(nuevoPrecio);
	}
}
