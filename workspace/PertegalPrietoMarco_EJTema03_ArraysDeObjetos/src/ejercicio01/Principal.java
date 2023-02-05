package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		//EN ESTE EJERCICIO NOMBRE ES ID Y NOMBRE ALAVEZ
		double precioFab, peso, ganancia; 
		String nombre, categoria, nombreProd;
		boolean fragil;
		int tam, opcion, fragilNoFragil, posicion=0;
		Producto [] listaProductos;
		Gestion ges;
		
		
		System.out.println("Que cantidad de productos desea guardar:");
		tam=Leer.datoInt();
		
		listaProductos = new Producto[tam];
		
		ges = new Gestion(listaProductos);
		
		//Ange me a dicho al igual que se puede meter el menu en un metodo static tmb se puede meter los atributos de los objetos a casca porra
		//EN EL EXAMEN METER A CASCA PORRA DOS PRODUCTOS PARA NO TENER QUE RELLENAR POR TECLADO TODO EL RATO
		//SE hace asi
		//listaProductos[0]=new Producto (2.0, 3.0, "a", "b", true);
		for (int i = 0; i < tam; i++) {
			
		System.out.println("Diga el precio de fábrica");
		precioFab=Leer.datoDouble();
		System.out.println("Diga el peso");
		peso=Leer.datoDouble();
		
		System.out.println("Nombre");
		nombre=Leer.dato();
		System.out.println("Categoria");
		categoria=Leer.dato();
		System.out.println("1. Si es fragil.");
		System.out.println("2. No es fragil.");
		fragilNoFragil=Leer.datoInt();
		if (fragilNoFragil == 1) {
			fragil = true;
		}else {
			fragil = false;
		}
		ges.add(new Producto(precioFab, peso, nombre, categoria, fragil), posicion);//llamo al metodo add que está en la clase gestion para llenar 
																					// el array y dentro llamo a la clare producto para crear el objeto
		posicion ++;
		System.out.println("------------");
		}
		//SE PODRÍA PREGUNTAR AL FINAL DEL BUCLE FOR SI QUIERE AÑADIR UN NUEVO PRODUCTO O NO PARA NO RELLENAR EL ARRAY ENTERO
		
		
		do {
			System.out.println("0.Salir.");
			System.out.println("1.Listar todos los productos.");
			System.out.println("2.Consultar precio venta(calcular).");
			System.out.println("3.Comprobar si el producto es frágil.");
			System.out.println("4.Agregar.");
			System.out.println("5.Buscar por nombre.");
			opcion=Leer.datoInt();
			switch (opcion) {
			case 0:
				System.out.println("Saliendo");
				break;
			case 1:
				ges.imprimirTodosLosProductos();
				break;
			case 2:
				System.out.println("Diga el porcentaje de ganancia:");
				ganancia=Leer.datoDouble();
				System.out.println("Indique el nombre del producto:");
				nombreProd=Leer.dato();
				System.out.println(ges.calcularPvp(ges.findById(nombreProd), ganancia));
				break;
			case 3:
				System.out.println("Introduzca el nombre del producto que quiere comprobar:");
				nombreProd=Leer.dato();
				ges.imprimirFragil(ges.comprobarFragil(ges.findById(nombreProd)));// aqui e metido una cosa dentro de otra porque si quiero pasarle el booleano
																				//que me devuelve el metodo comprobar fragil sin guardarlo en una variable
																				//a imprimir fragil hay que meterlo dentro
				break;
			case 4:
				//el add no tiene sentido si el array ya está ya completo
				 //ges.add();
				break;
			case 5:
				System.out.println("Diga el nombre del producto");
				nombreProd=Leer.dato();
				System.out.println(ges.findById(nombreProd));
				break;
			default:
				System.out.println("NÚMERO DESCONOCIDO");
				break;
			}
			
		} while (opcion != 0);
		System.out.println("Gracias");

	}
	
}
