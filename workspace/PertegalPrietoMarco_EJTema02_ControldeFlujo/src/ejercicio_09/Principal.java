package ejercicio_09;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		//Leer una secuencia de números, hasta que el usuario 
		//introduzca un número negativo y mostrar la suma total de dichos números sin contar el negativo.
		
		int num=0, num0=0, tope=0, cero=0;
		
		System.out.println("Bienvenido al programa para calcular la suma de una secuencia de números.");
		System.out.println("/////////////////////////////////////////////////////////////////////////");
		
		do {
			System.out.println("Por favor, introduzca la cantidad de números que quiere sumar:");
			System.out.println("---------------------------------------------------");
			System.out.println("Introduzca un número negativo para salir");
			tope=Leer.datoInt();
			for (int i = 0; i < tope; i++) {
				System.out.println("Introduzca un número:");
				num=Leer.datoInt();
				
				num=num+num0;
			} 
			System.out.println("La suma de los numeros es "+num);
			
		} while (tope > 0 );
		
		
		System.out.println("Gracias por usar el programa.");

	}

}
