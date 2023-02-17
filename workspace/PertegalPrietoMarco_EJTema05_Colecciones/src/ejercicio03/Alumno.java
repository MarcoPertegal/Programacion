package ejercicio03;

public class Alumno {
	private double nota;
	private String nombre;
	private String modalidad;
	private int edad;
	
	public Alumno(double nota, String nombre, String modalidad, int edad) {
		super();
		this.nota = nota;
		this.nombre = nombre;
		this.modalidad = modalidad;
		this.edad = edad;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [nota=" + nota + ", nombre=" + nombre + ", modalidad=" + modalidad + ", edad=" + edad + "]";
	}
	
	
}
