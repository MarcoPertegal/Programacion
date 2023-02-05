package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nom= "MIGUEL", concepto, eleccionConcepto;
		int tam, tope=0, id, posicion=0;
		double gasto, presuMarcado, nuevoGasto, buscGasto;
		Compra [] lista;
		GestionCompra ges;
		
		System.out.println("//////////////////////////////////");
		System.out.println("/ BIENVENIDO AL PROGRAMA "+nom+" /");
		System.out.println("//////////////////////////////////");
		System.out.println("");
		System.out.println("Indique el número de compras que va a realizar:");
		tam=Leer.datoInt();
		
		lista = new Compra [tam];
		
		ges = new GestionCompra(lista);
		
		//acordarse de quitarlo
		lista[0] = new Compra ("ropa", 6, 1254);
		lista[1] = new Compra ("comida", 5, 5432);
		lista[2] = new Compra ("juguetes", 7, 1093);
		 
		do {
			System.out.println("");
			System.out.println("Seleccione la operación que desea realizar:");
			System.out.println("-------------------------------------------");
			System.out.println("0. Salir.");
			System.out.println("1. Introducir nueva compra.");
			System.out.println("2. Calcular gasto total.");
			System.out.println("3. Mostrar todos los datos.");
			System.out.println("4. Mostrar solo el concepto de las compras.");
			System.out.println("5. Calcular si ha pasado su presupuesto.");
			System.out.println("6. Modificart una compra.");
			System.out.println("7. Buscar compras por precio.");
			
			tope = Leer.datoInt();
			System.out.println("");
			switch (tope) {
				case 0:
					System.out.println("Saliendo del programa.");
					break;
				case 1:
					System.out.println("Indique los datos de su compra:");
					System.out.println("******************************");
					System.out.println("Introduzca el concepto de la compra:");
					concepto=Leer.dato();
					System.out.println("Introuzca el gasto:");
					gasto=Leer.datoDouble();
					System.out.println("Introduzca el número del ID:");
					id=Leer.datoInt();
						
					ges.add(new Compra(concepto, gasto, id), posicion);
					posicion++;
					
					break;
				case 2:
					System.out.printf("El gasto total actual es de %.2f euros \n",ges.calcularGastoTot());
					break;
				case 3:
					ges.mostrarTodo();
					break;
				case 4:
					ges.mostrarConceptoCompras();
					break;
				case 5:
					System.out.println("Especifique el presupuesto marcado:");
					presuMarcado=Leer.datoDouble();
					System.out.printf("El resultado es %.2f \n", ges.calcularPresupuesto(presuMarcado)); ;
					break;
				case 6:
					System.out.println("Especifique el concepto de la compra a la quiere editar su gasto:");
					eleccionConcepto=Leer.dato();
					System.out.println("Especifique el nuevo gasto:");
					nuevoGasto=Leer.datoDouble();
					
					ges.editGasto(ges.findByConcepto(eleccionConcepto), nuevoGasto);
					break;
				case 7:
					System.out.println("Introduzca el gasto por el cual quiere hacer la busqueda:");
					buscGasto=Leer.datoDouble();
					
					ges.imprimirListaPrecios(ges.findByPrecio(buscGasto));
					System.out.println("");
					break;
				default:
					System.out.println("NÚMERO DESCONOCIDO");
					break;
			}
		} while (tope != 0);
		System.out.println("Gracias por usar el programa");
	}

}
