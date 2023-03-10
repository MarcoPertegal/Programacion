package ejercicio09Ej06Tema04ConArrayList;

import java.util.Iterator;
import java.util.List;

public class Oficina {
	private List <Cuenta> listaCuentas;
	private double beneficioCuentaJoven;
	private double gastoCuentaEmpresa;
	
	public Oficina(List<Cuenta> listaCuentas) {
		super();
		this.listaCuentas = listaCuentas;
	}
	
	public List<Cuenta> getListaCuentas() {
		return listaCuentas;
	}

	public void setListaCuentas(List<Cuenta> listaCuentas) {
		this.listaCuentas = listaCuentas;
	}

	public double getBeneficioCuentaJoven() {
		return beneficioCuentaJoven;
	}

	public void setBeneficioCuentaJoven(double beneficioCuentaJoven) {
		this.beneficioCuentaJoven = beneficioCuentaJoven;
	}

	public double getGastoCuentaEmpresa() {
		return gastoCuentaEmpresa;
	}

	public void setGastoCuentaEmpresa(double gastoCuentaEmpresa) {
		this.gastoCuentaEmpresa = gastoCuentaEmpresa;
	}
	
	@Override
	public String toString() {
		return "Oficina [listaCuentas=" + listaCuentas + ", beneficioCuentaJoven=" + beneficioCuentaJoven
				+ ", gastoCuentaEmpresa=" + gastoCuentaEmpresa + "]";
	}



	//CRUD, create, remove, edit, mostrar, buscar uno
	public void mostrarTodo() {
		for (Cuenta c : listaCuentas) {
			
			if (c instanceof CuentaJoven) {
				System.out.println("Cuenta Joven:");
			}
			if (c instanceof CuentaEmpresa) {
				System.out.println("Cuenta Empresa");
			}
			System.out.printf("Saldo: %.2f", c.getSaldo());
			System.out.printf("NumCuenta: %d", c.getNumCuenta());
			System.out.println("Nombre:"+c.getC().getNombre());
			System.out.println("Dni: "+c.getC().getDni());
			System.out.println("Edad: "+c.getC().getEdad());
		}
	}
	
	//dos metodos find diferentes uno normal y otro con iterator
	public Cuenta findByNumCuenta(int buscNumCuenta) {
		for (Cuenta c : listaCuentas) {
			if (c.getNumCuenta() == buscNumCuenta) {
				return c;
			}
		}
		return null;
	}
	public Cuenta findByNumCuentaV2(int buscNumCuenta) {
		Iterator <Cuenta> it = listaCuentas.iterator();
		while (it.hasNext()) {
			if (it.next().getNumCuenta() == buscNumCuenta) {
				return it.next();
			}
		}
		return null;
	}
	////////////////////
	
	public void agregar(Cuenta c) {
		listaCuentas.add(c);
	}
	
	public void eliminar(Cuenta c) {
		listaCuentas.remove(c);
	}
	
	public void editarNombre(Cuenta c, String nuevoNombre) {
		c.getC().setNombre(nuevoNombre);
	}
	
	/////////////////////////////
	
	public void ingresarSaldoEnUnaCuenta(Cuenta c, double cantIngreso) {
		if (c != null) {
			c.ingresarSaldo(cantIngreso);
			if (c instanceof CuentaJoven) {
				beneficioCuentaJoven++;
			}
		}
	}
	
	public void retirarSaldoDeUnaCuenta(Cuenta c, double cantRetiro) {
		if (c != null) {
			c.retirarSaldo(cantRetiro);
			if (c instanceof CuentaEmpresa) {
				gastoCuentaEmpresa++;
			}
		}
	}
	
	public double calcularTotal() {
		double total=0;
		for (Cuenta c : listaCuentas) {
			total += c.getSaldo();
		}
		return total;
	}
	
}
