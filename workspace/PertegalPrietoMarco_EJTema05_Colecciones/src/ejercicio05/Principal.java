package ejercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int opcion;
		
		List <Persona> listaPersonas = new ArrayList <Persona>();
		
		listaPersonas.add(new Persona("Felipe", "49163683C", 35, 1.73));
		listaPersonas.add(new Persona("Antonio", "6432441F", 31, 1.79));
		listaPersonas.add(new Persona("Fran", "515442A", 26, 1.81));
		listaPersonas.add(new Persona("Juan", "525322B", 28, 1.80));
		
		System.out.println("PERSONAS");
		System.out.println("---------");
		System.out.println();
		
		for (Persona pers : listaPersonas) {
			System.out.println(pers);//CUIDAO AQUI se pone el nombre de la referencua de persona no el nombre del array 
		}
		
		do {
			System.out.println();
			System.out.println("¿Cómo desea ordenar?");
			System.out.println("--------------------");
			System.out.println("0. Salir.");
			System.out.println("1. Alfabéticamente.");
			System.out.println("2. Por edad.");
			System.out.println("3. Por altura.");
			System.out.println("--------------------");
			System.out.println();
			opcion=Leer.datoInt();
			switch (opcion) {
			case 0:
				System.out.println("Saliendo.");
				break;
			case 1:
				Collections.sort(listaPersonas);

				for (Persona pers : listaPersonas) {
					System.out.println(pers);
				}
				break;
			case 2:
				Collections.sort(listaPersonas, new CompararPorEdad());
				
				for (Persona pers : listaPersonas) {
					System.out.println(pers);
				}
				break;
			case 3:
				Collections.sort(listaPersonas, new CompararPorAltura());
				
				for(Persona pers : listaPersonas) {
					System.out.println(pers);
				}
				break;
			default:
				System.out.println("Opción no valida");
				break;
			}
			
		} while (opcion != 0);
		System.out.println("Gracias por usar el programa.");
	}

}
