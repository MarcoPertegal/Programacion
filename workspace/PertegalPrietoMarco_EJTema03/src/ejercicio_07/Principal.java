package ejercicio_07;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		String titul;
		int tope=0;
		double ingr=0.0, saldo=0.0, reti=0.0;
		Boolean ret;
		CuentaCorriente cuen;
		
		System.out.println("");
		System.out.println("///////////////////////////");
		System.out.println("/ Bienvenido a CAIXABANK  /");
		System.out.println("///////////////////////////");
		System.out.println("");
		System.out.println("Intruzca el nombre del titular de la tajeta:");
		titul=Leer.dato();
		cuen= new CuentaCorriente(titul,saldo);
		System.out.println(cuen.getTitular()); 
		
		do {
			System.out.println("");
			
			System.out.println("");
			System.out.println("¿Qué operación desea realizar?");
			System.out.println("-------------------------------");
			System.out.println("0.Para salir.");
			System.out.println("1.Realizar un ingreso.");
			System.out.println("2.Realizar un retiro.");
			System.out.println("3.Calcular el saldo en dólares.");
			System.out.println("4.Mostrar su saldo actual.");
			System.out.println("5.Cambiar el nombre del titular.");
			System.out.println("-------------------------------");
			tope=Leer.datoInt();
			System.out.println("");
			switch (tope) {
			case 0:
				System.out.println("Saliendo del programa.");
				break;
			case 1:
				System.out.println("¿Qué cantidad desea ingresar?");
				ingr=Leer.datoDouble();
				cuen.ingresarSaldo(ingr);
				break;
			case 2:
				System.out.println("¿Qué cantidad desea retirar?");
				reti=Leer.datoDouble();
				ret=cuen.retirarSaldo(reti);
				cuen.imprimirRetirarSaldo(ret);
				break;
			case 3:
				System.out.println(cuen.calcularSaldo());
				break;
			case 4:
				System.out.println(cuen.getSaldo());
				break;
			case 5:
				System.out.println("Inserte el nuevo nombre:");
				titul=Leer.dato();
				cuen.setTitular(titul);
				break;
			default:
				System.out.println("NÚMERO DESCONOCIDO");
				break;
			}
		} while (tope != 0);
		System.out.println("Gracias por usar el programa.");
	}

}
