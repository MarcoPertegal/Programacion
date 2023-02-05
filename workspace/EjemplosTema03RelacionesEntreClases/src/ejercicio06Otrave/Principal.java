package ejercicio06Otrave;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int tope=0, numEntradas=0, condicion=0, fila, butaca, posicion=0;
		String codSala, codEntrada, opcion;
		double precio , nuevoPrecio=0.0;
		boolean libre;
		Sala s;
		Entrada [] lista;
		
		System.out.println("Bienvenido al programa");
		System.out.println("---------------------");
		System.out.println("-SALA-");
		System.out.println("Indique el número de entradas que habrá:");
		numEntradas=Leer.datoInt();
		lista = new Entrada[numEntradas];
		System.out.println("Indique el código de la sala");
		codSala=Leer.dato();
		
		s = new Sala(codSala, numEntradas, lista);
		
		lista[0] = new Entrada("1ab", 7.5, true, 1, 2);
		lista[1] = new Entrada("2ab", 7.5, false, 1, 3);
		lista[2] = new Entrada("3ab", 7.5, true, 1, 4);
		
		/*System.out.println("-ENTRADA-");
		for (int i = 0; i < lista.length; i++) {
			System.out.println("diga el codigo de la entrada");
			codEntrada=Leer.dato();
			System.out.println("diga el precio");
			precio=Leer.datoDouble();
			System.out.println("1 si esta libre 2 si está ocupada");
			condicion=Leer.datoInt();
			if (condicion == 1) 
				libre = true;
			else
				libre = false;
			System.out.println("diga fila");
			fila=Leer.datoInt();
			System.out.println("diga butaca");
			butaca=Leer.datoInt();
			
			s.add(new Entrada(codEntrada, precio, libre, fila, butaca), posicion);
			
			posicion ++;
		}*/
		
		do {
			System.out.println("");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("0.Salir");
			System.out.println("1.Ver cartelera que mostrará el título de la película proyectada.?");
			System.out.println("2.Comprar una entrada.");
			System.out.println("3.Imprimir solo libres");
			System.out.println("4.Calcular ganancia");
			System.out.println("5.Modificar el precio de una entrada.");
			System.out.println("6.Modificar el código de una entrada.");
			System.out.println("7.Imprimir todo.");
			tope=Leer.datoInt();
			System.out.println("---------------------------------------------------------------------");
			System.out.println("");
			switch (tope) {
			case 0:
				System.out.println("Saliendo del programa.");
				break;
			case 1:
				
				break;
			case 2:
				System.out.println("Diga el ID de la entrada:");
				opcion=Leer.dato();
				s.comprarEntrada(s.findById(opcion));
				break;
			case 3:
				s.imprimirLibres();
				break;
			case 4:
				System.out.printf("La ganancia es: %.2f \n",s.calcularGanancia());
				break;
			case 5:
				System.out.println("Indique el ID de la entrada:");
				opcion=Leer.dato();
				System.out.println("Indique nuevo precio:");
				nuevoPrecio=Leer.datoDouble();
				s.editPrecio(s.findById(opcion),nuevoPrecio);
				break;
			case 6:
				
				break;
			case 7:
				s.imprimirTodo();
				break;
			default:
				System.out.println("OPCIÓN DESCONOCIDA");
				break;
			}
		} while (tope != 0);
	System.out.println("Gracias por usar el programa.");
		
		
		
		
		

	}

}
