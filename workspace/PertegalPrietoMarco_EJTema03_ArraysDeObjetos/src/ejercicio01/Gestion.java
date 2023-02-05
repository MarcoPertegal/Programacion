package ejercicio01;

import java.util.Arrays;

public class Gestion {
	
	private Producto lista [];
	
	public Gestion(Producto[] lista) {
		super();
		this.lista = lista;
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Gestion [lista=" + Arrays.toString(lista) + "]";
	}
	
	public void add(Producto p, int posicion) {
		lista [posicion] = p;
	}
	
	public Producto [] findAll(){
		return lista;
	}
	
	public void imprimirTodosLosProductos() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println((i+1)+". "+lista[i]);
		}
	}
	public Producto findById(String nombre) {
		int i=0;
		boolean encontrado = false;
		
		while (i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if (deLista.getNombre().equalsIgnoreCase(nombre)) 
				encontrado = true;
			else
				i++;
		}
		if (encontrado) 
			return lista[i];
		else
			return null;
	}
	//para buscar un producto al que se le hace el pvp se hace en el main
	public double calcularPvp (Producto p, double porcentGanancia) {
		return p.getPrecioFab()+p.getPrecioFab()*porcentGanancia/100;
	}
	
	public boolean comprobarFragil (Producto p) {
		return p.isFragil();
		//si quisiese imprimir si es fragil o no en bonito hay que crear un metodo para ello 
	}
	public void imprimirFragil(boolean b) {
		if(b) {
			System.out.println("ES FRÁGIL");
		}else {
			System.out.println("NO ES FRÁGIL");
		}
	}
	
	//Buscar por nombre cuando es posible que los nombres se repitan se devuelve un array
	//se elimina lo del && encontrado para que no pare cuando lo encuentra 
	//ENCONTRAR EL NOMBRE QUE NO ACTUARIA COMO ID yo lo he hecho mal porque estoy usando el nombre como ID 
	public Producto[] findByNom(String nombre) {
		int i = 0;
		Producto [] listaAux = new Producto [lista.length];
		
		while (i < lista.length) {
			Producto deLista = lista [i];
			if (deLista.getNombre().equalsIgnoreCase(nombre)) {
				listaAux [i] = lista[i]; //aqui se compara el nombre del producto de la lista con el que le paso en el pareametro 
			}
			i++;//esta i debe ur fuera del if para que la haga siempre
		}
	return listaAux; //IMPORTATE ACORDARSE DE QUE AQUI NO VA LA [i]
	}
	
	
	
}
