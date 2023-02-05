package ej_08Otravez;

import java.util.Arrays;
import java.util.Random;

public class Sorteo {
	//atributos
	private int [] decimo;
	private int [] premio;
	
	
	//constructores
	public Sorteo(int[] decimo, int[] premio) {
		this.decimo = decimo;
		this.premio = premio;
	}
	public Sorteo() {
	}

	//gettersandsetters
	public int[] getDecimo() {
		return decimo;
	}


	public void setDecimo(int[] decimo) {
		this.decimo = decimo;
	}


	public int[] getPremio() {
		return premio;
	}


	public void setPremio(int[] premio) {
		this.premio = premio;
	}
	//toString
	@Override
	public String toString() {
		return "Sorteo [decimo=" + Arrays.toString(decimo) + ", premio=" + Arrays.toString(premio) + "]";
	}
	
	//metodos mios
	public void imprimirDecimo() {
		for (int i = 0; i < decimo.length; i++) {
			System.out.print(decimo[i]);
		}
	}
	public int [] generarPremio() {
		int desde=0, hasta=9;
		Random num = new Random(System.nanoTime());
		
		for (int i = 0; i < premio.length; i++) {
			premio[i]= num.nextInt(hasta-desde+1)+desde;
		}
		return premio;
	}
	public void imprimirPremio() {
		for (int i = 0; i < premio.length; i++) {
			System.out.print(premio[i]);
		}
	}
	public boolean comprobarPremio() {
		int cont=0;
		for (int i = 0; i < decimo.length; i++) {
			if (decimo[i] == premio[i]) {
				cont++;
			} 
		}
		if (cont > 2) {
			return true;
		}else {
			return false;
		}
	}
}
