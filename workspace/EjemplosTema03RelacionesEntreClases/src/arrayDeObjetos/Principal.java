package arrayDeObjetos;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		int nVs=0,tam=5, tope=0, op=0;
		double potencia;
		String modelo;
		//creación array, se le da el nombre de la clase del objeto al array porque va a guardar objetos generados de esa clase
		Vehiculo lista[]= new Vehiculo[tam];
		
		do {
			//para guardar un vehiculo hay que darle primero los datos a la clase
			System.out.println("Introduce el modelo del vehículo");
			modelo = Leer.dato();
			System.out.println("Introduce la potencia");
			potencia=Leer.datoDouble();
			
			lista[nVs] = new Vehiculo (modelo, potencia);//aqui el nVs cuenta la posición en la que estamos como la i de un bucle for 
			
			nVs++; //cuenta el numero de vehiculos que están guardados en el array, por si no llegamos a completar el array entero 
			
			System.out.println("Si desea terminar pulse 0, pulse otro numer para seguir");
			tope=Leer.datoInt();
			
		} while (tope != 0 && nVs < lista.length); //lo de poner nVs se pone para que salga del bucle cuando el array llegue al tamaño máximo(tam = .lenght)
		
		//Imprimimos los vehículos introducidos, ojo no hasta el tamaño del array, sino hasta donde hay vehículos con datos, no ponemos lista.lenght porque sino
		//nos va a mostrar nul, su no lo hemos rellenado entero
		
		for (int i = 0; i < nVs; i++) {
			System.out.println(lista[i]);
		}
		System.out.println("Elija el modelo que quiere cambiar:");
		op=Leer.datoInt();
		System.out.println("Por que modelo:");
		modelo=Leer.dato();
		lista[op-1].setModelo(modelo);
		
		for (int i = 0; i < nVs; i++) {
			System.out.println(lista[i]);
		}
		
		System.out.println("Gracias por usar el programa");
	}

}
