package ejercicio_15;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		int tope=0, cantSum=0, cantMult=0, cero=0;
		double restaResult=0.0, sumaNum=0.0, sumaNum0=0.0, restaNum1=0.0, restaNum2=0.0, multNum=0.0, multNum1=1.0;
		double divNum1=0.0, divNum2=0.0, divResult=0.0, caso5=0.0, div=2.0, resultCaso5=0.0;
		
		System.out.println("////////////////////////////////");
		System.out.println("Bienvenido a la MINI-CALCULADORA");
		System.out.println("////////////////////////////////");
		do {
			System.out.println("");
			System.out.println("---------------------------------------------------");
			System.out.println("Por favor, indique la operación que desea realizar:");
			System.out.println("---------------------------------------------------");
			System.out.println("0.Pulse 0 para salir.");
			System.out.println("1.Pulse 1 para sumar.");
			System.out.println("2.Pulse 2 para restar.");
			System.out.println("3.Pulse 3 para multiplicar.");
			System.out.println("4.Pulse 4 para dividir.");
			System.out.println("5.Pulse 5 para saber si un número es par o impar.");
			System.out.println("---------------------------------------------------");
			tope=Leer.datoInt();
			
			switch (tope) {
				case 0:
					System.out.println("Usted a decidido salir del programa.");
				break;
				
				case 1:
					System.out.println("Introduzca la cantidad de números que desea sumar:");
					sumaNum0=0;
					cantSum=Leer.datoInt();
					for (int i = 0; i < cantSum; i++) {
						System.out.println("Introduzca un número:");
						sumaNum=Leer.datoDouble();
						sumaNum0=sumaNum0+sumaNum;
					}
					System.out.printf("La suma de los números es %.2f \n",sumaNum0);
				break;
				
				case 2:
					System.out.println("Introuzca los dos números que desea restar:");
					restaNum1=Leer.datoDouble();
					System.out.println("Introduzca el segundo número:");
					restaNum2=Leer.datoDouble();
					restaResult=restaNum1-restaNum2;
					System.out.printf("La resta de los números es %.2f \n",restaResult);
				break;
				
				case 3:
					System.out.println("Introduzca la cantidad de números que desea multiplicar:");
					cantMult=Leer.datoInt();
					for (int i = 0; i < cantMult; i++) {
						System.out.println("Introduzca un número:");
						multNum=Leer.datoDouble();
						multNum1=multNum1*multNum;
					}
					System.out.printf("La multiplicación de los números es %.2f \n",multNum1);
				break;
				
				case 4:
					System.out.println("Intrduzca los dos números que desea dividir:");
					divNum1=Leer.datoDouble();
					System.out.println("Introduzca el segundo número:");
					divNum2=Leer.datoDouble();
					if (divNum2 == cero) {
						System.out.println("No se puede dividir entre cero.");
					}else {
						divResult=divNum1/divNum2;
						System.out.printf("El reultado de la división es %.2f \n",divResult);
					}
				break;
				
				case 5:
					System.out.println("Introduzca el número:");
					caso5=Leer.datoDouble();
					resultCaso5=caso5%div;
					if (resultCaso5 == cero) {
						System.out.println("El número es par.");
					}else {
						System.out.println("El número es impar.");
					}
				break;
				
				default:
					System.out.println("Opción desconocida.");
				break;
			}
		
		} while (tope != 0);
		System.out.println("Gracias por usar el programa.");
	}

}
