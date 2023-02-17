package ejemploSet;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		//Hash set apenas las vamos a usar array list y hashmap
		Set <Alumno> listaAlumnos = new HashSet <Alumno>(); 
		
		Alumno a = new Alumno("Ángel", 46, 4.6);
		listaAlumnos.add(a);
		//lista 12 y 13 es lo mismo que hago yo pero de meter a casca porra pero en dos lineas
		System.out.println(listaAlumnos);
		
		listaAlumnos.add(new Alumno("Pepe", 34, 8.4));
		//esta forma es lo mismo que lo de arriba pero todo en la misma linea
		
		//Para ver que metodos tiene set investigamos el api de java:
		
		//No hay metodos en el API de java para buscar los vamos a tener que crear nosotros por los criterios que tengan los objetos que guardamos 
		
		

	}

}
