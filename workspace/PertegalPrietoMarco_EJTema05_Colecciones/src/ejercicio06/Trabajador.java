package ejercicio06;

public class Trabajador {
	private String nombre;
	private String dni;
	private double horas;
	private double sueldo;
	
	public Trabajador(String nombre, String dni, double horas, double sueldo) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.horas = horas;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", horas=" + horas + ", sueldo=" + sueldo + "]";
	}
	//
	
	
}
