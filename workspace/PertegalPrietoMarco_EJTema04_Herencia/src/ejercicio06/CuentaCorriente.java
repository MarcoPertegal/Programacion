package ejercicio06;

public class CuentaCorriente extends Cuenta{
	private double mantenimiento;
	private int puntos;

	public CuentaCorriente(double saldo, String nombre, int numCuenta, double mantenimiento, int puntos) {
		super(saldo, nombre, numCuenta);
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

	@Override
	public void ingresarSaldo(double cantIngreso) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retirarSaldo(double cantRetiro) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}
