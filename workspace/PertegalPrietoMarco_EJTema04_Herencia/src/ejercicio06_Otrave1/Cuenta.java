package ejercicio06_Otrave1;

public abstract class Cuenta {
	private double saldo;
	private int numCuenta;
	private Cliente c;
	
	//Para hacer la interfaz hacer algo relacionado con acciones, IInversiones con un metodo comprar acciones , y 
	//ese metodo trendria que estar rrescrito en cuenta 
	
	public Cuenta(double saldo, int numCuenta, Cliente c) {
		super();
		this.saldo = saldo;
		this.numCuenta = numCuenta;
		this.c = c;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	public Cliente getC() {
		return c;
	}
	public void setC(Cliente c) {
		this.c = c;
	}
	
	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", numCuenta=" + numCuenta + ", c=" + c + "]";
	}
	public abstract void ingresarSaldo(double cantIngreso);
	public abstract void retirarSaldo(double cantRetiro);
}
