package ejercicio_06;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{	
		int eleccion=0;
		Boolean res;
		Moneda mon=new Moneda();
		
		do {
			
			System.out.println("///////////////////////////////////////////////////");
			System.out.println("/ BIENVENIDO AL PROGRAMA PARA JUGAR A CARA O CRUZ /");
			System.out.println("///////////////////////////////////////////////////");
			System.out.println("");
			System.out.println("1.Pulse 1 para cara.");
			System.out.println("2.Pulse 2 para cruz.");
			System.out.println("--------------------");
			eleccion=Leer.datoInt();
			
			res=mon.generarCaraoCruz(eleccion);
			
			mon.imprimirResultado(res);
		
		} while (res == false);
	}

}
