package ejercicio06;

public abstract class Cuenta {
	private double saldo;
	private String nombre;
	private int numCuenta;
	
	//Para hacer la interfaz hacer algo relacionado con acciones, IInversiones con un metodo comprar acciones , y 
	//ese metodo trendria que estar rrescrito en cuenta 
	public Cuenta(double saldo, String nombre, int numCuenta) {
		super();
		this.saldo = saldo;
		this.nombre = nombre;
		this.numCuenta = numCuenta;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", nombre=" + nombre + ", numCuenta=" + numCuenta + "]";
	}

	//
	public abstract void ingresarSaldo(double cantIngreso);
	
	

	public abstract void retirarSaldo(double cantRetiro);
}
