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
	
	public double calcularSueldo() {//si no lo pongo no puedo usar el metodo en la clase oficina pero no lo puedo poner 
									//vacio pq la clase no puede ser abstracta y si nolo pongo me da error en oficina
		return sueldoBase;
	}
	
}
