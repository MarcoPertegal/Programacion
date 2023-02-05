package ejemplo_arrays3;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		int tam=8, ceros=0;
		double suma=0;
		double [] num;
		num=new double [tam];
		double media;
		
		System.out.println("Bienvenido al proframa.");
		
		for(int i=0; i<num.length; i++) {
			System.out.println("Diga un número");
			num[i]=Leer.datoDouble();
			}
		
		for(int i=0;i<num.length; i++) {
			suma=suma+num[i];
			}
		
		for(int i=0; i<num.length; i++) {
			if(num[i]==0) {
				ceros++;
			}
			
			media=suma/num.length;
			System.out.println("La media de ");
		}
	}

}
