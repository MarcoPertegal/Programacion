package ejemplocrud;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		//crear un producto crud productos y al array de productos agregar dos productos y despues buscar uno de eses productos que quiera el usuario 
		
		String codigo, nombre, cod;
		double precioU, precioNuevo;
		CrudProducto crud2;
		Producto [] listaCrud2;
		int tam, opcion, posicion=0;
		
		System.out.println("Indique cuantos productos habrá:");
		tam=Leer.datoInt();
		
		listaCrud2= new Producto [tam];
		
		crud2 = new CrudProducto(listaCrud2);
		
		do {
			System.out.println("0.Salir.");
			System.out.println("1.Agregar nuevo producto.");
			System.out.println("2.Buscar un producto.");
			System.out.println("3.Mostrar la lista de productos.");
			System.out.println("4.Modificar un producto:");
			System.out.println("5.Borrar un producto(No es borrar es cambiar true o false para saber si está activo o no)");
			System.out.println("6.Mostrar solo activos");
			
			opcion=Leer.datoInt();
			switch (opcion) {
			case 0:
				System.out.println("Saliendo");
				break;
			case 1:
				System.out.println("Diga el código");
				codigo=Leer.dato();
				System.out.println("Diga el nombre");
				nombre=Leer.dato();
				System.out.println("Diga el precio");
				precioU=Leer.datoDouble();
				crud2.add(new Producto(codigo, nombre, precioU, true), posicion);
				posicion ++;
				break;
			case 2:
				System.out.println("Diga código a buscar");
				cod=Leer.dato();
				System.out.println(crud2.findById(cod));
				System.out.println(crud2);
				break;
			case 3:
				crud2.imprimirTodosLosProductos();
				break;
			case 4:
				System.out.println("Indique el código a modificar");
				crud2.imprimirSoloActivos();
				codigo=Leer.dato();
				System.out.println("Indique nuevo precio");
				precioNuevo=Leer.datoDouble();
				crud2.editPrecio(codigo, precioNuevo);
				break;
			case 5:
				System.out.println("Diga el código del prodcuto");
				codigo = Leer.dato();
				//IMPORTANTE ERROR COMÚN no poner dos veces find by id
				crud2.delete(crud2.findById(codigo));
				break;
			case 6:
				crud2.imprimirSoloActivos();
				break;
			default:
				System.out.println("NÚMERO DESCONOCIDO");
				break;
			}
		}while(opcion !=0);
		System.out.println("Gracias por usar el programa.");
	}

}
