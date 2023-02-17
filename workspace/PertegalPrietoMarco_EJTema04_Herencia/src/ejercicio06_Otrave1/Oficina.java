package ejercicio06_Otrave1;

import java.util.Arrays;

public class Oficina implements IEstadisticas, IInversiones{
	private Cuenta [] lista;
	private int gananciasCuentaJoven;
	private int comisionesCuentaEmpresa;
	
	public Oficina(Cuenta[] lista, int gananciasCuentaJoven, int comisionesCuentaEmpresa) {
		super();
		this.lista = lista;
		this.gananciasCuentaJoven = gananciasCuentaJoven;
		this.comisionesCuentaEmpresa = comisionesCuentaEmpresa;
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

	public int getGananciasCuentaJoven() {
		return gananciasCuentaJoven;
	}

	public void setGananciasCuentaJoven(int gananciasCuentaJoven) {
		this.gananciasCuentaJoven = gananciasCuentaJoven;
	}

	public int getComisionesCuentaEmpresa() {
		return comisionesCuentaEmpresa;
	}

	public void setComisionesCuentaEmpresa(int comisionesCuentaEmpresa) {
		this.comisionesCuentaEmpresa = comisionesCuentaEmpresa;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + ", gananciasCuentaJoven=" + gananciasCuentaJoven
				+ ", comisionesCuentaEmpresa=" + comisionesCuentaEmpresa + "]";
	}

	//Improtanrte comorobarlos nulos
	//calcular el saldo de uno psandole un objeto,pero para poder calcular el de todos haria falta un get saldo y ya, ddentro de un for hacer un find, pero
	//
	public void imprimirDatos() {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof CuentaEmpresa) {
				((CuentaEmpresa)lista[i]).imprimirEmpresa();
			}
			System.out.println(lista[i]);
		}
	}
	public void retirarDineroDeUnaCuenta(Cuenta c, double cantRetiro) {
		if (c == null) {
			System.out.println("No se ha encontrado la cuenta.");
		}else {
			c.retirarSaldo(cantRetiro);
			if (c instanceof CuentaEmpresa) {
				comisionesCuentaEmpresa++;
			}
		}
	}
	
	public void ingresarDineroEnUnaCuenta(Cuenta c, double cantIngreso) {
		if (c == null) {
			System.out.println("No se ha encontrado la cuenta.");
		}else {
			c.ingresarSaldo(cantIngreso);
			if (c instanceof CuentaJoven) {
				gananciasCuentaJoven++;
			}
		}
		
	}
	
	public Cuenta findById(int buscNumCuenta) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < lista.length && !encontrado) {
			Cuenta deLista = lista[i];
			if (deLista.getNumCuenta() == buscNumCuenta) {
				encontrado = true;
			}else {
				i++;
			}
		}
		if (encontrado) {
			return lista[i];
		}else {
			return null;
		}
	}

	public double calcularSaldoTotal() {
		double total=0.0;
		for (int i = 0; i < lista.length && lista[i] !=null; i++) {
			total += lista[i].getSaldo();
		}
		return total;
	}
	public double consultarSaldoDeUnaCuenta(Cuenta c) {
		return c.getSaldo();
	}
	
	public void comprarAcciones(Cuenta c, int numAcciones) {
		double preAcciones=100;
		if ((numAcciones*preAcciones)> c.getSaldo()) {
			System.out.println("No tienes el suficiente dinero en tu cuenta.");
		}else {
			c.setSaldo(c.getSaldo()-(numAcciones*preAcciones));
			System.out.println("Compra realizada con exito.");
		}
		
	}
	
	public void imprimirComprobarDineroCuentaEmpresa(double cant) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof CuentaEmpresa) {
				((CuentaEmpresa)lista[i]).comprobarDineroCuentaEmpresa(cant);
			}
		}
		
	}
	@Override
	public Cuenta[] buscSaldoMayorQue(double tope) {
		Cuenta [] aux = new Cuenta[lista.length];
		for (int i = 0; i < lista.length && lista[i] !=null; i++) {
			if (lista[i].getSaldo() > tope) {
				aux[i] = lista[i];
			}
		}
		return aux;//devuelve el array auxiliar entero
	}

}
