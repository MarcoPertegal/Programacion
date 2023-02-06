package ejercicio06;

public class CuentaCorriente extends Cliente{
	private double mantenimiento;
	private int puntos;
	
	public CuentaCorriente(String nombre, double saldo, int edad, boolean activo, double mantenimiento, int puntos) {
		super(nombre, saldo, edad, activo);
		this.mantenimiento = mantenimiento;
		this.puntos = puntos;
	}

	public double getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(double mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [mantenimiento=" + mantenimiento + ", puntos=" + puntos + "]";
	}
	
	
}
