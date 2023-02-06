package ejercicio05;

public class Gerente extends Empleado {
	private double porcentImp;

	public Gerente(String nombre, String apellido, double sueldoBase, int numEmpleado, double porcentImp) {
		super(nombre, apellido, sueldoBase, numEmpleado);
		this.porcentImp = porcentImp;
	}

	public double getPorcentImp() {
		return porcentImp;
	}

	public void setPorcentImp(double porcentImp) {
		this.porcentImp = porcentImp;
	}

	@Override
	public String toString() {
		return super.toString()+"Gerente [porcentImp=" + porcentImp + "]";
	}
	
	public double calcularSueldo() {
		return super.calcularSueldo()-(super.calcularSueldo()*porcentImp)/100;
	}
	
}
