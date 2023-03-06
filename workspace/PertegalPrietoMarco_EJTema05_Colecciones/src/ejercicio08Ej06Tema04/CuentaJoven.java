package ejercicio08Ej06Tema04;

public class CuentaJoven extends Cuenta {
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
		return "CuentaJoven [extra=" + extra + "]";
	}
	
	public void ingresarSaldo(double cantIngreso) {//acordarse de que el saldo se hereda
		super.setSaldo(super.getSaldo()+cantIngreso+extra);
	}
	
	public void retirarSaldo(double cantRetiro) {
		if (super.getSaldo() < cantRetiro) 
			System.out.println("La cantidad que intenta extraer es mayor que el saldo de su cuenta.");
		else 
			super.setSaldo(super.getSaldo()-cantRetiro);
	}
}
