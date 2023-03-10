package ejercicio09Ej06Tema04ConArrayList;

public class CuentaJoven extends Cuenta{
	private double extra;

	public CuentaJoven(double saldo, int numCuenta, Cliente c, double extra) {
		super(saldo, numCuenta, c);
		this.extra = extra;
	}

	public double getExtra() {
		return extra;
	}

	public void setExtra(double extra) {
		this.extra = extra;
	}

	@Override
	public String toString() {
		return super.toString()+"CuentaJoven [extra=" + extra + "]";
	}
	
	public void retirarSaldo(double cantRetiro) {
		super.setSaldo(super.getSaldo()-cantRetiro);
	}
	
	public void ingresarSaldo(double cantIngreso) {
		super.setSaldo(super.getSaldo()+cantIngreso+extra);
	}
	
}
