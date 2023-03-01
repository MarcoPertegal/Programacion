package ejercicio03;

import java.util.HashSet;
import java.util.Set;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int tope;
		//si voy a tener que buscar muchas cosas no es la mejor coloeccion
		//formas de sacar un objeto, con las formas que hay en moodle
		//se usan cuando me voy a traer toda la lista entera
		Set <Alumno> listaAlumnos = new HashSet <Alumno>();
		Aula a= new Aula("1DAM", listaAlumnos);
		listaAlumnos.add(new Alumno(0.0, "Juan", "Ballén Lopez", 21, "6345A"));
		listaAlumnos.add(new Alumno(10.0, "Felipe", "Gracía Roslae", 19, "2341B"));
		
		
		
		System.out.println("Bienvenido al programa para gestionar alumnos");
		System.out.println("////////////////////////////////////////////");
		System.out.println("");
		do {
			System.out.println("");
			System.out.println("¿Qué operación dese realizar?");
			System.out.println("-----------------------------");
			System.out.println("0. Salir.");
			System.out.println("1. Mostrar un alumno.");
			System.out.println("2. Modificar un alumno.");
			System.out.println("3. Borrar un alumno.");
			System.out.println("4. Número total de suspensos.");
			System.out.println("5. Nota media.");
			System.out.println("6. Mostrar todos.");
			System.out.println("-----------------------------");
			System.out.println("");
			tope=Leer.datoInt();
			switch (tope) {
			case 0:
				System.out.println("Saliendo");
				break;
			case 1:
				
				break;
			case 4:
				System.out.println(a.contarSuspensos());
				break;
			case 5:
				System.out.printf("%.2f",a.mediaDeSuspensos());
				break;
			case 6:
				a.motrarTodos();
				System.out.println();
				a.mostrarTodosV2();
				break;
			default:
				System.out.println("OPCIÓN DESCONOCIDA");
				break;
			}
		} while (tope != 0);
		System.out.println("Gracias por usar el programa");
		
		
		
		

	}

}
