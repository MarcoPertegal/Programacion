package ejercicio_08;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	 {
		
		int tam=5, tope=0, cont=0, numMult= 0;
		boolean ganador;
		int [] decimo = new int [tam];
		int [] premio = new int [tam];
		Sorteo so= new Sorteo(decimo, premio); // he cambiado esto, ante estaba vacio y he creado un constructor con e stos dos para que no de fallo
		
		System.out.println("");
		System.out.println("////////////////////////////////////////////////////////////");
		System.out.println("Bienvenido al programa para generar el número de la loteria ");
		System.out.println("////////////////////////////////////////////////////////////");
		do {
			System.out.println("");
			System.out.println("---------------------------------------------");
			System.out.println("0. Para salir.");
			System.out.println("1. Para generar un décimo.");
			System.out.println("2. Para generar el décimo premiado.");
			System.out.println("3. Para comprobar si tiene un décimo premiado");
			System.out.println("4.Multiplicar array de decimo por un número entero");
			System.out.println("----------------------------------------------");
			tope=Leer.datoInt();
			switch (tope) {
				case 0:
					System.out.println("Saliendo del programa.");
					break;
				case 1:
					System.out.println("El número premiado se encontrará entre el 00.000 y el 99.999");
					System.out.println("Seleccione un número del 0 al 9:");
					
					for (int i = 0; i < decimo.length; i++) {
						System.out.print(i+1+".");
						decimo[i]=Leer.datoInt();
					}
					so.setDecimo(decimo);
					System.out.println("Ha elegido el número:"); 
					so.imprimirDecimo();
					break;
				case 2:
					premio = so.generarPremio();
					so.imprimirPremio();
					System.out.println("");
					//prueba
					for (int i = 0; i < premio.length; i++) {
						System.out.println(premio[i]);
					}
					break;
				case 3:
					cont= so.comprobarGanador(decimo, premio);
					System.out.println("Has acertado "+cont+" números.");
					ganador = so.comprobarGanador(cont);
					so.imprimirGanador(ganador);
					break;
				case 4:
					System.out.println("Número entero por el que desea multiplicarlo:");
					numMult=Leer.datoInt();
					so.multiplicarArray(numMult);
					so.imprimirMultiplicarArray();
					break;
				default:
					System.out.println("NÚMERO DESCONOCIDO");
					break;
			}
			
			
			} while (tope != 0);
		System.out.println("Gracias por usar el programa");
	}

}
