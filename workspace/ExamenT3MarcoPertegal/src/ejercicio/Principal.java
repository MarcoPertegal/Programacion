package ejercicio;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		String nombre;
		double sueldoBase=0.0, porcentSueldo=0.0;
		int edad=0, tope=0, desde=0, hasta=0, golesTot=0, cantGoles=0, nuevosGoles=0, cambiarGoles=0, topeEdad=0;
		int tam=7;
		int [] goles = new int [tam];
		Jugador jug;
		
		System.out.println("");
		System.out.println("///////////////////////////////////////////////////////////////////////");
		System.out.println("/ BIENVENIDO AL PROGRAMA PARA CONTAR LOS GOLES MARCADOS EN 7 PARTIDOS /");
		System.out.println("///////////////////////////////////////////////////////////////////////");
		System.out.println("");
		System.out.println("Introduzca los datos del jugador");
		System.out.println("'''''''''''''''''''''''''''''''''");
		System.out.println("Diga el nombre:");
		nombre=Leer.dato();
		System.out.println("Diga su sueldo base:");
		sueldoBase=Leer.datoDouble();
		System.out.println("Diga su edad:");
		edad=Leer.datoInt();
		
		jug= new Jugador(nombre, sueldoBase, edad, goles);
		
		do {
			System.out.println("");
			System.out.println("¿Qué operación desea realizar?");
			System.out.println("----------------------------------------------");
			System.out.println("0.Para salir.");
			System.out.println("1.Generar goles.");
			System.out.println("2.Total de goles en los partidos.");
			System.out.println("3.Calcular el sueldo del jugador.");
			System.out.println("4.Partidos en los que el jugador a marcado.");
			System.out.println("5.Modificar el número de goles de un partido.");
			System.out.println("6.Mostrar mensaje si es mayor de 40 años.");
			System.out.println("7.Mostrar datos.");
			System.out.println("-----------------------------------------------");
			System.out.println("");
			tope=Leer.datoInt();
			
			switch (tope) {
				case 0:
					System.out.println("Saliendo del programa.");
					break;
					
				case 1:
					System.out.println("Diga los números entre los que quiere generar los goles.");
					System.out.println("Desde:");
					desde=Leer.datoInt();
					System.out.println("Hasta:");
					hasta=Leer.datoInt();
					
					jug.rellenarArray(desde, hasta);
					jug.imprimirArray();
					break;
					
				case 2:
					golesTot = jug.calcularGoles();
					System.out.println("Los goles totales han sido: ");
					System.out.println("");
					break;
					
				case 3:
					System.out.println("Diga la cantidad de goles necesaria para aplicar el porcentaje:");
					cantGoles=Leer.datoInt();
					
					System.out.println("Diga el porcentaje que quiere aplicarle al sueldo base:");
					porcentSueldo=Leer.datoDouble();
					
					System.out.printf("El sueldo total del jugador es: %.2f euros.",jug.comprobarGoles(cantGoles, golesTot, porcentSueldo));
					break;
					
				case 4:
					System.out.println("El jugador a marcado en: "+jug.calcularPartidosMarcados()+" partidos.");
					System.out.println("");
					break;
					
				case 5:
					System.out.println("¿De qué partido desea cambiar los goles?:");
					cambiarGoles=Leer.datoInt();
					System.out.println("¿Por qué número de goles?:");
					nuevosGoles=Leer.datoInt();
					jug.cambiaNumGoles(cambiarGoles, nuevosGoles);
					jug.imprimirArray();
					break;
					
				case 6:
					System.out.println("Diga los años para la retirada del jugador:");
					topeEdad=Leer.datoInt();
					jug.imprimirMensaje(topeEdad);
					break;
				
				case 7:
					System.out.println(jug);
					
				default:
					System.out.println("NÚMERO DESCONOCIDO");
					break;
			}
			
		} while (tope != 0);
		System.out.println("Gracias por usar el programa.");
	}

}
