package ejercicio06_Otrave1;

public class CuentaJoven extends Cuenta{
	private int extra;

	public CuentaJoven(double saldo, int numCuenta, Cliente c, int extra) {
		super(saldo, numCuenta, c);
		this.extra = extra;
	}
	
	public int getExtra() {
		return extra;
	}

	public void setExtra(int extra) {
		this.extra = extra;
	}

	@Override
	public String toString() {
		return super.toString()+"CuentaJoven [extra=" + extra + "]";
	}

	@Override
	public void ingresarSaldo(double cantIngreso) {
		super.setSaldo((getSaldo() + cantIngreso)+extra);
	}

	@Override
	public void retirarSaldo(double cantRetiro) {
		if (super.getSaldo() < cantRetiro) {
			System.out.println("Saldo negativo");
		}else {
			super.setSaldo(getSaldo()-cantRetiro);
		}
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
