package ejercicio03;

public class Alumno {
	private double nota;
	private String nombre;
	private String modalidad;
	private int edad;
	private int id;
	
	public Alumno(double nota, String nombre, String modalidad, int edad, int id) {
		super();
		this.nota = nota;
		this.nombre = nombre;
		this.modalidad = modalidad;
		this.edad = edad;
		this.id = id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Alumno [nota=" + nota + ", nombre=" + nombre + ", modalidad=" + modalidad + ", edad=" + edad + ", id="
				+ id + "]";
	}
	
	public void mostrarUnAlumno() {
		System.out.println("- Id: "+getId());
		System.out.println("- Nombre: "+getNombre());
		System.out.println("- Modalidad: "+getModalidad());
		System.out.println("- Edad: "+getEdad());
		System.out.println("- Nota: "+getNota());
	}
	
	
	
}
