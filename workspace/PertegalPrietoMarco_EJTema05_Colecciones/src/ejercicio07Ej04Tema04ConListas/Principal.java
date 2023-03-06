package ejercicio07Ej04Tema04ConListas;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		//hacer emtodos crud, como hacer para imprimir la lista ordenada y uqe aparezcan los datos de cada objeto
		//hacer los metodos crud, hacer el comparar por clave y como imprimir pa que se vean to los datos.
		//Como hacer para que no me tire del toStrign y si me imprima los datos
		String buscId;
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
			System.out.println("2. Ordenar por integer.");
			System.out.println("3. Ordenar alfabéticamente.");
			System.out.println("4. Imprimir todo.");
			System.out.println("5. Buscar por id.");
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
				listaTree = new TreeMap <Integer, LineaVenta>(new CompararPorInteger());
				listaTree.putAll(lista);
				for (Integer i : lista.keySet()) {
					System.out.println(i);
				}
				break;
			case 3:
				/*listaTree = new TreeMap <Integer, LineaVenta>(new OrdenarPorInteger());
				listaTree.putAll(lista);
				for (LineaVenta l : lista.values()) {
					System.out.println(l);
				}*/
				break;
			case 4:
				v.imprimirTodo();
				break;
			case 5:
				System.out.println("Id para buscar:");
				buscId=Leer.dato();
				System.out.println(v.findById(buscId)); 
				break;
			default:
				System.out.println("Número desconocido");
				break;
			}
		} while (tope != 0);
		
		
	}

}
