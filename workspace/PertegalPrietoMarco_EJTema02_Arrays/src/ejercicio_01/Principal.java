package ejercicio_01;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		int tam=0;
		
		String [] nom;
		
		System.out.println("Diga el tamaño del array.");
		
		tam=Leer.datoInt();
		
		nom=new String [tam];
		//los for empiezan en cero igual que los array
		for (int i = 0; i < nom.length; i++) {
			System.out.println("Diga un nombre:");
			nom[i]=Leer.dato();
		}
		
		for (int i = 0; i < nom.length; i++) {
			System.out.println(nom[i]);
		}

	}

}
