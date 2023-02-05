package ejemplo_arrays_bidimensional;

import java.util.Random;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		// i+j es para rellenar lo que va dentro de cada hueco deol array, cambiarlo por .Leer para rellenarlo manualmente
		int fil=4, col=3;
		Random r= new Random (System.nanoTime());
		int hasta=10, desde=1;
		int [][] edades=new int[fil][col];
		//para rellenarlo
		for (int i = 0; i < edades.length; i++) {//este for sirbe para saltar a la fila de abajo, la i representa el número de filas
			for (int j = 0; j < edades[i].length; j++) {//este for es para saltar cada hueco de la fila, IMPORTANTE poner [i] eso representa el tamaño de la columa, si no se pone 
				edades[i][j]= r.nextInt((hasta-desde+1)-desde);
				//edades[i][j]=i+j;
				//miTabla[i][j]=Leer.datoInt(); para manualmente
			}
		}
		//Para mostrarlo
		for (int i = 0; i < edades.length; i++) {
			for (int j = 0; j < edades[i].length; j++) {
				System.out.print(edades[i][j]+"\t");//hay que quitarle el ln a printa para que no lo imprima todo en una fila hacia debajo
			}
			System.out.println("");//para que salte y cree una tabla
		}

	}

}
