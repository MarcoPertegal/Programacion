package ejercicio_03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		String empl= "Marco Pertegal", fecha= "19/10/2022", pat= "Patatas medianas", beb= "Bebida mediana", ham= "Hamburguesa Mc Royal";
		
		double prePatMed=2, preBebMed=2.50, preMacRoy=6.50, totPag=0.0, cantEntreg, cambio=0.0;
		
		int  und=1;
		
		totPag=prePatMed+preBebMed+preMacRoy;
		
		System.out.println("Empreado "+empl);
		
		System.out.println("Fecha: "+fecha);
		
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println("UND \t\t\t ARTICULO \t\t\t TOTAL");
		
		System.out.println("");
		
		System.out.printf("%d \t\t\t %s \t\t %.2f euros \n",und,pat,prePatMed);
		
		System.out.printf("%d \t\t\t %s \t\t %.2f euros \n",und,beb,preBebMed);
		
		System.out.printf("%d \t\t\t %s \t\t %.2f euros \n",und,ham,preMacRoy);
		
		System.out.println("--------------------------------------------------------------------");
		
		System.out.printf("TOTAl \t\t\t\t\t\t\t %.2f euros \n",totPag);
		
		System.out.println("");
		
		System.out.println("////////////////////////////////////////////////////////////////////");
		
		System.out.println("");
		
		System.out.println("Introduzca la cantidad con la que va a pagar.");
		
		cantEntreg=Leer.datoDouble();
		
		cambio=cantEntreg-totPag;
		
		System.out.printf("Su cambio es de %.2f euros.",cambio);
				
				
	}

}
