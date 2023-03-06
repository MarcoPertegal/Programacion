package ejercicio08Ej06Tema04;

public class CuentaEmpresa extends Cuenta {
	private double comision;

	public CuentaEmpresa(double saldo, int numCuenta, Cliente c, double comision) {
		super(saldo, numCuenta, c);
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return "CuentaEmpresa [comision=" + comision + "]";
	}
	
	public void ingresarSaldo(double cantIngreso) {
		super.setSaldo(super.getSaldo()+cantIngreso);
	}
	
	public void retirarSaldo(double cantRetiro) {
		if (super.getSaldo() < cantRetiro) {
			System.out.println("La cantidad que intenta extraer es mayor que el saldo de su cuenta.");
		}else {
			super.setSaldo(super.getSaldo()-cantRetiro-comision);
		}
	}
	
}
