package ejercicios_11;

import utilidades.copy.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		
		//Sacar agua en litros por segundo, capacidad del pozo en metros cubicos, ¿cuantos metros cubicos se saca en 
		//24horas. caudal 8litros/s, ? metros cúbicos.
		
		double litros, horas, segundos=0, mult=3600, litrosagua=0, coverlitm3=1000, m3=0 ;
		

		
			System.out.println("Bienvenido al programa, introduzca la capacidad del pozo en litros.");
		
				litros=Leer.datoDouble();
		
			System.out.println("Introduzca el tiempo transcurrido en horas.");
		
				horas=Leer.datoDouble();
		
				segundos=horas*mult;
				
				litrosagua=segundos*litros;
		
			System.out.println("Los litros por segundo extraídos son "+litrosagua);
		
				m3=litrosagua/coverlitm3;
		
		System.out.println("Los metros cuadrados de agua extraídos son "+m3);

	}

}
