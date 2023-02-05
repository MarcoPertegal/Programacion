package ej5controlDeFlujoPeroConObjetos;

import java.util.Arrays;

import java.util.Random;

public class Clase {
	
	//atributos
	private int [] array;
	
	//constructor
	public Clase(int[] array) {
		this.array = array;
	}
	
	//gettersandsetters
	public int[] getArray() {
		return array;
	}
	public void setArray(int[] array) {
		this.array = array;
	}

	@Override
	public String toString() {
		return "Clase [array=" + Arrays.toString(array) + "]";
	}
	
	//Metodos mios
	public int [] rellenarArray(int desde, int hasta) {
		Random num = new Random (System.nanoTime());
		
		for (int i = 0; i < array.length; i++) {
			array[i]=num.nextInt(hasta-desde+1)+desde;
		}
		return array;
	}
	public void imprimirArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	public int sumaArray() {
		int suma=0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma;
	}

	
	
	
}
