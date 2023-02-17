package ejercicio02;

import java.util.Iterator;

public class GestionClub {
 //aunque se podrían agregar funcionalidades como alquilar pistas, pagar cuotas
	
	private CrudSocio crudS;
	private String nombre;
	private double saldo;
	
	public GestionClub(CrudSocio crudS, String nombre, double saldo) {
		super();
		this.crudS = crudS;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public CrudSocio getCrudS() {
		return crudS;
	}

	public void setCrudS(CrudSocio crudS) {
		this.crudS = crudS;
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

	@Override
	public String toString() {
		return "GestionClub [crudS=" + crudS + ", nombre=" + nombre + ", saldo=" + saldo + "]";
	}
	
	public double totalEdad() {
		Iterator <Socio> it = crudS.getListaSocios().iterator();
		double totalEdad = 0;
		while (it.hasNext()) {
			totalEdad += it.next().getEdad();
		}
		return totalEdad;
	}
	
	
}
