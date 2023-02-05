package ejercicio_06;

import java.util.Random;

public class Moneda 
{
	public Boolean generarCaraoCruz (int eleccion) {
		int desde=1, hasta=2, result=0;
		Random num= new Random(System.nanoTime());
		
		result= num.nextInt(hasta-desde+1)+desde;
		if (result==eleccion) {
			return true;
		} else {
			return false;
		}
	}
	public void imprimirResultado (Boolean num) {
		if(num) {
			System.out.println("");
			System.out.println("||||||||||||||||||||||||");
			System.out.println("| ¡¡¡ HAS GANADOOO !!! |");
			System.out.println("||||||||||||||||||||||||");
		}else {
			System.out.println("");
			System.out.println("SIGA JUGANDO");
			System.out.println("");
		}
	}
}
