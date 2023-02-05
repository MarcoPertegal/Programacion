package ejercicio2;

public class Principal 
{

	public static void main(String[] args) 
	{
		// NO VARIABLES POR TECLADO
		
		String nomSuit="Suit GOOGLE", nomBeb= "Jack Daniels", nomRest="La Cantina Facebook";
		
		double preFinal=0.0, preTot=0.0, suit=120, jackDa=8, cena=32.50, descu=5, numNoch=5, numJackDa=3,numCena=2;
		
		double cenaTot=0.0, jackDaTot=0.0, suitTot=0.0, cien=100, descuFinal=0.0, cuent=500,dineCuent=0.0, preCabez=0.0, numCabez=2;
		
		
		suitTot=suit*numNoch;
		
		jackDaTot=jackDa*numJackDa;
		
		cenaTot=cena*numCena;
		
		preTot=suitTot+jackDaTot+cenaTot;
		
		descuFinal=(preTot*descu)/cien;
		
		preFinal=preTot-descuFinal;
		
				
		System.out.println("");
		
		System.out.println("Hola, bienvenido al calculo del precio de su estancia en el Hotel.");
		
		System.out.println("");
		
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////");
		
		System.out.println("FACTURA DEL HOTEL");

		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////");
	
		System.out.println("");
		
		System.out.println("CONCEPTO \t\t PRECIO UND \t\t\t CANTIDAD \t\t\t SUBTOTAL");
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		System.out.printf(" %s \t\t %.2f $ \t\t\t %.2f \t\t\t\t %.2f $ \n",nomSuit,suit,numNoch,suitTot);
		
		System.out.printf(" %s \t\t %.2f $ \t\t\t %.2f \t\t\t\t %.2f $ \n",nomBeb,jackDa,numJackDa,jackDaTot);
		
		System.out.printf(" %s \t %.2f $ \t\t\t %.2f \t\t\t\t %.2f $ \n",nomRest,cena,numCena,cenaTot);
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		System.out.printf("TOTAL sin descuento \t\t\t\t\t\t\t\t\t %.2f $\n",preTot);
		
		System.out.printf("TOTAL con descuento \t\t\t\t\t\t\t\t\t %.2f $\n",preFinal);
		
		System.out.println("");
		
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////");
		
		System.out.println("");
		
		dineCuent=cuent-preFinal;
		
		System.out.printf("En la cuenta te quedan %.2f dólares. \n",dineCuent);
		
		System.out.println("");
		
		preCabez=preFinal/numCabez;
		
		System.out.printf("Tendríais que pagar %.2f dólares por cabeza. \n",preCabez);
		
	}

}
