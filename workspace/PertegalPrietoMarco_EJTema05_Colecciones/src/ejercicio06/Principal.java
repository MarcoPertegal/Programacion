package ejercicio06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int tope;
		double pagoHora;
		
		List <Trabajador> listaTrab = new ArrayList <Trabajador>();
		
		listaTrab.add(new Trabajador("Felipe", "1111A", 10));//hay que quitar el sueldo de aqui y calcularla en un metodo en una interfaz aparte y setearlo
		listaTrab.add(new Trabajador("Juan", "2222B", 30));
		listaTrab.add(new Trabajador("Antonio", "3333C", 20));
		
		System.out.println("BIENVENIDO");
		
		do {
			System.out.println("");
			System.out.println("¿Qué desea hacer?");
			System.out.println("----------------------");
			System.out.println("0. 	Salir");
			System.out.println("1. 	Motrar todo.");
			System.out.println("2.	Ordenar por horas ASC.");
			System.out.println("3. 	Ordenar por horas DESC.");
			System.out.println("4. 	Ordenar por sueldo.");
			System.out.println("5.	Calcular sueldo.");
			System.out.println("-----------------------");
			System.out.println("");
			tope=Leer.datoInt();
			
			switch (tope) {
			case 0:
				System.out.println("Saliendo");
				break;
			case 1:
				for (Trabajador t: listaTrab) {
					System.out.println(t);
				}
				break;
			case 2:
				Collections.sort(listaTrab);
				break;
			case 3:
				Collections.sort(listaTrab, new compararHorasMayorMenor());
				break;
				
			case 5:
				System.out.println("Indique a cuanto cobra la hora:");
				pagoHora
				hacerlo en un for para que el metodo me calcule de uno en uno y lo setee
				break;
			default:
				System.out.println("Número deconocido");
				break;
			}
		} while (tope != 0);

	}

}
