package primerejemplo;

public class Principal 
{

	public static void main(String[] args) 
	{
		//Alumno en mayuscula porque el nombre de la clase esta en mayusculas
		//alum1 es el nombre de la variable, debe ser un nombre coherente con mas de una letra
		
		Alumno alum1=new Alumno("Jose",46,6.3,true);
		//asi se crea un alumno, se crean en la clase principal, ya está creadoç
		//main= clase principal
		//si no escribo ningun constructor eclipse nos da el que no tiene parametros pero si declaramos alguno eclipsse nos quita el de cero parametros y habria que definirlo para poder usarlo
		//todos los constructoes se llaman igal que la clase pero el contenido puede cambiar 
		Alumno alum2=new Alumno("Jose",48);
		System.out.println(alum1);//si solo pomngo esto se imprime la direccion de memoria
		System.out.println("El nombre es:"+alum1.nombre+" y ña edad: "+alum1.edad);// así si, y se le aplica lo mismo que ya hemos visto usando printf a la hora de imprimir dobles
		System.out.printf("Tu nota media es %.2f",alum1.notaMedia);
	}

}
