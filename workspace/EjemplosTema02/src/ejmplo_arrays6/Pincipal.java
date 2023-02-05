package ejmplo_arrays6;

import utilidades.Leer;

public class Pincipal 
{

	public static void main(String[] args) 
	{
		int tam=0, salir=0;
		String[] productos;
		double[] precios;
		
		System.out.println("Bienvenido, ");
		
		do {
			System.out.println("¿Cuantos productos quiere?");
			tam=Leer.datoInt();
			productos= new String[tam];
			precios= new double [tam];
			
			for(int i=0;i<productos.length; i++) {
				
				System.out.println("¿cómo se llama el producto?");
				productos[i]=Leer.dato();
			}
			
			for (int i = 0; i < precios.length; i++) {
				//completar
			}
				
			System.out.println("Pulse 0 para salir");
			salir=Leer.datoInt();
		}while(salir==0);

	}

}
