package ejercicio06;

public class CuentaEmpresa extends Cuenta{
	private int comision;

	public CuentaEmpresa(double saldo, String nombre, int numCuenta, int comision) {
		super(saldo, nombre, numCuenta);
		this.comision = comision;
	}

	public int getComision() {
		return comision;
	}

	public void setComision(int comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return "CuentaEmpresa [comision=" + comision + "]";
	}

	@Override
	public void ingresarSaldo(double cantIngreso) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retirarSaldo(double cantRetiro) {
		// TODO Auto-generated method stub
		
	}

	//
	public void imprimirEmpresa() {
		System.out.println("soy una empresa");
	}
	
	
}
