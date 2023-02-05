package ejercicio_03;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		int tam=0, cero=0, numCero=0, tope=0;
		double suma=0, media=0;
		double [] nums;
		
		System.out.println("Bienvenido al programa para guardar números y calcular la media y el número de ceros.");
	
		do {
			System.out.println("Introduzca el tamaño del array:");
			tam=Leer.datoInt();
			
			nums= new double [tam];
			System.out.println("Indique los números:");
			for (int i = 0; i < nums.length; i++) {
				nums[i]=Leer.datoInt();
			}
			for (int i = 0; i < nums.length; i++) {
				suma += nums[i];
			}
			media= suma/nums.length;
			
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == cero) {
					numCero++;
				}
			}
			System.out.printf("La media de los números es %.2f \n",media);
			System.out.println("El número de ceros es "+numCero);
			System.out.println("");
			System.out.println("Pulse cualquier número para continuar.");
			System.out.println("Pulse 0 para salir.");
			tope=Leer.datoInt();
		} while (tope != cero);
		System.out.println("Gracias por usar el programa.");
	}

}
