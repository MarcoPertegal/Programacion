package ejercicio06;

import java.util.Arrays;

public class Oficina implements IInversiones{
	private Cuenta [] lista;
	private int gastosCuentaEmpresa;
	private int beneficioCuentaJoven;
	
	public Oficina(Cuenta[] lista, int gastosCuentaEmpresa, int beneficioCuentaJoven) {
		super();
		this.lista = lista;
		this.gastosCuentaEmpresa = gastosCuentaEmpresa;
		this.beneficioCuentaJoven = beneficioCuentaJoven;
	}
	public Oficina(Cuenta[] lista) {
		super();
		this.lista = lista;
	}

	public Cuenta[] getLista() {
		return lista;
	}

	public void setLista(Cuenta[] lista) {
		this.lista = lista;
	}

	public int getGastosCuentaEmpresa() {
		return gastosCuentaEmpresa;
	}

	public void setGastosCuentaEmpresa(int gastosCuentaEmpresa) {
		this.gastosCuentaEmpresa = gastosCuentaEmpresa;
	}

	public int getBeneficioCuentaJoven() {
		return beneficioCuentaJoven;
	}

	public void setBeneficioCuentaJoven(int beneficioCuentaJoven) {
		this.beneficioCuentaJoven = beneficioCuentaJoven;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + ", gastosCuentaEmpresa=" + gastosCuentaEmpresa
				+ ", beneficioCuentaJoven=" + beneficioCuentaJoven + "]";
	}

	//Improtanrte comorobarlos nulos
	//calcular el saldo de uno psandole un objeto,pero para poder calcular el de todos haria falta un get saldo y ya, ddentro de un for hacer un find, pero
	//
	public void imprimirDatos() {//METODO DE PRUEBA
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof CuentaEmpresa) {
				((CuentaEmpresa)lista[i]).imprimirEmpresa();
			}
			System.out.println(lista[i]);
		}
	}
	
	public double calcularSaldoTotal() {
		double total=0.0;
		for (int i = 0; i < lista.length; i++) {
			total += lista[i].getSaldo(); //sin el lista[i] get saldo obviamente seria imposible hacer el getSaldo
		} 
		return total;
	}
	
	public double calcularSaldoDeUnaCuenta(Cuenta c) {
		return c.getSaldo();
	}
	
	public Cuenta findById(int buscNumCuenta) {
		int i= 0;
		boolean encontrado = false;
		
		while (i < lista.length && !encontrado) {
			Cuenta deLista = lista[i];
			if(deLista.getNumCuenta() == buscNumCuenta)
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return lista[i];
		else
			return null;
	}
	public void ingresarDineroEnUnaCuenta(Cuenta c, double cantIngreso) {
		if (c != null) {
			c.ingresarSaldo(cantIngreso);
			if (c instanceof CuentaJoven) 
				beneficioCuentaJoven++;
		}
		
	}
	public void retirarDineroDeUnaCuenta(Cuenta c, double cantRetiro) {
		c.retirarSaldo(cantRetiro);
		if (c instanceof CuentaEmpresa) {
			gastosCuentaEmpresa++;
		}
	}
	@Override
	public void comprarAcciones(Cuenta c, int cantAcciones) {
		double preAccion = 100;
		c.setSaldo(c.getSaldo()-(cantAcciones*preAccion));
		
	}
	public void mostrarTodo() {

		for (Cuenta c : lista) {
			System.out.println("--------------------------------");
			System.out.printf("Saldo: %.2f", c.getSaldo());
			System.out.printf("Número Cuenta: %.d", c.getNumCuenta());
			System.out.printf("Edad: %.s", c.getC().getEdad());
			System.out.printf("Dni: %.s", c.getC().getDni());
		}
	}
	
	
}
