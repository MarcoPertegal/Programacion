package ejercicio_04;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		//En un almacén de dimensiones 5 m de largo, 3 m de ancho y 2 m de alto queremos almacenar cajas de dimensiones 1.5 m de 
		//largo, 3 m de ancho y 2 m de alto. ¿Cuantas cajas podremos almacenar?
		
		double larg,ancho,alt,volCaja=0.0;
		
		System.out.println("Bienvenido al programa para calcular cuantas cajas de 1.5 largo x3 ancho x2 alto entrarían en un almacen");
		
		System.out.println("Por favor introduzca el largo de la caja");
		
		larg=Leer.datoDouble();
		
		System.out.println("Por favor introduzca el ancho de la caja.");
		
		ancho=Leer.datoDouble();
		
		System.out.println("Finalmente, introduzca el alto de la caja.");
		
		alt=Leer.datoDouble();
		
		volCaja=larg*ancho*alt;
		
		System.out.println(volCaja);
		
		
	}

}
