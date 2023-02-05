package ejercicio_04;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		String texto;
		int veces;
		Copiado copi;
		
		System.out.println("Bienvenido al programa para no dislocarse la muñeca escribiendo.");
		System.out.println("----------------------------------------------------------------");
		System.out.println("Escriba la frase que quiere repetir");
		texto=Leer.dato();
		System.out.println("Indique el número de veces que quiere repetirla:");
		veces=Leer.datoInt();
		copi= new Copiado (texto,veces);
		
		copi.imprimir();
		System.out.println("Gracias por usar el programa.");
	}

}
