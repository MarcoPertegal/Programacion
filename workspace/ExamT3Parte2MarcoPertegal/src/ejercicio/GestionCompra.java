package ejercicio;

import java.util.Arrays;

public class GestionCompra {
	
	private Compra [] lista;
	private double gastoTot;
	
	public GestionCompra(Compra[] lista, double gastoTot) {
		super();
		this.lista = lista;
		this.gastoTot = gastoTot;
	}

	public GestionCompra(Compra[] lista) {
		super();
		this.lista = lista;
	}

	public Compra[] getLista() {
		return lista;
	}

	public void setLista(Compra[] lista) {
		this.lista = lista;
	}

	public double getGastoTot() {
		return gastoTot;
	}

	public void setGastoTot(double gastoTot) {
		this.gastoTot = gastoTot;
	}

	@Override
	public String toString() {
		return "GestionCompra [lista=" + Arrays.toString(lista) + ", gastoTot=" + gastoTot + "]";
	}
	
	//Métodos míos
	public void add(Compra com, int posicion) {
		lista[posicion] = com;
	}
	
	public double calcularGastoTot() {
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			gastoTot += lista[i].getGasto();
		}
		return gastoTot;
	}
	
	public void mostrarTodo() {
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			System.out.println((1+i)+"º. "+lista[i]);
		}
	}
	
	public void mostrarConceptoCompras() {
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			System.out.println("Gasto "+(i+1)+": "+lista[i].getConcepto());
		}
	}
	
	public double calcularPresupuesto(double presuMarcado) {
		
		return presuMarcado - gastoTot;
	}
	
	public Compra findByConcepto(String concepto) {
		int i=0;
		boolean encontrado = false;
		
		while (i < lista.length && !encontrado) {
			Compra deLista = lista[i];
			if (deLista.getConcepto().equalsIgnoreCase(concepto)) 
				encontrado = true;
			else 
				i++;
			}
		if (encontrado) 
			return lista[i];
		else
			return null;
	}
	
	public void editGasto(Compra com, double nuevoGasto) {
		com.setGasto(nuevoGasto);
	}
	
	public Compra [] findByPrecio(double buscGasto) {
		Compra [] listaCompras = new Compra[lista.length];
		
		for (int i = 0; i < listaCompras.length; i++) {
			if (lista[i].getGasto() == buscGasto) 
				listaCompras[i] = lista[i];
		}
		return listaCompras;
	}
	
	public void imprimirListaPrecios(Compra [] listaCompras) {
		
		for (int i = 0; i < listaCompras.length; i++) {
			if (listaCompras[i] != null) 
				System.out.printf((i+1)+"º. "+listaCompras[i]);
		}
	}
}
