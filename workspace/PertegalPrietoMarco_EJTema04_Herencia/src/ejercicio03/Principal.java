package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		//Es verda que en este caso abria que hacerla abstracta, pero en el caso de que ubiese que calcular el impuesto a vehiculos que no fuerann ni
		//moto ni coche ni frugoneta si estaria bien que no fuese abstracta 
		double peso, impFurgo;
		int cilindrada;
		int potencia, tipo, tope2 = 0;
		String categoria = "";
		Vehiculo v;
		Motocicleta m;
		Furgoneta f;
		Coche c;
		
		System.out.println("BIENVENIDO");
		System.out.println("");
		System.out.println("Diga la cilindrada del vehículo:");
		cilindrada=Leer.datoInt();
		System.out.println("Diga la potencia:");
		potencia=Leer.datoInt();
		System.out.println("Introduzca la categoria:");
		System.out.println("0. Si es cero.");
		System.out.println("1. Si es ECO.");
		System.out.println("2. Si es tipoB.");
		System.out.println("3. Si es tipoC");
		tipo=Leer.datoInt();
		
		v = new Vehiculo(cilindrada, potencia, categoria);
		v.calcularImpuesto(tipo);
		
		do {
			
		System.out.println("A continuación intoduzca de qué tipo es su vehículo:");
		System.out.println("0. Salir.");
		System.out.println("1. Motocicleta.");
		System.out.println("2. Furgoneta.");
		System.out.println("3. Coche.");
		System.out.println("4. imprimir ");
		tope2=Leer.datoInt();
		switch (tope2) {
			case 1:
				System.out.println("Indique el peso de la motocicleta:");
				peso = Leer.datoDouble();
				m = new Motocicleta (cilindrada, potencia, categoria, peso);
				System.out.println(m.calcularImpuesto(tipo));
				break;
			case 2:
				System.out.println("Indique el peso de la furgoneta:");
				peso = Leer.datoDouble();
				System.out.println("Diga la cantidad fija que pagan las furgonetas:");
				impFurgo=Leer.datoDouble();
				f = new Furgoneta(cilindrada, potencia, categoria, peso);
				System.out.println(f.calcularImpuesto(impFurgo, tipo)); 
				break;
			case 3:
				System.out.println("Indique el peso del coche:");
				peso=Leer.datoDouble();
				c = new Coche(cilindrada, potencia, categoria, peso);
				System.out.println("Deberá pagar:"+c.calcularImpuesto(tipo)); 
				break;
			case 4:
				System.out.println(v);
				break;
			default:
				System.out.println("OPCIÓN DESCONOCIDA");
				break;
		}
		} while (tope2 !=0);
		System.out.println("Gracias por usar el programa.");
	}

}
