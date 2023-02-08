package ejercicio06;

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

	public void ingresarSaldo(double cantIngreso) {
		super.setSaldo(getSaldo() + cantIngreso);
	}

	public void retirarSaldo(double cantRetiro) {
		if (super.getSaldo() < cantRetiro) {
			System.out.println("La cantidad que intenta extraer es mayor que el saldo de su cuenta.");
		}else {
			super.setSaldo((getSaldo()-cantRetiro)-comision);
		}
	}

	public void imprimirEmpresa() {
		System.out.println("soy una empresa");
	}
	
	public void comprobarDineroCuentaEmpresa() {
		double cantidad= 100;
		if (super.getSaldo() >= cantidad) {
			System.out.println("Tienes más dinero de el que has puesto.");
		}else {
			System.out.println("Estas pelao.");
		}
	}
}
