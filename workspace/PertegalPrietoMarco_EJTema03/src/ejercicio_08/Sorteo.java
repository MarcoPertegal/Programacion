package ejercicio_08;

import java.util.Arrays;

import java.util.Random;

public class Sorteo 
{
	//atributos
	private int [] premio;
	private int [] decimo;

	//contructor
	public Sorteo() {
	}
	
	public Sorteo(int[] premio, int[] decimo) {
		this.premio = premio;
		this.decimo = decimo;
	}

	//gettersetter
	public int[] getPremio() {
		return premio;
	}
	
	public void setPremio(int[] premio) {
		this.premio = premio;
	}
	
	public int[] getDecimo() {
		return decimo;
	}
	
	public void setDecimo(int[] decimo) {
		this.decimo = decimo;
	}
	
	//toString
	@Override
	public String toString() {
		return "Sorteo [premio=" + Arrays.toString(premio) + ", decimo=" + Arrays.toString(decimo) + "]";
	}
	
	//metodos
	public void imprimirDecimo () {
		for (int i = 0; i < decimo.length; i++) {
			System.out.print(decimo[i]);
		}
	}
	public int [] generarPremio () {
		int hasta= 9, desde= 0;
		Random num= new Random(System.nanoTime());//aqui no hace falta volver a generar el array, supongo que funciona porque se a pasado en el constructor, he borrado la generacion del array y creado los constructores arriba y ya no me da error
		
		for (int i = 0; i < premio.length; i++) {
			premio[i]= num.nextInt(hasta-desde+1)+desde;		
		}
		return premio;
	}
	public void imprimirPremio () {
		for (int i = 0; i < premio.length; i++) {
			System.out.print(premio[i]);
		}
	}
	public int comprobarGanador (int [] decimo, int [] premio) {//que falla aqui con el contador?
		int cont=0;
		for (int i = 0; i < decimo.length; i++) {
			if (decimo[i] == premio[i]) {
					cont++;
			}
		}
		
		return cont;
	}
	public boolean comprobarGanador (int cont) {
		if (cont >= 2) {
			return true;
		}else {
			return false;
		}	
	}
	public void imprimirGanador (boolean ganador) {
		if (ganador) {
			System.out.println("Tienes un décimo premiado");
		}else {
			System.out.println("No tienes un décimo premiado");
		}
	}
	public int [] multiplicarArray(int numMult) {
		for (int i = 0; i < decimo.length; i++) {
			decimo[i]=decimo[i]*numMult;
		}
		return decimo;
	}
	public void imprimirMultiplicarArray() {
		for (int i = 0; i < decimo.length; i++) {
			System.out.println(decimo[i]);
		}
	}
	
}
