package ejemploRelacionEntreClases;

import utilidades.Leer;

public class Principal {
	//enunciado está en moodle
	//Un número “racional” es un número representado por el cociente de dos números enteros (las fracciones de toda la vida), por ejemplo, 5/7 siendo el 
	//número el número de arriba el llamado “numerador” y el de abajo “denominador”.

	//Una clase que modele estos números es muy útil porque no todos los números racionales pueden ser representados exactamente por float, por ejemplo, 
	//1/3 + 1/3 + 1/3 que es 1, usando float sería 0.333333+0.333333+0.333333 que es 0.999999.

	//Crearemos una clase llamada Racional cuyos atributos sean numerador y denominador tipo int . Otra llamada Operaciones sin atributos donde podremos 
	//realizar varias operaciones (métodos). Para ello, la clase Operaciones debe tener lo siguiente:

	// Constructor.

	// Un método para multiplicar dos números racionales. Se le pasarán como argumentos dos números racionales correspondientes a los dos racionales a multiplicar 
	//y devolverá otro racional (el resultado). En el main se imprimirá el resultado por pantalla.

	//NOTA: Para multiplicar dos racionales, se multiplican sus numeradores (este número será el numerador del resultado) y se multiplican los denominadores 
	//(este será el denominador del resultado), es decir, para multiplicar num1/den1 por num2/den2 la operación es:

	//num/den= (num1*num2)/(den1*den2)

	// Un método para cambiar el signo de un número, es decir, que se le pase un numerador y denominador y devuelva dicho número racional con el signo cambiado. 
	//(También se puede hacer otra versión pasando como argumento el complejo entero y cambiar el signo).

	// Se pueden añadir más operaciones como dividir, sumar, etc.

	// El programa principal, debe contar con un menú y se debe repetir hasta que el usuario desee.

	public static void main(String[] args) {
		int numerador1=0, numerador2=0, tope=0;
		int denominador1=0, denominador2=0;
		Fracciones f1;//f1, y f2, estos son dos objetos diferentes usando el mismo contructor(la clase fracciones)
		Fracciones f2;
		Fracciones fTotal;//para guardar en una variable en el main he imprimirlo
		Operaciones op = new Operaciones();
		
		System.out.println("Indique el numerador de la fracción 1:");
		numerador1=Leer.datoInt();
		System.out.println("Indique el denominador de la fracción 1:");
		denominador1=Leer.datoInt();
		
		System.out.println("Indique el numerador de la fracción 2:");
		numerador2=Leer.datoInt();
		System.out.println("Indique el denominador de la fracción 2:");
		denominador2=Leer.datoInt();
		
		f1=new Fracciones (numerador1, denominador1);
		f2= new Fracciones (numerador2, denominador2);
		fTotal = new Fracciones (0,0);
		
		
		do {
			System.out.println("Qué operación desea realizar:");
			System.out.println("------------------------------------");
			System.out.println("0.Para salir.");
			System.out.println("1.Para multiplicar");
			System.out.println("2.Para cambiar de signo");
			System.out.println("3.Para imprimir");
			tope=Leer.datoInt();
			
			switch (tope) {
			case 0:
				System.out.println("Saliendo del programa.");
				break;
			case 1:
				System.out.println("Resultado:"+op.multiplicarF(f1, f2)); //aqui no se instancia el objeto fracciones en el main 
																		  //porque este se intancia dentro del metodo multiplicarF
				fTotal= op.multiplicarF(f1, f2);						  //para guardar el result en una variable
				System.out.println("Resultado:"+fTotal);				  //para imprimirlo
				break;
			case 2:
				
				break;
			case 3:
				op.imprimirFraccion(fTotal);							//terminar el metodo imprimir y el de cambiar el sign de un unumero del case 2
				break;
			default:
				break;
			}
		} while (tope != 0);
		System.out.println("Gracias por usar el programa.");
		
		
		
	}

}
