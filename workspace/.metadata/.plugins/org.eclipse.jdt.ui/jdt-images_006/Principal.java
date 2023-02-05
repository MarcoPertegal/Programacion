package ejercicio_13;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		// Realizar un programa que calcule el salario mensual de un vendedor. Este será el resultado de
		//un sueldo fijo 1000€ mensuales más un porcentaje de las ventas realizadas. Lo que se cobra
		//por ventas se calculará mediante el 20 % de lo vendido en total al mes.
		
		int tope=0, result=0, cien=100, porcent=20, sueldo=0, base=1000, cero=0;
		
		do {
			
		
			System.out.println("Bienvenido al programa para calcular el salario mensual de un vendedor.");
			System.out.println("///////////////////////////////////////////////////////////////////////");
			System.out.println("Introduzca el número de ventas mensuales:");
			System.out.println("Pulse 0 para salir.");
		
			tope=Leer.datoInt();
		
			//for (int i = 0; i < tope; i++) {
				//num=num+num1;
			//}
			
				//if (tope > cero) {
				//	result=(num*porcent)/cien;
				//	sueldo=base+result;
					//}
				if (tope > cero) {
					result=(tope*porcent)/cien;
					sueldo=base+result;
				}
					System.out.println("El salario mensual del vendedor es de "+sueldo+" euros");
				
			
			
		} while (tope !=0);
		
		System.out.println("Gracias por usar el programa.");
	}

}
