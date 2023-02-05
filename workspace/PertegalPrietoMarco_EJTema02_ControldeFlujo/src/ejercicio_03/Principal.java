package ejercicio_03;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		double cantReti, saldo=1500, nuSaldo=0;
		
		System.out.println("Bienvenido al programa para retirar el dinero que desee de su cuenta bancaria.");
		System.out.println("");
		System.out.printf("La cantidad de dinero actual en su cuenta es de %.2f euros. \n",saldo);
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Por favor, introduzca la cantidad que desea retirar:");
	
		cantReti=Leer.datoDouble();
		
		if (cantReti<=saldo) {
			nuSaldo=saldo-cantReti;
			System.out.printf("Usted a retirado %.2f euros, el dinero restante en su cuenta es de %.2f euros. \n",cantReti, nuSaldo);
		}else {
			System.out.println("NO ES POSIBLE");
		}
		System.out.println("Gracias por usar el programa.");
	}

}
