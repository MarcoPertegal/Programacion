package ejemploRelacionClases;

public class Cliente {
	private String nombre;
	private int edad;
	
	
	public Cliente(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	//Metodos
	public float comprobarClienteSenior(int topeEdad) {//ver si el cliente tiene pension o no
		float pension=500;
		if (edad >= topeEdad) {
			return pension;
		}else {
			return 0;
		}
	}
}
