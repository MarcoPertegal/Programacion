package ejemploEnumVariasClases;

import utilidades.Leer;

public class Principal {
	
	public static void main(String[] args) {
		
	//Me ha llamado Luis de la fuente y me ha dicho que necesita un programa con algunos futbolistas de la selección española he
	//información relevante sobre ellos, quiere saber la posición en la que juegan y el equipo donde juegan, así como algunos datos 
	//sobre el equipo, posicion en liga y vitorias de cada equipo, como las posiciones en el futbol son siempre las mismas portero,
	//defensa, centrocampista, delantero y laterales(generalizando) es un buen caso para usar una clase enum, así como con los equipos de
	//la liga 
	int tope;
		
	Futbolista unai = new Futbolista ("Unai Simón", 23, Posicion.PORTERO, Equipo.ATHLETIC);
	Futbolista morata = new Futbolista ("Morata", 7, Posicion.DELANTERO, Equipo.ATMADRID);
	Futbolista carvajal = new Futbolista ("Carvajal", 20, Posicion.LATERAL, Equipo.RMADRID);
	Futbolista ferran = new Futbolista ("Ferran Torres", 11,Posicion.DELANTERO, Equipo.BARCELONA);
	Futbolista gavi = new Futbolista ("Pablo Gavira", 9,Posicion.CENTROCAMPISTA, Equipo.BARCELONA);
	
	System.out.println("///////////");
	System.out.println("BIENVENIDO");
	System.out.println("///////////");
	System.out.println();
	do {
		System.out.println();
		System.out.println("¿Que desea mostrar?");
		System.out.println("--------------------------------------------------");
		System.out.println("0. Salir.");
		System.out.println("1. Mostrar todos los jugadores.");
		System.out.println("2. Mostrar el equipo.");
		System.out.println("3. Mostrar la posición en la que se ha declarado.");
		System.out.println("4. Comparar las posiciones de declaración.");
		System.out.println("5. Ver todos los equipos.");
		System.out.println("6. Comparar equipos.");
		System.out.println("---------------------------------------------------");
		tope=Leer.datoInt();
		System.out.println();
		switch (tope) {
		case 0:
			System.out.println("Saliendo.");
			break;
		case 1:
			System.out.println(unai); 
			System.out.println(morata);
			System.out.println(carvajal);
			System.out.println(ferran);
			
			break;
		case 2:
			System.out.println("El equipo de "+unai.getNombre()+ " es: "+unai.getEquipo().name());
			System.out.println("El equipo de "+carvajal.getNombre()+" es: "+carvajal.getEquipo().name());
			//el metodo .name devuelve el nombre dado al objeto enum
			break;
		case 3:
			System.out.println("La posicion de juego de "+carvajal.getNombre()+" se ha declarado: "+carvajal.getPosicion().ordinal());
			System.out.println("La posición de juego de "+ferran.getNombre()+" se ha declarado: "+ferran.getPosicion().ordinal());
			//Devuelve un entero con la posición en la que se ha declarado, en este caso su posicion de juego.
			break;
		case 4:
			System.out.println(carvajal.getEquipo().compareTo(morata.getEquipo()));
			// Compara el enum con el parámetro según el orden en el que están declaradas. siendo carvajal 1 y morata 2 por lo que 1 menos 2
			//da -1.
			break;
		case 5:
			for (Equipo e : unai.getEquipo().values()) {
				System.out.println(e);
			}
			break;
			//recorre todas las constantes de la enumeración
		case 6:
			System.out.println(ferran.getEquipo().equals(gavi.getEquipo())); 
			System.out.println(carvajal.getEquipo().equals(gavi.getEquipo())); 
			//devuelve verdadero si el objeto especificado es igual al de la constante
			break;
		default:
			System.out.println("Opción desconocida");
			break;
		}
	} while (tope != 0);
	System.out.println("Gracias por usar el programa.");
	
	
	}
}
