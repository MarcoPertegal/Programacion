package ejercicio_07;

import utilidades.Leer;

public class Principal
{

	public static void main(String[] args) 
	{
		int num, tope=10, result=0, cont=1;
		
		System.out.println("Bienvenido al programa para calcular la tabla de multiplicar de un número entero.");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Por favor, introduzca un número entero:");
		num=Leer.datoInt();
		
		while (cont<=tope) {
			
			result=num*cont;
			System.out.println(+num+" x "+cont+" = "+result);
			cont++;
		}
		System.out.println("Gracias por usar el programa.");
	}

}
