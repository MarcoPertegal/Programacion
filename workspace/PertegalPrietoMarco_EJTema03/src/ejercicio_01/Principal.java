package ejercicio_01;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		double rad=0.0, area=0.0;//para poder imprimir el resultado final
		//Circulo cir1, cir3;
		Circulo cir2;
		
		//Forma 1: cascaporrastyle
		//System.out.println(cir1.radio);
		//C2 ES EL OBJETO
		//PUEDES CAMBIAR EL VALOR DE LA VARIABLE PORQUE EL OBJETO UNA VEZ QUE ESTÁ CREADO NO CQAMBIA SU VALOR
		//Forma 2:leyendo por teclado
		System.out.println("Diga usted el radio");
		rad=Leer.datoDouble();
		cir2 = new Circulo (rad);
		area= cir2.calcularArea();
		System.out.println(area);
		//como se llama a un metodo
		
		System.out.println(cir2);


	}

}
