package ejercicio_01;

import java.util.Random;

import utilidades.copy.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		int tam=5, cero=0, desde=0, hasta=3000, caso=0, totalCal=0, suma=0, numDias=0, calRecom=2200;
		double media=0;
		int [] nums;
		Random rd=new Random(System.nanoTime());
		
		System.out.println("///////////////////////////////////////////////////////////");
		System.out.println("Bienvenido al programa que gestiona el número de calorías.");
		System.out.println("///////////////////////////////////////////////////////////");
		System.out.println("");
		System.out.println("Introduzca la cantidad de días que quiere guardar las calorías:");
		tam=Leer.datoInt();
		
		do {
			nums= new int [tam];
			System.out.println("");
			System.out.println("OPCIONES DISPONIBLES:");
			System.out.println("------------------------------------------------------------------------");
			System.out.println("0.Pulse 0 para salir.");
			System.out.println("1.Pulse 1 para generar el número de calorías ingeridas.");
			System.out.println("2.Pulse 2 para mostrar los datos.");
			System.out.println("3.Pulse 3 para mostrar el total de calorías ingeridas.");
			System.out.println("4.Pulse 4 para mostrar qué día se han ingerido más calorías.");
			System.out.println("5.Pulsa 5 para mostrar la media de calorarías tomadas.");
			System.out.println("6.Pulsa 6 para modificar el consumo de calorías.");
			System.out.println("7.Pulsa 7 para mostrar días con menos de 2200 calorías.");
			System.out.println("8.Pulsa 8 para ver el porcentaje de calorías ingerido respecto a las 2200.");
			System.out.println("-------------------------------------------------------------------------");
			caso=Leer.datoInt();
			
			switch (caso) {
				case 0:
					System.out.println("Saliendo del programa.");
					break;
					
				case 1:
					for (int i = 0; i < nums.length; i++) {
						nums[i]=rd.nextInt(hasta-desde+1)+desde;
						}
					System.out.println("Números generados.");
					break;
					
				case 2:
					for (int i = 0; i < nums.length; i++) {
						System.out.println(nums[i]);
					}
					break;
					
				case 3:
					for (int i = 0; i < nums.length; i++) {
						totalCal += nums.length;
					}
					System.out.println("El total de calorías es "+totalCal);
					break;
					
				case 4:
					//for (int i = 0; i < num.length; i++) {
					//	if (num[i] > ) {
					//	}
					//}
					break;
					
				case 5:
					for (int i = 0; i < nums.length; i++) {
						suma += nums[i];
					}
					media=suma/nums.length;
					System.out.printf("La media de calorias tomadas al día es %.2f \n",media);
					break;
					
				case 6:
					System.out.println("Modificar elemento del array elegido.");
					break;
				
				case 7:
					for (int i = 0; i < nums.length; i++) {
						if (nums[i] < calRecom) {
							numDias++;
						}
					}
					System.out.println("El número de días en los que se han ingerido menos de las calorias recomendadas es de "+numDias);
					break;
				
				case 8:
					System.out.println("Elija un día:");
					for (int i = 0; i < nums.length; i++) {
						nums[i]=Leer.datoInt();
					}
					break;
					
				default:
					System.out.println("NÚMERO DESCONOCIDO");
					break;
			}
			
			
		} while (caso != cero );
		
		System.out.println("Gracias por usar el programa.");
	}

}
