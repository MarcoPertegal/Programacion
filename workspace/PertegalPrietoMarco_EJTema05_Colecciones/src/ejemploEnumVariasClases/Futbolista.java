package ejemploEnumVariasClases;

public class Futbolista {
	//los atributos pasan de ser tipos que conocemos hasta ahora para pasar a ser tipo enum
	private String nombre;
	private int dorsal;
	private Posicion posicion;
	private Equipo equipo;
	
	public Futbolista(String nombre, int dorsal, Posicion posicion, Equipo equipo) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.posicion = posicion;
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Futbolista [nombre=" + nombre + ", dorsal=" + dorsal + ", posicion=" + posicion + ", equipo=" + equipo
				+ "]";
	}
	
	
	
	
	
}
