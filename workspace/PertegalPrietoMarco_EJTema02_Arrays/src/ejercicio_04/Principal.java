package ejercicio_04;

import java.util.Random;
import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		int tam=0, tope=0, hasta=89, desde=1, pos=0;
		int [] array;
		Random num=new Random(System.nanoTime());
		
		System.out.println("///////////////////////////////////////////////////////////");
		System.out.println("Bienvenido al programa para generar aleatorios entre 0 y 89");
		System.out.println("///////////////////////////////////////////////////////////");
		
		do {
			System.out.println("Por favor introduzca el tamaño del array.");
			tam=Leer.datoInt();
			array = new int [tam];
			
			//para crear los aleatorios y guardarlos
			for (int i = 0; i < array.length; i++) {
				array[i]=num.nextInt(hasta-desde+1)-desde;
			}
			//para mostrarlos
			for (int i = 0; i < array.length; i++) {
				System.out.println("NÚMERO"+(i+1)+":"+array[i]);
			}
			//con esto solo ya se cambia el numero de dentro del arrays?
			System.out.println("¿Qué posición desea cambiar?:");
			pos=Leer.datoInt();
			System.out.println("Por qué número:");
			array[pos-1]=Leer.datoInt();
			
			for (int i = 0; i < array.length; i++) {
				System.out.println("NÚMERO"+(i+1)+":"+array[i]);
			}
			
			//que es lo que se hace para que salgan aleatorios desglosado
			//como es lo de poner la posicion que quiero que cambie
			
			System.out.println("Pulse culquier número para repetir el programa.");
			System.out.println("Pulse cero para salir.");
			tope=Leer.datoInt();
		} while (tope != 0);
		System.out.println("Gracias por usar el programa");
	}

}
