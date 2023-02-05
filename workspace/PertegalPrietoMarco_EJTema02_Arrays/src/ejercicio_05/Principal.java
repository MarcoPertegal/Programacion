package ejercicio_05;

import java.util.Random;

import utilidades.Leer;


public class Principal 
{

	public static void main(String[] args) 
	{
		int tam=0, hasta=0, desde=0, sum=0, mayor=0, menor=0, pos=0;
		int [] array;
		Random num=new Random(System.nanoTime());
		
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("Bienvenido al programa para generar números aleatorios y mostrar información sobre ellos.");
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("");
		System.out.println("Introduzca el tamaño del array.");
		tam=Leer.datoInt();
		
		array= new int [tam];
		//Para generar aleatorios
		System.out.println("Introduzca los dos valores entre los que quiere generar los números aleatorios.");
		System.out.println("DESDE:");
		desde=Leer.datoInt();
		System.out.println("HASTA:");
		hasta=Leer.datoInt();
		for (int i = 0; i < array.length; i++) {
			array[i]= num.nextInt(hasta-desde+1)+desde;
		}
		//para mostrar el array
		System.out.println("-------------------------------------");
		for (int i = 0; i < array.length; i++) {
			System.out.println("NÚMERO."+(i+1)+": "+array[i]);
		}
		System.out.println("--------------------------------------");
		//para mostrar la suma
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("La suma es "+sum);
		System.out.println("---------------------------------------");
		//para mostar el mayor y el menor
		mayor=array[0];
		menor=array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < menor) {	
				menor=array[i];
			}
			if (array[i] > mayor) {
				mayor=array[i];
			}
		}
		System.out.println("El número menor es "+menor);
		System.out.println("El número mayor es "+mayor);
		//para modificar un valor
		System.out.println("----------------------------------------------");
		System.out.println("Elija la posición del número que desea cambiar");
		pos=Leer.datoInt();
		System.out.println("¿Qué número desea introducir?");
		array[pos-1]=Leer.datoInt();
		for (int i = 0; i < array.length; i++) {
			System.out.println("NÚMERO."+(i+1)+": "+array[i]);
		}
	}

}