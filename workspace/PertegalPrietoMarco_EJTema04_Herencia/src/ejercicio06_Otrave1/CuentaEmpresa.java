package ejercicio06_Otrave1;

public class CuentaEmpresa extends Cuenta{
	private int comision;

	public CuentaEmpresa(double saldo, int numCuenta, Cliente c, int comision) {
		super(saldo, numCuenta, c);
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
		return super.toString()+"CuentaEmpresa [comision=" + comision + "]";
	}
	//

	@Override
	public void ingresarSaldo(double cantIngreso) {
		super.setSaldo(getSaldo()+cantIngreso);
		
	}

	@Override
	public void retirarSaldo(double cantRetiro) {
		if (super.getSaldo()< cantRetiro) {
			System.out.println("Saldo negativo");
		}else {
			super.setSaldo((getSaldo()-cantRetiro)-comision);
		}
	}

	
	public void imprimirEmpresa() {
		System.out.println("soy una empresa");
	}
	public void comprobarDineroCuentaEmpresa(double cant) {
		if (super.getSaldo() >= cant) {
			System.out.println("Tienes más dinero de el que has puesto.");
		}else {
			System.out.println("Estas pelao.");
		}
	}
	
}
