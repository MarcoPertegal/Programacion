package ejercicio01;

public class Portatil extends Ordenador{
	private double preSeguro;

	public Portatil(double capDisco, int frecuenProces, double preBase, String marca, double preSeguro) {
		super(capDisco, frecuenProces, preBase, marca);
		this.preSeguro = preSeguro;
	}

	public double getPreSeguro() {
		return preSeguro;
	}

	public void setPreSeguro(double preSeguro) {
		this.preSeguro = preSeguro;
	}

	@Override
	public String toString() {
		return "Portatil [preSeguro=" + preSeguro + "]";
	}
	
	//Metodos
	public double calcularPvp(double ganancia) {
		return super.calcularPvp(ganancia) + preSeguro;
	}
}
