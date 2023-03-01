package ejercicio03;

import java.util.Objects;

public class Alumno {
	private double nota;
	private String nombre;
	private String apellidos;
	private int edad;
	private String dni;
	
	public Alumno(double nota, String nombre, String apellidos, int edad, String dni) {
		super();
		this.nota = nota;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "Alumno [nota=" + nota + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", dni="
				+ dni + "]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, dni, edad, nombre, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(dni, other.dni) && edad == other.edad
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}

	
	
	
	
}
