package ejemploRelacionClases;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		String nombre;
		int edad, topeEdad=0;
		Cliente c;
		long numeroC;
		float saldo, interes;
		Cuenta cu;
		
		System.out.println("Diga nombre");
		nombre=Leer.dato();
		System.out.println("Diga la edad");
		edad=Leer.datoInt();
		
		c=new Cliente (nombre, edad);
		
		System.out.println("Diga número de cuenta");
		numeroC=Leer.datoLong();
		System.out.println("Diga saldo");
		saldo=Leer.datoFloat();
		System.out.println("Diga interés");
		interes=Leer.datoFloat();
		
		cu=new Cuenta(numeroC,c,saldo,interes);
		
		System.out.println("Datos del cliente: "+c);
		System.out.println("Datos de la cuenta: "+cu.getC());
		
		System.out.println("A partir de que edad se cobra pesión?");
		topeEdad=Leer.datoInt();
		System.out.printf("Su saldo es: %.2f", cu.ingresarPension(topeEdad));
		
	}

}
