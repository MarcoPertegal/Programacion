package ejemplo_arrays2;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		int tam, op=0, uno=1, suma=0;
		int [] edades;
		
		System.out.println("Diga el tamaño del array");
		tam=Leer.datoInt();
		
		edades=new int [tam];
		//para cargar los datos en el array
		//repite el for hasta que la i es igual o mayor que 
		
		for (int i=0; i<edades.length;i++) {
				System.out.println("Diga el número");
				edades[i]=Leer.datoInt();
		}
		
		//para mostrar al usuario
		
		for (int i=0; i<edades.length;i++) {
			System.out.println(edades[i]);
		}
				
		//para cambiar un elemento del array
		
		System.out.println("¿Que elemento quiere cambiar?");
		op=Leer.datoInt();
		System.out.println("¿Que nuevo valor quiere asignarle?");
		edades[op-uno]=Leer.datoInt();
		
		for (int i=0; i<edades.length;i++) {
			System.out.println(edades[i]);
		}
		
		for (int i=0; i<edades.length; i++) {
			suma=suma+edades[i];
		}
		
		System.out.println("La suma es: "+suma);
	}

}
