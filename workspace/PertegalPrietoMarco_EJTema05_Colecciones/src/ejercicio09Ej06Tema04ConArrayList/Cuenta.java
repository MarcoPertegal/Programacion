package ejercicio09Ej06Tema04ConArrayList;

public class Cuenta implements Comparable <Cuenta>{
	private double saldo;
	private int numCuenta;
	private Cliente c;
	
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
	
	public void ingresarSaldo(double cantIngreso) {//importante acordarme de pasarle los mismos parametros que en las hijas

	}
	
	public void retirarSaldo(double cantRetiro) {

	}
	@Override
	public int compareTo(Cuenta c) {
		if (this.saldo < c.getSaldo()) {
			return -1;
		}else {
			if (this.saldo > c.getSaldo()) {
				return 0;
			}
		}
		return 0;
	}
	
	
}
