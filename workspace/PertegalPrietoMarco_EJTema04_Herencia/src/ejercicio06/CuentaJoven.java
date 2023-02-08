package ejercicio06;

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
	
	//
	public void ingresarSaldo(double cantIngreso) {
		super.setSaldo((getSaldo() + cantIngreso)+1);
	}
	
	public void retirarSaldo(double cantRetiro) {
		if (super.getSaldo() < cantRetiro) 
			System.out.println("La cantidad que intenta extraer es mayor que el saldo de su cuenta.");
		else 
			super.setSaldo(getSaldo()-cantRetiro);
	}
		
}
