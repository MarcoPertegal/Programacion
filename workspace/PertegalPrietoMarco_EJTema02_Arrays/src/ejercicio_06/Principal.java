package ejercicio_06;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		int tam=0, tope=0;
		double gasto=0.0;
		String meses;
		String [] array1;
		double [] array2;
		System.out.println("");
		System.out.println("Bienvendio al programa para almacenar los pagos de las fiestas de cada mes.");
		System.out.println("---------------------------------------------------------------------------");
		do {
			System.out.println("");
			System.out.println("Por favor, introduzca el número de meses que quiere guardar:");
			tam=Leer.datoInt();
		
			array1= new String [tam];
			array2= new double [tam];
			System.out.println("Por favor introduzca el nombre de los meses:");
			for (int i = 0; i < array2.length; i++) {
				meses=Leer.dato();
				array1[i]=meses;
			}
			System.out.println("");
			System.out.println("-------");
			for (int i = 0; i < array1.length; i++) {
				System.out.println(array1[i]);
			}
			System.out.println("-------");
			System.out.println("");
			System.out.println("Por favor, introduzca la cantidad gastada en cada mes, siguiendo el mismo orden:");
			for (int i = 0; i < array2.length; i++) {
				gasto=Leer.datoDouble();
				array2[i]=gasto;
			}
			System.out.println("");
			System.out.println("////////////////////////////////////////");
			for (int i = 0; i < array1.length; i++) {
				System.out.print(array1[i]+"\t\t");
			}
			System.out.printf("\n");
			
			for (int i = 0; i < array2.length; i++) {
				System.out.print(array2[i]+"\t\t");
			}
			System.out.printf("\n");
			System.out.println("////////////////////////////////////////");
			System.out.println("");
			System.out.println("Pulse cualquier número para repetir el programa.");
			System.out.println("Pulse 0 para salir.");
			tope=Leer.datoInt();
		} while (tope !=0);
		System.out.println("Gracias por usar el programa.");
	}

}
