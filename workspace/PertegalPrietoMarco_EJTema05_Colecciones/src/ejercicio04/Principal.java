package ejercicio04;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		//los hashMap lo suyo no es ordenarlo porque es una lista creada precisamente para que no sea necesario ordenarla, pero lo va a preguntar
		int buscId, tope;
		String nuevoNombre;
		
		Map <Contacto, Integer> lista = new HashMap <Contacto, Integer>();
		Map <Contacto, Integer> listaTree;
	
		
		lista.put(new Contacto(1, "Fer", "a@a.com"),11111);
		lista.put(new Contacto(2, "Juan", "b@b.com"),22222);
		
		Agenda a = new Agenda(lista);
		
		do {
			System.out.println("Que desea hacer?");
			System.out.println("-------------------");
			System.out.println("0.salir");
			System.out.println("1.Agregar un contacto");
			System.out.println("2.Mostrar todo");
			System.out.println("3.Buscar por id.");
			System.out.println("4.Borrar uno.");
			System.out.println("5.Editar nombre.");
			System.out.println("6.Ordenar por nombre.");
			System.out.println("7.Ordenar por id.");
			
			tope=Leer.datoInt();
			switch (tope) {
			case 0:
				System.out.println("Saliendo");
				break;
			case 1:
				a.agregarContacto(new Contacto(3, "Cris", "c@c.com"), 33333);
				break;
			case 2:
				a.mostrarTodo();
				break;
			case 3:
				System.out.println("Id por el que desea buscar:");
				buscId=Leer.datoInt();
				System.out.println(a.buscarId(buscId));
				break;
			case 4:
				System.out.println("Id del que desea borrar");
				buscId=Leer.datoInt();
				a.eliminarContacto(a.buscarId(buscId));
				break;
			case 5:
				System.out.println("Indique el id del que quiere cambiar el nombre:");
				buscId=Leer.datoInt();
				System.out.println("Indique el nuevo nombre:");
				nuevoNombre=Leer.dato();
				a.editarNombre(a.buscarId(buscId),nuevoNombre);
				break;
			case 6:
				System.out.println("Ordenar por nombre:");
				listaTree = new TreeMap<Contacto, Integer>();
				listaTree.putAll(lista);
				//al poner el metodo mostrar de la clase contacto no se ordena pq no esta tirando del tree map en el for de abajo si
				//no estamos ordenando el hashmap estamos ordenando una nueva lista treemap
				for (Contacto c : listaTree.keySet()) {//aqui se pone keySet para transformar la lista en una lista set para que se recorra mas rapida
					System.out.println(c);
				}
				break;
			case 7:
				listaTree = new TreeMap <Contacto, Integer>(new CompararPorID());//IMPORTANTE la diferencia con lo de arrauba es que se le pasa la intancia
				listaTree.putAll(lista);
				for (Contacto c : listaTree.keySet()) {
					System.out.println(c);
				}
				break;
			default:
				System.out.println("Opción desconocida");
				break;
			}
		} while (tope != 0);
	}

}
