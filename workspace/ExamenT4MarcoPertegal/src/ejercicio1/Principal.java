package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		EntradaGeneral [] lista = new EntradaGeneral[3];
		Taquilla t= new Taquilla (lista);
		int tope, buscFila, buscAsiento;
		double porcentDonativo;
		
		//zona 1 = arriba, zona 2 = abajo
		lista[0] = new EntradaGeneral(1, 1, 1);
		lista[1] = new EntradaFamiliar(2, 2, 2, 2);
		lista[2] = new EntradaInvitados(2, 2, 3, "Felipe");
		
		System.out.println("BIENVENIDO AL PROGRAMA PARA GESTIONAR LAS ENTRADAS DE LOS PLAYBACKS");
		System.out.println("*******************************************************************");
		System.out.println("");
		System.out.println("Indique el porcentaje del donativo:");
		porcentDonativo=Leer.datoDouble();
		
		do {
			System.out.println("");
			System.out.println("¿Qué operación desea realizar?");
			System.out.println("--------------------------------------");
			System.out.println("0. Salir");
			System.out.println("1. Imprimir todo.");
			System.out.println("2. Calcular precio de una entrada.");
			System.out.println("3. Calcular total recaudado.");
			System.out.println("4. Calcular total entradas de arriva.");
			System.out.println("5. Imprimir tiquet para invitados.");
			System.out.println("6. Calcular total recaudado con los donativos.");
			System.out.println("---------------------------------------");
			System.out.println("");
			tope=Leer.datoInt();
			switch (tope) {
			case 0:
				System.out.println("Saliendo del programa.");
				break;
			case 1:
				t.imprimirTodo();
				break;
			case 2:
				System.out.println("Indique la fila y el asiento de la entrada a la que quiere calcular el precio.");
				System.out.println("Fila:");
				buscFila=Leer.datoInt();
				System.out.println("Asiento:");
				buscAsiento=Leer.datoInt();
				System.out.printf("El precio es: %.2f \n",t.calcularPrecioDeUnaEntrada(t.findByFilayAsiento(buscFila, buscAsiento),porcentDonativo));
				//bucle infinito en algún sitio si no encuento la entrada(no me ha dado tiempo :c)
				break;
			case 3:
				System.out.printf("El total es: %.2f \n", t.calcularTotal(porcentDonativo));
				
				break;
			case 4:
				System.out.printf("El total de las entradas de arriva es: %.2f \n",t.calcularTotalEntradasArriva(porcentDonativo));
				break;
			case 5:
				t.imprimirConsumicionInvitados();
				break;
			case 6:
				System.out.printf("El total recaudado es: %.2f \n",t.calcularTotalRecaudadoDonativos(porcentDonativo)); 
				break;
			default:
				System.out.println("OPCIÓN DESCONOCIDA");
				break;
			}
		} while (tope != 0);
 		System.out.println("Gracias por usar el programa.");

	}

}
