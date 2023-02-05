package ejercicio_01;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		double num1,num2;
		
		System.out.println("Bienvenido al programa para determinar si un número es mayor a otro.");
		
		System.out.println("Por favor, introduzca los dos números a comparar.");
		
		System.out.println("Primer número:");
		
		num1=Leer.datoDouble();
		
		System.out.println("Segundo número:");
		
		num2=Leer.datoDouble();
		
		if (num1==num2){
			System.out.println("El número "+num1+" es igual que " +num2);
			}else  if (num1<num2) {
				System.out.println("El número "+num1+" es menor que "+num2);
			}else {
				System.out.println("El número "+num1+" es mayor que "+num2);
			}

		System.out.println("Gracias por usar el programa.");
	}
	

}
