package ej5controlDeFlujoPeroConObjetos;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		int tam=0, desde=0, hasta=0, suma=0;
		int [] array;
		Clase cla; 
		
		System.out.println("Diga el tamaño del array");
		tam=Leer.datoInt();
		
		array= new int [tam];
		
		cla = new Clase(array);
		
		System.out.println("Diga entre qué números desea generar el array");
		desde=Leer.datoInt();
		System.out.println("hasta");
		hasta=Leer.datoInt();
		
		array=cla.rellenarArray(desde,hasta);
		
		cla.imprimirArray();
		
		System.out.println("");
		
		suma= cla.sumaArray();
		
		System.out.println("la suma es "+suma);
		
		System.out.println(cla);
	}

}
