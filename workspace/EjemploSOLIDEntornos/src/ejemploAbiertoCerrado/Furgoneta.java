package ejemploAbiertoCerrado;

public class Furgoneta extends Vehiculo{
	private double peso;

	public Furgoneta(int clilindrada, int potencia, String categoria, double peso) {
		super(clilindrada, potencia, categoria);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "furgoneta [peso=" + peso + "]";
	}
	
	//metodos mios
	public double calcularImpuesto(double impFurgo, int tipo) {
		return super.calcularImpuesto(tipo) + impFurgo;
	}
}
