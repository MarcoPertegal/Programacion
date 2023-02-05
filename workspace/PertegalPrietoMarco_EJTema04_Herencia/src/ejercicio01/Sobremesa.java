package ejercicio01;

public class Sobremesa extends Ordenador{
	private double preMontaje;

	public Sobremesa(double capDisco, int frecuenProces, double preBase, String marca, double preMontaje) {
		super(capDisco, frecuenProces, preBase, marca);
		this.preMontaje = preMontaje;
	}

	public double getPreMontaje() {
		return preMontaje;
	}

	public void setPreMontaje(double preMontaje) {
		this.preMontaje = preMontaje;
	}

	@Override
	public String toString() {
		return "Sobremesa [preMontaje=" + preMontaje + "]";
	}
	
	//metodos
	public double calcularPvp(double ganancia) {
		return super.calcularPvp(ganancia) + preMontaje;
	}
}
