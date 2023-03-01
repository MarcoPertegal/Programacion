package ejercicio02;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int tope, edad, numSocio, buscNumSocio, nuevaEdad;
		String nombre, apellidos;
		
		List <Socio> listaSocios = new ArrayList <Socio>();
		
		CrudSocio crudS = new CrudSocio(listaSocios);//no termino de entender bien si esto está bien, y si está bien porque se hace así pasando dos veces lo mismo pq sino da error
		GestionClub gestionS = new GestionClub (crudS,"Padel", 2000);//en vez de pasarle la instancia de new crudSocio otravesz le paso la referencia de la clase
		
		listaSocios.add(new Socio("Antonio", "Pérez Moreno", 1, 245));//cambiar add por el metodo agregar o se puede dejar asi???
		listaSocios.add(new Socio("Felipe", "Gómez Gracía", 1, 246));
		listaSocios.add(new Socio("Juan", "Ballén Reyes", 1, 247));
		
		System.out.println("Bienvenido al Club de Campo");
		System.out.println("///////////////////////////");
		System.out.println("");
		
		do {
			System.out.println("");
			System.out.println("¿Qué desea hacer?");
			System.out.println("---------------------------");
			System.out.println("0. Salir");
			System.out.println("1. Guardar a un nuevo socio.");
			System.out.println("2. Buscar un socio.");
			System.out.println("3. Mostrar datos.");
			System.out.println("4. Modificar edad de un socio.");
			System.out.println("5. Eliminar un socio.");
			System.out.println("6. Sumar todas las edades.");
			System.out.println("7. Buscar el nombre de un socio.");
			System.out.println("---------------------------");
			System.out.println("");
			tope=Leer.datoInt();
			
			switch (tope) {
				case 0:
					System.out.println("Saliendo");
					break;
				case 1:
					System.out.println("- Introduzca sus datos:");
					System.out.println("Nombre:");
					nombre=Leer.dato();
					System.out.println("Apellidos:");
					apellidos=Leer.dato();
					System.out.println("Edad:");
					edad=Leer.datoInt();
					System.out.println("numSocio:");
					numSocio=Leer.datoInt();
					
					crudS.agregar(new Socio(nombre, apellidos, edad, numSocio));//EL ADD VA DENTRO DE ESTE METODO//Aqui no hace falta la llamada en cadena por que un metodo del propio array list igual qu8e con add pero abria que crearle un metodo
					break;
				case 2:
					System.out.println("Introduzca el número del socio:");
					buscNumSocio=Leer.datoInt();
					crudS.mostrarUnSocio(crudS.findByNum(buscNumSocio));
					break;
				case 3:
					System.out.println(listaSocios);
					break;
				case 4:
					System.out.println("Introduzca el número del socio que quiere editar su edad.");
					buscNumSocio=Leer.datoInt();
					System.out.println("Introduzca nueva edad:");
					nuevaEdad=Leer.datoInt();
					crudS.editar(crudS.findByNum(buscNumSocio), nuevaEdad);
					break;
				case 5:
					System.out.println("Introduzca el número del socio que quiere eliminar.");
					buscNumSocio=Leer.datoInt();
					crudS.eliminar(crudS.findByNum(buscNumSocio));
					break;
				case 6:
					System.out.println(gestionS.totalEdad()); 
					break;
				case 7:
					System.out.println("Diga el número del socio del que quiere motrar su nombre");
					buscNumSocio=Leer.datoInt();
					System.out.println(crudS.findByNum(buscNumSocio).getNombre());
					break;
				default:
					System.out.println("OPCIÓN DESCONOCIDA");
					break;
			}
		} while (tope != 0);
		System.out.println("GRAcias");
	}

}
