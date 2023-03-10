package ejercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tope=0, buscId;;
		String buscModoConduccion, nuevoModoConduccion;
		double cantidad;
		List <Trayecto> listaTrayecto = new ArrayList <Trayecto>();
		
		Coche c = new Coche(listaTrayecto);
		
		listaTrayecto.add(new Trayecto(1, 150, 10, "eco"));
		listaTrayecto.add(new Trayecto(2, 45, 20, "deportivo"));
		listaTrayecto.add(new Trayecto(3, 100, 30, "normal"));
		
		System.out.println("////////////////////////////////////////////////////////////////");
		System.out.println("Bienvenido al programa para gestionar el consumo de su vehículo.");
		System.out.println("////////////////////////////////////////////////////////////////");
		System.out.println();
		do {
			System.out.println();
			System.out.println("¿Qué operación desea realizar?");
			System.out.println("-------------------------------");
			System.out.println("0. Salir.");
			System.out.println("1. Mostrar todos los trayectos en el modo elegido:");
			System.out.println("2. Buscar el trayecto de mayor duración:");
			System.out.println("3. Buscar todos los trayectos en los que se haya consumido menos de una cantidad dada:");
			System.out.println("4. Buscar trayecto con menos consumo:");
			System.out.println("5. Modificar el modo de un trayecto:");
			System.out.println("6. Ordenar alfabéticamente por modo:");
			System.out.println("7. Ordenar por duración:");
			System.out.println("8. Crear una lista aleatoria de trayectos:(no me ha dado tiempo)");
			System.out.println("9. Calcular media de litros consumidos:");
			System.out.println("10.Mostrar todo:");
			System.out.println("-------------------------------");
			tope=Leer.datoInt();
			System.out.println();
			switch (tope) {
			case 0:
				System.out.println("Saliendo del programa.");
				break;
			case 1:
				System.out.println("Elija el modo:");
				buscModoConduccion=Leer.dato();
				System.out.println(c.buscTrayectosPorModoConduccion(buscModoConduccion));
				//repasar
				break;
			case 2:
				System.out.println(c.buscTrayectoMayorDuracion());
				break;
			case 3:
				System.out.println("Indique la cantidad:");
				cantidad=Leer.datoDouble();
				System.out.println(c.buscarTrayectoPorCantidadConsumo(cantidad)); 
				//repasar
				break;
			case 4:
				System.out.println(c.buscarTrayectoMenorConsumo());
				//repasar
				break;
			case 5:
				System.out.println("Indique el id del trayecto:");
				buscId=Leer.datoInt();
				System.out.println("Indique el nuevo modo:");
				nuevoModoConduccion=Leer.dato();
				c.editarModo(c.findByID(buscId), nuevoModoConduccion);
				break;
			case 6:
				Collections.sort(listaTrayecto);
				for (Trayecto t : listaTrayecto) {
					System.out.println(t);
				}
				break;
			case 7:
				Collections.sort(listaTrayecto, new OrdenarPorDuracion());
				for (Trayecto t : listaTrayecto) {
					System.out.println(t);
				}
				break;
			case 8:
				break;
			case 9:
				System.out.printf("La media de litros es: %.2f \n",c.calcularMediaLitros()); 
				break;
			case 10:
				c.imprimirTodo();
				break;
			default:
				System.out.println("OPCIÓN DESCONOCIDA");
				break;
			}
		} while (tope != 0);
		System.out.println("Gracias por usar el programa.");
	}

}
