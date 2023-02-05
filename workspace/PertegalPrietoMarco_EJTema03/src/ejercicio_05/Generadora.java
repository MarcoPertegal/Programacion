package ejercicio_05;

import java.util.Random;

public class Generadora 
{
	//Para Pares o nones
	public Boolean comprobarPares (int numPares) {
		int div=2, result;
		
		result=numPares%div;
		if (result==0) {
			return true;
		}else {
			return false;
		}
	}
	public void imprimirPar (boolean num) {
		if (num) {
			System.out.println("Gana PARES");
		}else {
			System.out.println("Gana NONES");
		}
	}
	
	//Para la quiniela
	public int generarResultadoQuiniela (int numQuiniela) {
		int desde=1, hasta=3, result=0;
		Random num = new Random(System.nanoTime());
		
		result= num.nextInt(hasta-desde+1)+desde;
		
		return result;
	}
	public void imprimirResultadoPartido (int ganadorPartido) {
		if (ganadorPartido == 1) {
			System.out.println("");
			System.out.println("RESULTADO: Ha ganado el Betis.");
			System.out.println("");
		}
		if (ganadorPartido == 2) {
			System.out.println("");
			System.out.println("RESULTADO: Han quedado empates.");
			System.out.println("");
		}
		if (ganadorPartido == 3) {
			System.out.println("");
			System.out.println("RESULTADO: Ha ganado el FC Barcelona.");
			System.out.println("");
		}
	}
	public void imprimirResultadoPartido (int resultadoQuiniela, int numQuini) {
		if (resultadoQuiniela == numQuini) {
			System.out.println("¡¡¡ENHORABUENA!!!");
			System.out.println("Ganaste la apuesta.");
			System.out.println("");
		}else {
			System.out.println("Perdiste la apuesta");
			System.out.println("");
		}
	}
	//Para la primitiva
	public int [] generarAleatorioPrimitiva () {
		int desde=0, hasta=49, tam=6;
		Random num=new Random(System.nanoTime());
		int [] premio = new int [tam];
		
		for (int i = 0; i < premio.length; i++) {
			premio[i]=num.nextInt(hasta-desde+1)+desde;
		}
		for (int i = 0; i < premio.length; i++) {
			for (int j = 0; j < premio.length; j++) {
				if (premio[i] == premio[j]) {
					 premio[i]=num.nextInt(hasta-desde+1)+desde;
				}
			}
		}
		return premio;
	}
	public void imprimirAleatorioPrimitiva(int premio []) {
		System.out.printf("NÚMERO PREMIADO:");
		for (int i = 0; i < premio.length; i++) {
			System.out.print(" "+premio[i]+" ");
		}
	}
	public int imprimirAciertosPrimitiva(int premio[], int opcion []) {
		int cont=0;
		for (int i = 0; i < opcion.length; i++) {
			for (int j = 0; j < premio.length; j++) {
				if (opcion[i]==premio[j]) {
					cont++;
				}	
			}
		}
		return cont;
	}
	public void imprimirGanadorPrimitiva(int cont) {
		int num=1;
		if (cont > num) {
			System.out.println("Ganaste la apuesta");
		}else {
			System.out.println("Perdiste la apuesta.");
		}
	}
}
