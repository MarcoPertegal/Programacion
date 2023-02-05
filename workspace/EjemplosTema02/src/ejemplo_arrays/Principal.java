package ejemplo_arrays;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		//ESTE ARRAYS ES PARA CUANDO NO SE SABEN LOS DATOS QUE SE VAN A INTRODUCIR PERO SI LA CANTIDAD
		//EL PRIMER CUADRADITO DE GUARDADO DE DATOS ES EL CERO
		//cuando se pude por taclado se parte por la mitad
		//Mejores bucles para arrys son los for.
		//NO se puede cambiar el valor de un array cuando se crea
		//lenght se usa para que el valor del arrays(tam) se mantenga deurante todo el programa
		//Para que no salgan los espacios de memoria es importante colocar los corchetes y la i
		//ejemplo PARA MOSTRAR TODOS LOS DATOS DENTRO DE UN ARRAY
		
		int tam=0;
		
		int [] edades; 
		
		System.out.println("Diga el tamaño del array");
		
		tam=Leer.datoInt();
	
		edades=new int [tam];
		
		//edades[0]=Leer.datoInt();
		//edades[1]=Leer.datoInt();
		
		tam=2;
		for (int i=0; i<edades.length;i++) {
			System.out.println("Diga un número:");
			edades[i]=Leer.datoInt();
		}
			
		for (int i=0; i<edades.length;i++) {
			System.out.println(edades[i]);
		}
		
		
		
		
		//edades[3]=39;
		//edades[5]=4;
		
		//ystem.out.println("La edad es : "+edades[2]);

	}

}
