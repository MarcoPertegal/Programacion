package ejercicio_03;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		double radio=0.0, altura=0.0, vol=0.0;
		Cilindro cili;
		
		System.out.println("Bienvenido al programa para calcular el volumen de un cilindro");
		System.out.println("---------------------------------------------------------------");
		System.out.println("");
		System.out.println("Por favor, indique el radio del cilindro:");
		radio=Leer.datoDouble();
		System.out.println("A continuación, indique la altura:");
		altura=Leer.datoDouble();
		cili= new Cilindro(radio,altura);
		System.out.println(cili.getAltura());
		System.out.println(cili.getRadio());
		vol=cili.calcularVolumen();//aqui
		System.out.println(vol);
		
		System.out.println(cili);
	}

}
