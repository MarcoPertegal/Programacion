package ejemploTipoExamenCorregido;

import utilidades.Leer;

public class Principal 
{

	public static void main(String[] args) 
	{
		String nombre, seccion;
		double precioBase, descuento, libras, nuevoPrecio, topeGanga, preLibras;
		int rebajas, tope;
		boolean rebajado=false;
		double ganancia;
		double [] precios= {100.0,3200.0, 300.0};
		Producto pro;
		
		
		System.out.println("Bienvenido al programa para administrar productos.");
		System.out.println("//////////////////////////////////////////////////");
		System.out.println("A continuación, introduzca los datos del producto:");
		System.out.println("");
		System.out.println("diga el nombre");
		nombre=Leer.dato();
		System.out.println("diga precio");
		precioBase=Leer.datoDouble();
		System.out.println("Sección:");
		seccion=Leer.dato();
		System.out.println("Pulse 1 está rebajado pulse 0 si no.");
		rebajas=Leer.datoInt();
		if(rebajas==1) {
			rebajado=true;
		}
		pro=new Producto (nombre, precioBase, seccion, rebajado);
		do {
			System.out.println("¿Que desea hacer con el producto?");
			System.out.println("---------------------------------");
			System.out.println("0.Pulse 0 para salir.");
			System.out.println("1.Pulse 1 para calcular el precio de venta al público.");
			System.out.println("2.Pulse 2 para aplicarle un descuento.");
			System.out.println("3.Pulse 3 para imprimir los datos de un producto.");
			System.out.println("4.Pulse 4 para calcular el precio de venta a público en libras.");
			System.out.println("5.Pulse 5 para modificar el precio base del producto");
			System.out.println("6.Pulse 6 para mostrar productos valor menor a 3 euros.");
			System.out.println("7.Pulse 7 para ver cual es el precio mayor(estan metidos a cascaporrastyle).");
			System.out.println("8.Pulse 8 para ver el valor en libras de todos los números del array.");
			System.out.println("");
			tope=Leer.datoInt();
			
			switch (tope) {
				case 0:
					System.out.println("Saliendo del programa.");
					break;
				case 1:
					System.out.println("Diga la ganancia en porcentaje");
					ganancia=Leer.datoDouble();
					pro.calcularPvp(ganancia);
					System.out.println("El precio de venta es:"+pro.getPvp());
					break;
				case 2:
					System.out.println("diga el porcentaje de la rebaja");
					descuento=Leer.datoDouble();
					pro.calcularPrecioRebajado(descuento);
					System.out.println("el precio es: "+pro.getPvp());
					break;
				case 3:
					System.out.println(pro);
					break;
				case 4:
					System.out.println("Diga cuanto es el cambio en libras ");
					libras=Leer.datoDouble();
					preLibras= pro.calcularLibras(libras);
					System.out.printf("Precio en libras: %.2f",preLibras); 
					break;
				case 5:
					System.out.println("Diga nuevo precio");
					nuevoPrecio=Leer.datoDouble();
					pro.setPrecioBase(nuevoPrecio);
					break;
				case 6:
					System.out.println("Diga el tope para ganga");
					topeGanga=Leer.datoDouble();
					pro.imprimirGanga(topeGanga);
					break;
				case 7:
					System.out.printf("El más caro cuesta: %.2f",pro.calcularMasCaro(precios));
					break;
				case 8:
					pro.calcualarEnLibras(precios);
					break;
				default:
					System.out.println("NÚMERO DESCONOCIDO");
					break;
			}	
		} while (rebajado);
		System.out.println("Gracias por usar el programa.");
	}

}
