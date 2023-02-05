package ejercicio_05;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
	int sala,numSalaEst, numSalaJuni, numSalaTres, numSalaVip;
	double salaEst=5.50, salaJuni=7.00, salaTres=9.50, salaVip=11.00, preTotSalaEst=0.00, preTotSalaJuni=0.00;
	double preTotSalaTres=0.00, preTotSalaVip=0.00;
	
	System.out.println("////////////////////////////////");
	System.out.println("Bienvenido a cines AL-ANDALUS");
	System.out.println("////////////////////////////////");
	System.out.println("");
	System.out.println("Salas disponibles:");
	System.out.println("----------------------------------------------");
	System.out.printf("1.Sala Estandar \t\t %.2f euros \n",salaEst);
	System.out.printf("2.Sala Junior \t\t\t %.2f euros \n",salaJuni);
	System.out.printf("3.Sala 3D \t\t\t %.2f euros \n",salaTres);
	System.out.printf("4.Sala VIP \t\t\t %.2f euros \n",salaVip);
	System.out.println("-----------------------------------------------");
	System.out.println("Por favor, selecione el número de sala que desea:");
	
	sala=Leer.datoInt();
	
	switch (sala) {
		case 1:
			System.out.println("A seleccionado la Sala Estandar.");
			System.out.println("A continuación, intruzca el número de entradas que desea:");
			numSalaEst=Leer.datoInt();
			preTotSalaEst=numSalaEst*salaEst;
			System.out.println("---------------------------------------------------------");
			System.out.printf("Precio TOTAL \t\t\t %.2f euros \n",preTotSalaEst);
			break;
			
		case 2:
			System.out.println("A seleccionado la Sala Junior.");
			System.out.println("A continuación, introduzca el número de entradas que desea:");
			numSalaJuni=Leer.datoInt();
			preTotSalaJuni=numSalaJuni*salaJuni;
			System.out.println("-----------------------------------------------------------");
			System.out.printf("Precio TOTAL \t\t\t %.2f euros \n",preTotSalaJuni);
			break;
			
		case 3:
			System.out.println("A seleccionado la Sala 3D.");
			System.out.println("A continuación, introduzca el número de entradas que desea:");
			numSalaTres=Leer.datoInt();
			preTotSalaTres=numSalaTres*salaTres;
			System.out.println("----------------------------------------------------------");
			System.out.printf("Precio TOTAL \t\t\t %.2f euros \n",preTotSalaTres);
			break;
		case 4:
			System.out.println("A seleccionado la Sala VIP.");
			System.out.println("A continuación, introduzca el número de entradas que desea:");
			numSalaVip=Leer.datoInt();
			preTotSalaVip=numSalaVip*salaVip;
			System.out.println("-----------------------------------------------------------");
			System.out.printf("Precio TOTAL \t\t\t %.2f euros \n",preTotSalaVip);
			
			break;
		default:
			System.out.println("Número desconocido.");
		}
	System.out.println("");
	System.out.println("Gracias por usar el programa.");
		
	}


}
