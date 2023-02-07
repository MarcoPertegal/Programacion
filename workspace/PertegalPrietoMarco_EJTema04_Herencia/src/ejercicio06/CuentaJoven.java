package ejercicio06;

public class CuentaJoven extends Cuenta{
	private int extra;

	public CuentaJoven(double saldo, String nombre, int numCuenta, int extra) {
		super(saldo, nombre, numCuenta);
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
		return "CuentaJoven [extra=" + extra + "]";
	}

	@Override
	public void ingresarSaldo(double cantIngreso) {
		super.setSaldo(getSaldo() + cantIngreso);
	}

	@Override
	public void retirarSaldo(double cantRetiro) {
		// TODO Auto-generated method stub
		
	}
		
}
