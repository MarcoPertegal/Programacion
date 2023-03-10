package ejercicio09Ej06Tema04ConArrayList;

public class CuentaEmpresa extends Cuenta{
	
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
		return super.toString()+"CuentaEmpresa [comision=" + comision + "]";
	}
	
	public void ingresarSaldo(double cantIngreso) {
		super.setSaldo(super.getSaldo()+cantIngreso);
	}	
	public void retirarSaldo(double cantRetiro) {
		super.setSaldo((super.getSaldo()-cantRetiro)-comision);
	}

}
