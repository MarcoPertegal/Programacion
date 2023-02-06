package ejercicio05;

public class Empleado {
	private String nombre;
	private String apellido;
	private double sueldoBase;
	private int numEmpleado;
	
	public Empleado(String nombre, String apellido, double sueldoBase, int numEmpleado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldoBase = sueldoBase;
		this.numEmpleado = numEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", sueldoBase=" + sueldoBase + ", numEmpleado="
				+ numEmpleado + "]";
	}
	
	public double calcularSueldo() {//se pone esto porque sino da error, y dice que en array se tiene que guardar un empleado
		return sueldoBase;
	}
	
}
