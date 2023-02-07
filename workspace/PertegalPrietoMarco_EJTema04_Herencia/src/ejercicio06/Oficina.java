package ejercicio06;

import java.util.Arrays;

public class Oficina {
	private Cuenta [] lista;

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

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + "]";
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
}
