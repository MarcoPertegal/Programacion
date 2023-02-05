package ejercicio_02;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		int num=0, num2=0;
		Boolean res; // res sirbe para los dos metodos
		Operaciones op;
		
		System.out.println("Bienvenido al pograma para identificar si un número es par o impar y positivo o negativo.");
		System.out.println("Introuzca un número para identificar si es positivo o negativo:");
		num=Leer.datoInt();
		//la palabra de los parentesis es la que se usa dentro del metodo
		//LA MEJOR OPCIÓN, para imprimir el resultado
		op=new Operaciones();
		res=op.comprobarPositivoBoleano(num);
		op.imprimir(res);
		
		System.out.println("Introduzca un número para saber si es par o impar");
		num2=Leer.datoInt();
		res=op.comprobarParBoleano(num2);
		op.imprimir2(res);
		
		System.out.println("Gracias por usar el programa.");
	}

}
