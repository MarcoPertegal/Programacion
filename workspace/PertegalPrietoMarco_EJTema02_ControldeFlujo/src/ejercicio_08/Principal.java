package ejercicio_08;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		int num0=0, num1=0, num2=1;
		int tope=0;
		int total=0;
		
		System.out.println("Bienvenido al programa para calcular la suma y el producto de números enteros.");
		System.out.println("/////////////////////////////////////////////////////////////////////////////////");
		
		//while (cont<=tope) {
			//System.out.println("por favor, introduzca un número:");
			//nums=Leer.datoInt();
			//resultSuma=nums+suma;
			
			//cont++;
		//}
		//System.out.println("El resultado de la suma es "+resultSuma);
		//necesito guardar nums en algun sitio para que se vallan multiplicando a medida que el usuario va metiendo números
		
		
		//int suma=0;
			//System.out.println("Por favor, introduzca un número:");
			//nums=Leer.datoInt();
			
			//resultSuma=nums+suma;
		//}
		//System.out.println(resultSuma);
		
		do {
			System.out.println("----------------------------------------------------");
			System.out.println("Indique la cantidad de números que desea introducir:");
			System.out.println("Pulse 0 para salir.");
			tope=Leer.datoInt();
			for (int i=0; i<tope; i++) {
				System.out.println("Introduzca un número:");
				num0=Leer.datoInt();
				
				num1=num1+num0;
				//Machaca la variable?
				num2=num2*num0;
				//como hago para que esto no se repita todo el rato?  
				}
			System.out.println("La suma de los números es "+num1);
			System.out.println("El producto de los números es "+num2);
		} while (tope !=0);
		
		
		
		System.out.println("Gracias por usar el programa.");
		
		
	}

}
