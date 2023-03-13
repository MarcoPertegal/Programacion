package ejemploExcepciones;

import utilidades.Leer;

public class Principal {
	//para atrapar una excepción 
	public static void main(String[] args) {
		int num;
		int den=0;
		double result;
		
		do {
			try {
				System.out.println("Introduzca el numerador:");
				num=Leer.datoInt();
				System.out.println("Denominador");
				den=Leer.datoInt();
				result = num/den;
				System.out.printf("La división es: %.2f", result);
				
			}catch(ArithmeticException a) {//aqui va el nonbre del tipo del error
				System.err.println("¡Esta dividiendo por cero!");
			}catch(NumberFormatException n) {
				System.err.println("Error en la lectura de datos.");
			}catch(Exception e) {
				System.err.println("Error inesperado");//el .err hace que salga en rojo el texto, es lo mismo que .out pero dedicada a los errores
			}
		} while (den == 0); //demomento solo hacemos la comprobacion numerica hasta que veamos los strim
	}//hasta donde subimos si es un programa grande?lo normal es repetirlo entero, porque sino leer el codigo es confuso

}
