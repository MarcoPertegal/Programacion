package ejercicio_06;

import utilidades.copy.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Hola, bienvenido al programa, calcular precio con descuento.");
		
		double precio=50, descuento=20, conv=100, mult=0, resta=0, result=0;
		
		precio = Leer.datoDouble();
		
		mult=precio*descuento;
		
		resta=mult/conv;
		
		result=precio-resta;
		

		System.out.println("Un descuento del "+descuento+" porciento a un producto de "+precio+" euros da como resultado "+result);
		
		System.out.println("Gracias por usar el programa.");
	}

}
