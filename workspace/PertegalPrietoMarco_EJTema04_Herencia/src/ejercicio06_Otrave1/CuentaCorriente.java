package ejercicio06_Otrave1;

public class CuentaCorriente extends Cuenta{
	private double mantenimiento;
	private int puntos;

	public CuentaCorriente(double saldo, int numCuenta, Cliente c, double mantenimiento, int puntos) {
		super(saldo, numCuenta, c);
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
		return super.toString()+"CuentaCorriente [mantenimiento=" + mantenimiento + ", puntos=" + puntos + "]";
	}

	public void ingresarSaldo(double cantIngreso) {
		super.setSaldo((getSaldo()+cantIngreso)-mantenimiento);
		puntos++;
	}

	public void retirarSaldo(double cantRetiro) {
		if (super.getSaldo() < cantRetiro) {
			System.out.println("Saldo negativo");
		}else {
			super.setSaldo((getSaldo()-cantRetiro)-mantenimiento);
			puntos++;
		}
		
	}
}
