package ejercicio_05;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		int tope, numPares1, numPares2, totPares, numQuini, resultQuini, numPrimi, tam=6, cont=0;
		//con arrays el dela primitiva, no se instancia un objeto dento de cada case, crear el objeto fuera del do
		Boolean res;
		Generadora gen=new Generadora();
		int [] premio = new int [tam];
		int [] opcion = new int [tam];
		
		do {
			
		
			System.out.println("");
			System.out.println("////////////////////////////////////////////////////////");
			System.out.println("/ Bienvenido al programa para jugar a juegos antiguos. /");
			System.out.println("////////////////////////////////////////////////////////");
			System.out.println("");
			System.out.println("0.Pulse 0 para salir.");
			System.out.println("1.Pulse 1 para jugar a la quiniela.");
			System.out.println("2.Pulse 2 paea jugar a pares o nones.");
			System.out.println("3.Pulse 3 para jugar a la primitiva.");
			tope=Leer.datoInt();
			
			switch (tope) {
			case 0:
				System.out.println("Usted a decidido salir del programa.");
				break;
			
			case 1:
				System.out.println("");
				System.out.println("LA QUINIELA");
				System.out.println("Partido: Real Betis Balompié VS Fútbol Club Barcelona.");
				System.out.println("------------------------------------------------------");
				System.out.println("");
				System.out.println("1.Pulse 1 para saleccionar 1.");
				System.out.println("2.Pulse 2 para seleccionar X.");
				System.out.println("3.Pulse 3 para seleccionar 3.");
				System.out.println("-----------------------------");
				numQuini=Leer.datoInt();
				
				resultQuini=gen.generarResultadoQuiniela(numQuini);
				
				gen.imprimirResultadoPartido(resultQuini);
				gen.imprimirResultadoPartido(numQuini, resultQuini);//no entiendo esta lineade codigo 
			break;
					
			case 2:
				System.out.println("");
				System.out.println("PARE O NONE");
				System.out.println("-------------");
				System.out.println("Jugador 1 indique su número:");
				numPares1=Leer.datoInt();
				System.out.println("Jugardor 2 indique su número:");
				numPares2=Leer.datoInt();
				totPares=numPares1+numPares2;
				
				res=gen.comprobarPares(totPares);//aqui
				
				gen.imprimirPar(res);
			break;
				
			case 3:
				System.out.println("");
				System.out.println("LA PRIMITIVA");
				System.out.println("---------------");
				System.out.println("Indique la serie de SEIS números sin que se repitan:");
				for (int i=0; i < opcion.length; i++) {
					
					System.out.println("Indique el número:"); 
					numPrimi=Leer.datoInt();
					opcion[i]=numPrimi;
				}
				System.out.printf("NÚMERO ELEGIDO:");
				for (int i = 0; i < opcion.length; i++) {
					System.out.print(" "+opcion[i]+" ");
				}
				System.out.println("");
				premio = gen.generarAleatorioPrimitiva();
				
				gen.imprimirAleatorioPrimitiva(premio);
				cont=gen.imprimirAciertosPrimitiva(premio, opcion);
				System.out.println("");
				gen.imprimirGanadorPrimitiva(cont);
			
				
			break;
			
			default:
				System.out.println("NÚMERO DESCONOCIDO");
			break;
			}
		} while (tope !=0);
		System.out.println("Gracias por usar el programa");
	}

}
