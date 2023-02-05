package ejercicio03;

public class Coche extends Vehiculo{
	private double peso;

	public Coche(int clilindrada, int potencia, String categoria, double peso) {
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
		return "coche [peso=" + peso + "]";
	}
	//metodos mios
	public double calcularImpuesto(int tipo) {
		
		return super.calcularImpuesto(tipo)+((getCilindrada()*25)/100);
	}
	

}
