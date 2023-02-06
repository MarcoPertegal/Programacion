package ejercicio06;

public class Cliente {
	private String nombre;
	private double saldo;
	private int edad;
	private boolean activo;
	
	
	public Cliente(String nombre, double saldo, int edad, boolean activo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.edad = edad;
		this.activo = activo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", saldo=" + saldo + ", edad=" + edad + ", activo=" + activo + "]";
	}
	
	//Metodos
	
	
}
