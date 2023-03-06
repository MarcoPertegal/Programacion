package ejercicio06;

public class Trabajador implements Comparable <Trabajador>{
	private String nombre;
	private String dni;
	private double horas;
	private double sueldo;
	
	public Trabajador(String nombre, String dni, double horas) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.horas = horas;
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

	@Override
	public int compareTo(Trabajador t) {
		double horas1 = this.getHoras();
		double horas2 = t.getHoras();
		if (horas1 > horas2) {
			return 1;
		}else {
			if (horas1 < horas2) {
				return -1;
			}
		}
		return 0;
	}
	
	public void calcularSalario(double pagoHora) {
		sueldo = horas*pagoHora;
	}
	
	
}
