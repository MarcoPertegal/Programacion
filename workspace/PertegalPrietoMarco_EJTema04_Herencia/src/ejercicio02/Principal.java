package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		//lo que haria falta es terminar la carta y un main para impprimir las tres clases
		
		int tope;
		Documento d = new Documento("Apple", 6734623, "Sevilla", 677443322);
		TarjetaDeVisita t = new TarjetaDeVisita("Apple", 23523, "Sevilla", 235324, "Manolo", "Finanzas", 3441352);
		Carta c = new Carta ("Apple", 21414, "Sevilla", 3421414, "03/07/2023");
		
		do {
			System.out.println("0. Salir");
			System.out.println("1. Imprimir documeto.");
			System.out.println("2. Imprimur tarjeta de visita.");
			System.out.println("3. Imprimir carta");
			tope=Leer.datoInt();
			switch (tope) {
			case 0:
				System.out.println("Saliendo");
				break;
			case 1:
				d.imprimirDocumento();
				break;
			case 2:
				t.imprimirTarjetaDeVisita();
				break;
			case 3:
				c.imprimirCarta();
				break;
			default:
				System.out.println("NUM DESCONOCIDO");
				break;
			}
		} while (tope != 0);

	}

}
