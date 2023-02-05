package ejercicio_01;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		
		double preFinal=0.0, costFabric, porcentVend=15, imp=12.5, cien=100, ganVend=0.0, impTot=0.0;
		
		System.out.println("Bienvenido al porgrama para calcular el precio final de un automovil.");
		
		System.out.println("Por favor, introduzca el precio de fabricación del automóvil.");
		
		costFabric=Leer.datoDouble();
		
		ganVend=(costFabric*porcentVend)/cien;
		
		impTot=(costFabric*imp)/cien;		
		
		preFinal=costFabric+ganVend+impTot;
		
		System.out.println("");
		
		System.out.printf("El precio final del automovil es de %.2f euros.",preFinal);
		
		System.out.println("Gracias por usar el programa.");

	}

}
