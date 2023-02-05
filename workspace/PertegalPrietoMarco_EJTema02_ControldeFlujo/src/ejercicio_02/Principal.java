package ejercicio_02;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		double num1,num2, cero=0, result;
		
		System.out.println("Bienvenido al programa que se usa para dividir dos números.");
		
		System.out.println("Por favor, introduzca el primer número:");
		
		num1=Leer.datoDouble();
		
		System.out.println("A continuación el segundo:");
		
		num2=Leer.datoDouble();
		
		if (num2 == cero) {
		System.out.println("ERROR");
		}else {
		result=num1/num2;
		System.out.printf("El resultado de la división es %.2f",result);
		}
			
	}
		
}
