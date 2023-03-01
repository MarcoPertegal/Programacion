package ejercicio05;

public class Persona implements Comparable <Persona>{
	private String nombre;
	private String dni;
	private int edad;
	private double altura;
	
	public Persona(String nombre, String dni, int edad, double altura) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.altura = altura;
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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", altura=" + altura + "]";
	}

	@Override
	public int compareTo(Persona p) { //como al metodo compareTo solo se le puede pasar un parametro usando el this. 
		return (this.nombre.toLowerCase().compareTo(p.getNombre().toLowerCase()));
	}

	
	
	
	
}
