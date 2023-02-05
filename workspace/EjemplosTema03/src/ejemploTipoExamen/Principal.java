package ejemploTipoExamen;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		int tope=0,rebaja=0;
		String nombre, seccion;
		double preBase=0.0, porcentGanancia=0.0, porcentRebaja=0.0, valorMoneda=0.0, cambioMoneda=0.0;
		boolean sinoRebaja=false;
		Producto pro;
		
		System.out.println("Diga el nombre del producto:");
		nombre=Leer.dato();
		System.out.println("Diga el precio base:");
		preBase=Leer.datoDouble();
		System.out.println("Diga la sección a la que pertenece");
		seccion=Leer.dato();
		System.out.println("Pulse 1 si el producto tiene rebaja pulse 2 si no.");
		rebaja=Leer.datoInt();
		if (rebaja == 1) {
			sinoRebaja=true;
		}
		pro= new Producto(nombre, seccion, preBase, sinoRebaja);
		
		do {
			System.out.println("");
			System.out.println("¿Qué operación desea realizar?");
			System.out.println("------------------------------");
			System.out.println("0.Pulse 0 para salir.");
			System.out.println("1.Pulse 1 para calcular el precio de venta al público.");
			System.out.println("2.Pulse 2 para aplicarle un descuento.");
			System.out.println("3.Pulse 3 para imprimir los datos de un producto.");
			System.out.println("4.Pulse 4 para calcular el precio de venta a público en libras.");
			System.out.println("5.Pulse 5 para modificar el precio base del producto");
			System.out.println("6.Pulse 6 para mostrar productos valor menor a 3 euros.");
			System.out.println("");
			tope=Leer.datoInt();
			switch (tope) {
			case 0:
				System.out.println("Saliendo del programa");
				break;
			case 1:
				System.out.println("Que porcentaje de ganancia desea");
				porcentGanancia=Leer.datoDouble();
				pro.calcularPvp(porcentGanancia);
				System.out.println(pro.getPvp()); 
				break;
			case 2:
				System.out.println("Porcentaje de la rebaja");
				porcentRebaja=Leer.datoDouble();
				pro.calcularRebaja(porcentRebaja);
				System.out.println(pro.getPvp());
				break;
			case 3:
				System.out.println(pro);
				break;
			case 4:
				System.out.println("Indique el valor de la moneda de cambio respecto a 1 euro");
				valorMoneda=Leer.datoDouble();
				cambioMoneda=pro.calcularCambioMoneda(valorMoneda);
				System.out.print(cambioMoneda);
			default:
				System.out.println("numero desxocnocido");
				break;
			}
		}while(tope !=0);
	}

}
