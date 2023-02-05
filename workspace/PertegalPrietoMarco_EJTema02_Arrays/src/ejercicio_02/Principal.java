package ejercicio_02;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		int tam=0, tope=0;
		
		int [] nums;
		
		System.out.println("Bienvenido al programa para guardar números enteros.");
		
		do {
			
			System.out.println("Diga el tamaño del array:");
		
			tam=Leer.datoInt();
		
			nums= new int [tam];
		
			for (int i = 0; i < nums.length; i++) {
				System.out.println("Diga un número:");
				nums[i]=Leer.datoInt();
			}
		
			for (int i = 0; i < nums.length; i++) {
				System.out.println(nums[i]);
			}
			System.out.println("");
			System.out.println("Pulse 0 para salir o cualquier número para seguir:");
			tope=Leer.datoInt();
		
		} while (tope != 0);
			System.out.println();
	}

}
