package ejercicio06_Otrave1;

public class Cliente {
	private String nombre;
	private String dni;
	private int edad;
	
	public Cliente(String nombre, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
	}
}
