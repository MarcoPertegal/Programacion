package ejercicio08Ej06Tema04;

import java.util.Iterator;
import java.util.Map;

public class Oficina {
	private Map <Cuenta, Integer> listaCuenta;
	private double beneficioCuentaJoven;
	private double gastoCuentaEmpresa;
	
	public Oficina(Map<Cuenta, Integer> listaCuenta) {
		super();
		this.listaCuenta = listaCuenta;
	}

	public Map<Cuenta, Integer> getListaCuenta() {
		return listaCuenta;
	}

	public void setListaCuenta(Map<Cuenta, Integer> listaCuenta) {
		this.listaCuenta = listaCuenta;
	}

	public double getGastoCuentaJoven() {
		return beneficioCuentaJoven;
	}

	public void setGastoCuentaJoven(double gastoCuentaJoven) {
		this.beneficioCuentaJoven = gastoCuentaJoven;
	}

	public double getGastoCuentaEmpresa() {
		return gastoCuentaEmpresa;
	}

	public void setGastoCuentaEmpresa(double gastoCuentaEmpresa) {
		this.gastoCuentaEmpresa = gastoCuentaEmpresa;
	}

	@Override
	public String toString() {
		return "Oficina [listaCuenta=" + listaCuenta + ", gastoCuentaJoven=" + beneficioCuentaJoven
				+ ", gastoCuentaEmpresa=" + gastoCuentaEmpresa + "]";
	}
	
	//CRUD
	public void imprimirTodo() {
		for (Cuenta c : listaCuenta.keySet()) {
			
			if (c instanceof CuentaJoven) {
				System.out.println("CUENTA JOVEN:");
				System.out.printf("Beneficios por uso: %.2f \n", beneficioCuentaJoven);
				//((CuentaJoven)c).getExtra(); // esto no hace falta para este ejercicio pero tengo que repasarlo
			}
			if (c instanceof CuentaEmpresa) {
				System.out.println("CUENTA EMPRESA:");
				System.out.printf("Gasto en Comisiones: %.2f \n", gastoCuentaEmpresa);
			}
			System.out.printf("Saldo: %.2f \n",c.getSaldo());
			System.out.println("Num Cuenta: "+c.getNumCuenta());
			System.out.println("Nombre: "+c.getC().getNombre());
			System.out.println("Edad: "+c.getC().getEdad());
			System.out.println("Dni: "+c.getC().getDni());
		}
	}
	
	public Cuenta findByid(int buscId) {
		for (Cuenta c  : listaCuenta.keySet()) {
			if (c.getNumCuenta() == buscId) 
				return c;
		}
		return null;
	}
	
	public void editarEdadDeUnaCuenta(Cuenta c, int nuevaEdad) {
		if (c != null){ 
			c.getC().setEdad(nuevaEdad);
		}
	}
	public void add(Cuenta c) {
		listaCuenta.put(c, 1);
	}
	public void remove(Cuenta c) {
		listaCuenta.remove(c);
	}
	//y despues los demas metodos del ejefcico
	
	public void ingresarDineroEnUnaCuenta(Cuenta c, double cantIngreso) {
		if (c != null) {
			c.ingresarSaldo(cantIngreso);
			if (c instanceof CuentaJoven) 
				beneficioCuentaJoven++;
		}
	}
	
	public void retirarDineroDeUnaCuenta(Cuenta c, double cantRetiro) {
		if (c != null) {
			c.retirarSaldo(cantRetiro);
			if (c instanceof CuentaEmpresa) {
				gastoCuentaEmpresa++;
			}
		}
	}
	
	
	//el iterator
	public double calcularSaldoTotal() {
		double total=0;
		for (Cuenta c : listaCuenta.keySet()) {
			total += c.getSaldo();
		}
		return total;
	}
	
	public double calcularSaldoTotalV2() {
		double total=0;
		Iterator <Cuenta> it = listaCuenta.keySet().iterator();
		while (it.hasNext()) {
			total += it.next().getSaldo();
		}
		return total;
	}
	
}
