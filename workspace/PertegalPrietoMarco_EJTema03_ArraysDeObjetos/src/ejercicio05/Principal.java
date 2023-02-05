package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		double precioBase;
		String color;
		char consumoE, letra;
		double peso;
		Electrodomestico e;
		
		e = new Electrodomestico (2.0, "Blanco", 'F', 5.0);
		
		System.out.println("Diga letra");
		letra=Leer.datoChar();
		e.comprobarConsumoEnergetico(letra);
		
	}

}
