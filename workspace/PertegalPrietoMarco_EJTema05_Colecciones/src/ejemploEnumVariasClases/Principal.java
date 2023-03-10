package ejemploEnumVariasClases;

public class Principal {
	
	public static void main(String[] args) {
		
	
	Futbolista casillas = new Futbolista ("Casillas", 1, Posicion.PORTERO, Equipo.MADRID);
	Futbolista iniesta = new Futbolista ("Andres Iniesta", 8, Posicion.CENTROCAMPISTA, Equipo.BARCELONA);
	Futbolista villa = new Futbolista ("David Villa", 7, Posicion.DELANTERO, Equipo.BARCELONA);
	
	
	System.out.println(casillas.toString());
	
	
	}
}
