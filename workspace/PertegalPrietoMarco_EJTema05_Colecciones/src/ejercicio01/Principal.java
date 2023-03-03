package ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import utilidades.Leer;


public class Principal {

	public static void main(String[] args) {
		//¿como paso un ArrayList a un metodo de la clase nota?
		//Para imprimir con el numero de nota lo hago con un for
		int tope, busc, num=1;
		String titulo, contenido, fecha;
		
		List <Nota> listaNotas = new ArrayList <Nota>();
		
		listaNotas.add(new Nota("Mandaos", "Yogur, Huevo, Leche, Jamón, Batido", "14/02/2022"));
		listaNotas.add(new Nota("Ver Pelis", "Shooter Island, El Padrino, Casa Blanca, El Irlandés", "12/12/2022"));
		listaNotas.add(new Nota("Tareas", "Ejercicios Programación, Consultas Base de datos, Examen Html", "10/02/2023"));
		
		System.out.println("/////////////////////////////////////");
		System.out.println("/ BIENVENIDO A LA GESTIÓN DE NOTAS /");
		System.out.println("/////////////////////////////////////");
		System.out.println("");
		do {
			System.out.println("");
			System.out.println("¿Que desea hacer?");
			System.out.println("---------------------------");
			System.out.println("0. Salir");
			System.out.println("1. Motrar una nota.");
			System.out.println("2. Total de notas.");
			System.out.println("3. Agregar una nueva nota.");
			System.out.println("4. Eliminar una nota(Comprobando).");
			System.out.println("5.Mostrar todas las notas");
			System.out.println("---------------------------");
			System.out.println("");
			
			tope=Leer.datoInt();
			switch (tope) {
			case 0:
				System.out.println("Saliendo de la aplicación.");
			break;
			case 1:
				System.out.println("");
				System.out.println("Indique la posición de la nota que quiere mostrar:");
				busc=Leer.datoInt();
				System.out.println(listaNotas.get(busc-1)); //para mostrar en bonito un metofo en la clase nota que se le pase el objeto que ddevuelve set 
			break;
			case 2:
				System.out.println("Hay "+listaNotas.size()+" notas guardadas.");
				
			break;
			case 3:
				System.out.println("Título:");
				titulo=Leer.dato();
				System.out.println("");
				System.out.println("Contenido:");
				contenido=Leer.dato();
				System.out.println("");
				System.out.println("Fecha:");
				fecha=Leer.dato();
				System.out.println("");
				
				listaNotas.add(new Nota(titulo, contenido, fecha));//IMPORTANTE no se usa el add directamente en el main sino que hay que ponerlo dentro del metodo de la clase crud
																	//ese metododebe devolver un booleano 
																	//con remove igual
			break;
			case 4:
				System.out.println("");
				if (!listaNotas.isEmpty()) {
					System.out.println(listaNotas);
					System.out.println("Indique la posición de la nota que desea borrar:");
					busc=Leer.datoInt();
					listaNotas.remove(busc -1);
				}
				else {
					System.out.println("lista vacía");
				}
			break;
			case 5:
				for (Nota n : listaNotas) {
					System.out.println(num+""+n);
					num++;
				}
				break;
			default:
				System.out.println("OPCIÓN DESCONOCIDA");
				break;
			}
		} while (tope != 0);
		System.out.println("Gracias por usar gestión de notas.");
	}

}
