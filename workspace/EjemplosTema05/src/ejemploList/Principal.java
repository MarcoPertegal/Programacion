package ejemploList;

import java.util.ArrayList;//hay que importar estos dos al pichar en el error de la list y arrayList
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		
		Alumno a = new Alumno("Felipe", 21, 4.9);
		//en las colecciones hay que decir que coleccion(List) y que tipo de elemntos guarda
		//lo de entre cmayor y menor es el tipo que guarda y no se pueden guardar cosas de diferentes tipos solo un tipo
		List <Alumno>lista = new ArrayList<Alumno>(); 
		//PARA agregar el primer alumno a la lista, cuando le doy al punto todos los metodos que aparecen son los que estan en ArrayList
		lista.add(new Alumno ("Antonio", 33, 2.9));
		System.out.println(lista);
		
		lista.add(1, a);//el uno es la posicion;
		System.out.println(lista);
		
		//si tengo duda con si existe algun metodo o que hace se busca api java en google y se vpueden ver
		System.out.println(lista.size()); //devuelve tamaño de la lista
		
		System.out.println(lista.get(1));//para obtener un elemento de lista
		
		//OTRA LISTA
		List <String> lista2 = new ArrayList<String>();
		lista2.add("Hola");
		System.out.println(lista2);
	
		
		//OTRA LISTA
		//las listas tiene que ser de objetos obligatoriamente, por lo que no se puede guarda un int así que usamo un integer 
		List <Integer> lista3 = new ArrayList<Integer>();
		lista3.add(8);
		System.out.println(lista3);
		
		//Más metodos
		if (lista2.isEmpty()) {
			System.out.println("Lista vacía");
		}
		
		lista3.remove(0);
		
		
	}

}
