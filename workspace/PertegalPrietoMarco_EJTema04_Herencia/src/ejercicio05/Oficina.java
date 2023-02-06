package ejercicio05;

import java.util.Arrays;

import ejercicio04.Alimentacion;

public class Oficina {
	private Empleado [] lista;

	public Oficina(Empleado[] lista) {
		super();
		this.lista = lista;
	}

	public Empleado[] getLista() {
		return lista;
	}

	public void setLista(Empleado[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + "]";
	}
	
	public double calcularSueldoDeUnEmpleado(Empleado p) {//No se pueden llamar metodos iguales que los que estan reescritos fuera de la jerarquia de clases
		if (p == null) {//el null esta puesto por si en el metodo buscar no encuentra nada
			return 0;
		}else {
			return p.calcularSueldo();
		}
	}
	
	public double calcularGasto() {
		double gasto = 0.0;
		for (int i = 0; i < lista.length; i++) {
			gasto += calcularSueldoDeUnEmpleado(lista[i]);
		}
		return gasto;
	}

	public Empleado findById(int buscNumEmpleado) {
		int i=0;
		boolean encontrado = false;
		
		while (i < lista.length && !encontrado) {
			Empleado deLista = lista[i];
			if (deLista.getNumEmpleado() == buscNumEmpleado) 
				encontrado = true;
			else 
				i++;
			}
		if (encontrado) 
			return lista[i];
		else
			return null;
	}
	public void imprimirFelicitaciones(int objVentas) {
		Vendedor aux;
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			if (lista[i] instanceof Vendedor) {
				aux = (Vendedor)lista[i];
				aux.comprobarIncentivo(objVentas);
			}
		}
	}
	
}
