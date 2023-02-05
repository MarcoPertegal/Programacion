package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int tam=0, opcion=0, fila=0, butaca=0, posicion=0, tope=0;
		boolean libre;
		String codEntrada, eleccion, codSala,nuevoCod;
		double precio, ganancias = 0.0;
		Entrada [] ocupadas;
		Entrada [] lista;
		Sala s;
		System.out.println("////////////////////////////////////////////////");
		System.out.println("BIENVENIDO AL SISTEMA INFORMATICO DE CINES FELIPE");
		System.out.println("/////////////////////////////////////////////////");
		System.out.println("");
		System.out.println("Introduzca la información de la sala:");
		System.out.println("-------------------------------------");
		System.out.println("Indique cuantas localidades habrá:");
		tam=Leer.datoInt();
		lista = new Entrada [tam];
		System.out.println("Inque el ID de la sala:");
		codSala=Leer.dato();
		s = new Sala (codSala, tam, lista);//Se crea vacio
		//aque se meten a casca porra
		lista[0] = new Entrada("1ab", 7.5, true, 1, 1);//aqui se rellena
		lista[1] = new Entrada("2ab", 7.5, false, 1, 2);
		lista[2] = new Entrada("3ab", 7.5, false, 1, 3);
		lista[3] = new Entrada("4ab", 7.5, false, 2, 1);
		lista[4] = new Entrada("5ab", 7.5, true, 2, 2);
		
		
		/* ESTO ES PARA RELLENAR POR TECLDO LOS OBJETOS
		System.out.println("");
		System.out.println("Introduzca la información de la entrada:");
		System.out.println("----------------------------------------");
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Indique el número de identificación de la entrada:");
			numIdentEntrada=Leer.datoInt();
			System.out.println("Indique el precio:");
			precio=Leer.datoDouble();
			System.out.println("Pulse 1 si está libre o 2 si está ocupada:");
			opcion=Leer.datoInt();
			if (opcion == 1) {
				libre = true;
			}else {
				libre = false;
			}
			System.out.println("Indique la fila del asiento:");
			fila=Leer.datoInt();
			System.out.println("Indique la butaca:");
			butaca=Leer.datoInt();
			
			s.add(new Entrada(numIdentEntrada, precio, libre, fila, butaca), posicion);
			posicion++;
			System.out.println("");
		}
		*/
		
		do {
			System.out.println("0.Salir");
			System.out.println("1.Ver cartelera que mostrará el título de la película proyectada.?");
			System.out.println("2.Comprar una entrada.");
			System.out.println("3.Imprimir solo ocupadas(hace falta un array de entradas ocupadas que se instancia dentro del metodo)");
			System.out.println("4.Calcular ganancia .(si quisiesemos hacerlo solo de las entradas vendidas=ocupadas haria falta guardar las vendiads en un array que seria finbyOcupadas y pasarselo en la llamada ");
			System.out.println("5.Modificar el precio de una entrada.");
			System.out.println("6.Modificar el código de una entrada.");
			System.out.println("7.Imprimir todo.");
			tope=Leer.datoInt();
			
			
			switch (tope) {
			case 0:
				System.out.println("Saliendo");
				break;
			case 1:
				System.out.println();
				break;
			case 2:
				System.out.println("");
				s.imprimirTodo();
				System.out.println("");
				System.out.println("Indique el número de identificación de la localidad que quiere comprar:");
				eleccion=Leer.dato();
				s.comprarEntrada(s.findById(eleccion));
				break;
			case 3:
				ocupadas = s.buscarLocalidadesOcupadasV2();
				s.imprimirOcupadas();
				
				break;
			case 4:
				ganancias = s.calcularGananciaTotalV2(); 
				System.out.printf("Las ganancias del día son: %.2f \n", ganancias);
				break;
			case 5:
				s.imprimirTodo();
				System.out.println("Introduzca el número de identificación de la entrada que quiere cambiar:");
				eleccion=Leer.dato();
				System.out.println("Indique el nuevo precio:");
				precio=Leer.datoDouble();
				s.editPrecio(s.findById(eleccion) , precio);
				break;
			case 6:
				System.out.println("Introduzca el código de la entrada que quiere modificar:");
				codEntrada=Leer.dato();
				System.out.println("Introduzca el nuevo código:");
				nuevoCod=Leer.dato();
				s.editCodigo(s.findById(codEntrada) ,nuevoCod);
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
