package ejercicio_07;

public class Principal 
{

	public static void main(String[] args) 
	{
		double kilometros=60, consumoACien=8, precioGaso=1.82, cien=100, gasConsumida=0, gasto=0;
		
		System.out.println("Hola, bienvenido al programa para calcular el gasto en gasolina.");
		
		
		gasConsumida=(kilometros*consumoACien)/cien;
		
		gasto=gasConsumida*precioGaso;
		
		System.out.println("El gasto en gasolina será de "+gasto+" euros.");
		
		System.out.printf("El gasto es %.2f en %.2f km recorridos \n",gasto, kilometros);
			
		System.out.println("Gracias por usar el programa.");
		
	}

}
