package primerEjemplo;

public class Consultor extends Trabajador {
	private int horas;
	private double tarifa;
	
	public Consultor(String nombre, String impuesto, int horas, double tarifa) {
		super(nombre, impuesto);
		this.horas = horas;
		this.tarifa = tarifa;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public String toString() {
		return super.toString()+"Consultor [horas=" + horas + ", tarifa=" + tarifa + "]";
	}
	
	//las dos carcular paga son diferentes en empleado y consultor porque cada uno tiene una forma de calcular su sueldo
	//Aquí hay que pasarle el mismo numero de parametros que al metodo de la clase madre aunque no se use
	public double calcularPaga(int numHijos) {
		return horas*tarifa;
	}
	
	
}
