package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		Cliente [] listaClientes;
		Cliente e;
		Gimnasio gim;
		int tam, condition=0, posicion=0, tope=0;
		String dni, nombre, apellido, opcion;
		boolean activo;
		double peso;
		double altura, opcion2=0.0;
		
		System.out.println("¿Qué cantidad de clientes desea guardar?");
		tam=Leer.datoInt();
		
		listaClientes = new Cliente[tam];
		
		gim = new Gimnasio(listaClientes);
		
		listaClientes [0] = new Cliente("12423C", "Raúl", "Carmona", true, 93, 1.89);
		listaClientes [1] = new Cliente ("491936C", "Jesús", "Prieto", true, 73, 1.75);
		listaClientes [2] = new Cliente ("46742F", "Fede", "García", true, 78, 1.72);
		listaClientes [3] = new Cliente ("78365B", "Jorge", "Ramos", false, 81, 1.85);
		
		/*System.out.println("");
		System.out.println("Introduzca la información de los clientes:");
		for (int i = 0; i < listaClientes.length; i++) {
			System.out.println("Diga el Dni");
			dni=Leer.dato();
			System.out.println("Diga el nombre");
			nombre=Leer.dato();
			System.out.println("Diga el apellido");
			apellido=Leer.dato();
			System.out.println("Pulse 1 si está activo, 2 si no:");
			condition=Leer.datoInt();
			if (condition == 1) 
				activo = true;
			else
				activo = false;
			System.out.println("Diga el peso:");
			peso=Leer.datoDouble();
			System.out.println("Diga la altura");
			altura=Leer.datoDouble();
			
			gim.add(new Cliente(dni, nombre, apellido, activo, peso, altura), posicion);
			
			posicion++;
		}*/
		do {
			System.out.println("0.Salir");
			System.out.println("1.Calcular el indice de masa corporal de un cliente");
			System.out.println("2.Mostrar lista");
			System.out.println("3.Dar de baja(pasar a no activo).");
			System.out.println("4.Media de IMC de todos los clientes.");
			System.out.println("5.Calcular media de altura de los que pesan más de un determinado kg.");
			tope=Leer.datoInt();
			switch (tope) {
			case 0:
				System.out.println("Salir");
				break;
			case 1:
				System.out.println("Introduzca e DNI del cliente");
				opcion=Leer.dato();
				gim.calcularIMCDeUnCliente(gim.findByDni(opcion));
				break;
			case 2:
				gim.imprimirTodo();
				break;
			case 3:
				gim.imprimirTodo();
				System.out.println("Indique el Dni del cliente que quiere dar de baja:");
				opcion=Leer.dato();
				gim.darDeBaja(gim.findByDni(opcion));
				gim.imprimirTodo();
				break;
			case 4:
				System.out.printf("%.2f \n",gim.calcularIMCDeTodos());//importante poner el %.2f para que no de error 
				break;
			case 5:
				//como calcular esto, no hace falta un array para guarar el peso dew todos los clientes, hace falta un metodo que calcule el indice de 
				//masa corporal de un cliente y le paso el array 
				System.out.println("Indique el peso a partir del cual quiere sacar la media de altura.");
				opcion2=Leer.datoDouble();
				System.out.printf("%.2f \n",gim.calcularMediaAltura(opcion2));
				break;
			default:
				System.out.println("NÚMERO DESCONOCIDO");
				break;
			}
		} while (tope != 0);
		System.out.println("Gracias por usar el programa");
	}

}
