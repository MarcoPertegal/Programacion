package ejercicio_09;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		int tope=0, numBilletes=0;
		double preBilletes = 5.0, preTotal=0.0, pago=0.0, cambio=0.0;
		Maquina maq= new Maquina();
		
		do {
		System.out.println("");
		System.out.println("");
		System.out.println("Bienvenido a la máquina de tiquets");
		System.out.println("---------------------------------");
		System.out.println("0.Salir");
		System.out.println("1.Compar billetes.");
		System.out.println("2.Calcular cambio a devolver.");
		System.out.println("3.Imprimir billete.");
		System.out.println("4.Opciones del operario:");
		System.out.println("--------------------------------");
		tope=Leer.datoInt();
		
		switch (tope) {
		case 0:
			System.out.println("saliendo");
			break;
		case 1:
			System.out.println("Cuantos billetes desea:");
			numBilletes=Leer.datoInt();
			preTotal=maq.calcularPrecio(preBilletes,numBilletes);
			System.out.printf("El precio total de la compra es %.2f",preTotal);
			break;
		case 2:
			System.out.println("Con cuanto dinero va a pagar:");
			pago=Leer.datoDouble();
			cambio=maq.calcularCambio(preTotal, pago);
			System.out.printf("Su cambio es de %.2f",cambio);
			break;
		case 3:
			System.out.println("///////////////////////////////////////////");
			System.out.println("Tiquet valido para "+numBilletes+" presonas");
			System.out.println("///////////////////////////////////////////");
			break;
		case 4:
			
		default:
			System.out.println("NÚMERO DESCONOCIDO");
			break;
		}
		
		} while (tope !=0);
	}

}
