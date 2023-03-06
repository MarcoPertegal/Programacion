package ejercicio08Ej06Tema04;

import java.util.Objects;

public class Cuenta {
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
	@Override
	public int hashCode() {
		return Objects.hash(c, numCuenta, saldo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return Objects.equals(c, other.c) && numCuenta == other.numCuenta
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo);
	}
	
	/////////////
	//Lo suyo es que al no ser abstracta los metodos ingresar saldo y retirar saldo hagan algo pero no puedo porque no medeja setearlo en las hijas
	//si lo pongo double no puedo setear y si lo dejo void y pongo algo dentro me da error al setear porque no devuelven nada
	public void ingresarSaldo(double cantIngreso) {//importante acordarme de pasarle los mismos parametros que en las hijas

	}
	
	public void retirarSaldo(double cantRetiro) {

	}
}
