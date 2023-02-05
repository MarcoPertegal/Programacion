package ejercicio04;

import java.util.Arrays;

public class Gimnasio {
	
	Cliente [] lista;

	public Gimnasio(Cliente[] lista) {
		super();
		this.lista = lista;
	}

	public Gimnasio() {
		super();
	}

	public Cliente[] getLista() {
		return lista;
	}

	public void setLista(Cliente[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Gimnasio [lista=" + Arrays.toString(lista) + "]";
	}
	
	//Metodos mios
	public Cliente findByDni(String dni) {
		int i=0;
		boolean encontrado=false;
		
		while (i < lista.length && !encontrado) {
			Cliente deLista = lista[i];
			if (deLista.getDni().equalsIgnoreCase(dni)) 
				encontrado = true;
			else
				i++;
		}
		if (encontrado) 
			return lista[i];
		else
			return null;
	}
	public void add(Cliente c, int posicion) {
		lista[posicion] = c; 
	}
	
	
	public double calcularIMCDeUnCliente(Cliente e) {
		
		return e.getPeso()/Math.pow(e.getAltura(), 2);
	}
	
	
	public void imprimirTodo() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println((i+1)+" ."+lista[i]);
		}
		
	}
	
	
	public void darDeBaja(Cliente e) {
		if (e.isActivo()) {
			System.out.println("Cliente dado de baja con éxito.");
			e.setActivo(false);
		}else {
			System.out.println("El ya estaba dado de baja anteriormente.");
		}
	}
	
	
	public double calcularIMCDeTodos() {
		double imcTotal = 0.0;
		
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			imcTotal += lista[i].getPeso()/Math.pow(lista[i].getAltura(), 2);
		}
		return imcTotal; 
	}
	
	
	public double calcularMediaAltura(double opcion) {
		double  sum=0.0;
		int cont = 0;
		
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			if (lista[i].getPeso() >= opcion) {							//Cuando se recorre el array entero se usa un for y dentro un if para filtrar los objetos
				sum += lista[i].getAltura();							//el contador es pq sino dibide entre 4 y si hago el filtrado de peso en 75 tendria que vidir entre 3
				cont++;
			}
		}
		return sum/cont;
	}
	
}
