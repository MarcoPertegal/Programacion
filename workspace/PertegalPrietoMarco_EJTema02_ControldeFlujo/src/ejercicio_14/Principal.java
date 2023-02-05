package ejercicio_14;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		int  tope=0, cantEnt=0;
		double saldo=3000.0, preEnt=25.0, cantRet=0.0, preTot=0.0, cero=0.0, cantIng=0.0;
		
		
		System.out.println("");
		System.out.println("////////////////////////////////");
		System.out.println("Bienvenido a CAIXA BANK");
		System.out.println("////////////////////////////////");
		do {
			
			System.out.println("¿Qué desea?");
			System.out.println("--------------------------------");
			System.out.println("0.Pulse 0 para salir.");
			System.out.println("1.Pulse 1 para ver saldo.");
			System.out.println("2.Pulse 2 para retirar dinero.");
			System.out.println("3.Pulse 3 para comprar entradas.");
			System.out.println("4.Pulse 4 para ingresar dinero.");
			System.out.println("---------------------------------");
			tope=Leer.datoInt();
		
			switch (tope) {
				case 0:
					System.out.println("Usted a decidido salir del programa.");
				break;
		
				case 1:
					System.out.printf("El saldo de su cuenta es de %.2f euros.\n",saldo);
				break;
				
				case 2:
					System.out.println("¿Qúe cantidad desea retirar?");
					cantRet=Leer.datoDouble();
					if (cantRet < saldo) {
						saldo=saldo-cantRet;
						System.out.println("Cantidad retirada con éxito.");
					}else {
						System.out.println("Error en el retiro.");
					}
					
				break;
				
				case 3:
					System.out.printf("El precio de cada entrada son %.2f euros \n",preEnt);
					System.out.println("¿Cuantas entradas quiere comprar?");
					cantEnt=Leer.datoInt();
					preTot=preEnt*cantEnt;
					
					if (saldo > preTot) {
						saldo=saldo-preTot;
						System.out.println("Compra realizada con éxito.");
					}else {
						
						System.out.println("Error en la compra.");
					}
				break;
				
				case 4:
					System.out.println("¿Qué cantidad desea ingresar?");
					cantIng=Leer.datoDouble();
					if (cantIng > cero) {
						saldo=saldo+cantIng;
						System.out.println("Cantidad ingresada con exito.");
					}else {
						System.out.println("Error en el ingreso.");
					}
				break;
				
				default:
					System.out.println("Número desconocido.");
				break;
			}
		
		
		} while (tope !=0);
		
		System.out.println("Gracias por usar el programa.");
	}

}
