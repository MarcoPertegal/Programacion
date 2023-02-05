package ejercicio_02;

public class Principal 
{

	public static void main(String[] args) 
	{
	
		double area=0, volumen=0, largo=50, ancho=21, profundidad=2.50, precio=1.80, result=0, litrostot=0, litrosmetrocuadrado=1000;
		
		
		System.out.println("Hola, bienvenido al programa.");
		
			area=largo*ancho;
		
		System.out.println("El area de la piscina es "+area+" metros cuadrados.");
		
			volumen=area*profundidad;
		
		System.out.println("El volumen son "+volumen+" metros cúbicos.");
			
			litrostot=volumen*litrosmetrocuadrado;
			
		System.out.println("Harán falta "+litrostot+" litros de agua para llenarla.");
		
			result=precio*litrostot;
		
		System.out.println("Por lo que llenar la piscina costaría "+result+" euros.");
		
		System.out.println("Gracias por usar el programa.");
	}

}
