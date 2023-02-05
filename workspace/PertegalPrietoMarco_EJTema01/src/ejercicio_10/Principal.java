package ejercicio_10;

import utilidades.copy.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		
		double precioprod, unds, descuento=20, div=100, resta=0, total=0, mult=0;
		
			System.out.println("Bienvenido al programa, introduzca el precio del producto.");

				precioprod=Leer.datoDouble();
		
			System.out.println("Introduzca la cantidad.");
		
				unds=Leer.datoDouble();
		
					mult=precioprod*unds;
			
			System.out.println("El precio total es "+mult+" euros.");
			
					resta=(mult*descuento)/div;
		
					total=mult-resta;
		
			System.out.println("Aplicandole el 20% de descuento sería un total de "+total+" euros.");
			
			System.out.println("Gracias por usar el programa.");
		
		
	}

}
