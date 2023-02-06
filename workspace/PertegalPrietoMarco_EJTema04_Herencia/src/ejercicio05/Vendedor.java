package ejercicio05;

public class Vendedor extends Empleado{
	private int cantVentas;//dinero de la venta con cantidad de cosas vendidas seria doble
	private double incentivo;
	
	public Vendedor(String nombre, String apellido, double sueldoBase, int numEmpleado, int cantVentas,
			double incentivo) {
		super(nombre, apellido, sueldoBase, numEmpleado);
		this.cantVentas = cantVentas;
		this.incentivo = incentivo;
	}

	public int getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public String toString() {
		return super.toString()+"Vendedor [cantVentas=" + cantVentas + ", incentivo=" + incentivo + "]";
	}
	
	//metodos mios
	public double calcularSueldo() {
		return super.calcularSueldo()+((cantVentas*incentivo)/100);
	}
	
	public void comprobarIncentivo(int objVentas) {
		if (cantVentas > objVentas) {
			System.out.println("Enhorabuena has alcanzado el objetivo de ventas.");
		}else {
			System.out.println("No has alzanzado tu objetivo de ventas.");
		}
	}
}
