package ejercicio02ConClasesAbstractas;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		//ACERLO CON OBSTRACTO
		
		int tope;
		TarjetaDeVisita t = new TarjetaDeVisita("Apple", 23523, "Sevilla", 235324, "Manolo", "Finanzas", 3441352);
		Carta c = new Carta ("Apple", 21414, "Sevilla", 3421414, "03/07/2023");
		
		do {
			System.out.println("");
			System.out.println("0. Salir");
			System.out.println("1. Imprimur tarjeta de visita.");
			System.out.println("2. Imprimir carta");
			tope=Leer.datoInt();
			System.out.println("");
			switch (tope) {
			case 0:
				System.out.println("Saliendo");
				break;
			case 1:
				t.imprimirDocumento();
				break;
			case 2:
				c.imprimirDocumento();
				break;
			default:
				System.out.println("NUM DESCONOCIDO");
				break;
			}
		} while (tope != 0);

	}

}
