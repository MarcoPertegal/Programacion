package ej_08Otravez;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		int tam=5, tope=0;
		boolean ganador=false;
		int [] decimo = new int [tam];
		int [] premio = new int [tam];
		Sorteo so= new Sorteo(decimo, premio);
		
		System.out.println("Bienvenido");
		
		do {
			System.out.println("");
			System.out.println("");
			System.out.println("Qué desea hacer?");
			System.err.println("''''''''''''''''''''''''");
			System.out.println("0.salir");
			System.out.println("1.Para introducir el décimo");
			System.out.println("2.Para generar número premiado.");
			System.out.println("3.Para comprobar si el decimo esta premiado");
			System.out.println("4.Ver si has ganao");
			tope=Leer.datoInt();
			
			switch (tope) {
				case 0:
					System.out.println("saliendo");
					break;
				case 1:
					System.out.println("Diga los números del decimo que desea introducir");
					for (int i = 0; i < premio.length; i++) {
						decimo[i]=Leer.datoInt();
					}
					so.setDecimo(decimo);
					System.out.println("Su décimo es el:");
					so.imprimirDecimo();
					break;
				case 2:
					System.out.println("El número premiado es:");
					premio= so.generarPremio();
					so.imprimirPremio();
					break;
				case 3:
					ganador=so.comprobarPremio();
					break;
				case 4:
					System.out.println(ganador);
					break;
				default:
					System.out.println("NÚMERO DESCONOCIDO");
					break;
			}
		}while(tope != 0);
		System.out.println("Gracias por usar el programa");

	}

}
