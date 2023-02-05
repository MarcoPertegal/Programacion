package ejercicio03;

public class Motocicleta extends Vehiculo{
	private double peso;

	public Motocicleta(int clilindrada, int potencia, String categoria, double peso) {
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
		return "motocicletas [peso=" + peso + "]";
	}
	
	//metodos mios
	public double calcularImpuesto(int tipo) {
		//el sesenta pordciento habria que pasarselo por parametro y habria que pasarselo como parametro al metodo de la clase madre
		double div= 100, sesenta= 60;
		
		return super.calcularImpuesto(tipo)+((getCilindrada()*sesenta)/div);
	}
}
