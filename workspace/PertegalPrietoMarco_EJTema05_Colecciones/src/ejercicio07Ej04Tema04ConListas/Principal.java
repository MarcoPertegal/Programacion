package ejercicio07Ej04Tema04ConListas;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		//FALTAN LOS METODOS CRUD HACERLOS, falta saber porque sale el error ese y que me imprima los datos de la lista en orden
		
		int tope=0;
		Map <Integer, LineaVenta> lista = new HashMap <Integer, LineaVenta>();
		Map <Integer, LineaVenta> listaTree;
		
		Venta v = new Venta(lista);
		
		lista.put(0, new LineaVenta(new Alimentacion(2, "Platano", "a1", 1), 2));
		lista.put(1, new LineaVenta(new Alimentacion(1, "Manzana", "a2", 3), 3));
		lista.put(2, new LineaVenta(new Ropa(5, "Pantalón", "a3", "moda"),1));
		lista.put(3, new LineaVenta(new Ropa(10, "Chaqueta", "a4", "moda"),2));
		
		do {
			System.out.println();
			System.out.println("¿Qué desea hacer:");
			System.out.println("--------------------------------------------");
			System.out.println("0. Salir");
			System.out.println("1. Imprimir tiquet.");
			System.out.println("2. Ordenar productos de mayor a menor precio.");
			System.out.println("3. Ordenar alfabéticamente.");
			System.out.println("----------------------------------------------");
			System.out.println();
			tope=Leer.datoInt();
			switch (tope) {
			case 0:
				System.out.println("Saliendo");
				break;
			case 1:
				v.imprimirTiquet();
				break;
			case 2:
				listaTree = new TreeMap <Integer, LineaVenta>();
				listaTree.putAll(listaTree);
				for (LineaVenta l : lista.values()) {
					System.out.println(l);
				}
				break;
			case 3:
				//listaTree = new TreeMap <Integer, LineaVenta>(new OrdenarAlfabeticamente());
				//listaTree.putAll(listaTree);
				for (LineaVenta l : lista.values()) {
					System.out.println(l);
				}
				break;
			default:
				System.out.println("Número desconocido");
				break;
			}
		} while (tope != 0);
		
		
	}

}
