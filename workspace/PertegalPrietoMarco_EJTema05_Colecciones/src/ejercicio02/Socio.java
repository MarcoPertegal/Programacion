package ejercicio02;

public class Socio {
	private String nombre;
	private String apellidos;
	private int edad;
	private int numSocio;
	
	public Socio(String nombre, String apellidos, int edad, int numSocio) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.numSocio = numSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumSocio() {
		return numSocio;
	}

	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", numSocio=" + numSocio
				+ "]";
	}
	
	public void mostrarUnSocio(Socio s) {
		System.out.println("- Número de socio: "+getNumSocio());
		System.out.println("- Nombre: "+getNombre());
		System.out.println("- Apellidos: "+getApellidos());
		System.out.println("- Edad: "+getEdad());
	}
	
	
	
}
