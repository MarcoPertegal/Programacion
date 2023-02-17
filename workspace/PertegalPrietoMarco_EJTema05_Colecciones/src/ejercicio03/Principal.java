package ejercicio03;

import java.util.HashSet;
import java.util.Set;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int tope;
		
		Set <Alumno> listaAlumnos = new HashSet <Alumno>();
		
		listaAlumnos.add(new Alumno(5.6, "Juan", "DAM", 19));
		listaAlumnos.add(new Alumno(7.6, "Felipe", "AYF",21));
		listaAlumnos.add(new Alumno(4.2, "Juani", "TELECO",23));
		
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
			System.out.println("-----------------------------");
			System.out.println("");
			tope=Leer.datoInt();
			switch (tope) {
			case 0:
				System.out.println("Saliendo");
				break;
			case 1:
				//los metodos de motrar un alumno como se hacen si esta lista no guarda en orden?
				break;
			default:
				System.out.println("OPCIÓN DESCONOCIDA");
				break;
			}
		} while (tope != 0);
		System.out.println("Gracias por usar el programa");
		
		
		
		

	}

}
