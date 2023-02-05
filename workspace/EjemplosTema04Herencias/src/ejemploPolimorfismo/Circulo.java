package ejemploPolimorfismo;

public class Circulo extends Figura{
	private double radio;

	public Circulo() {
	}

	public Circulo(String nombre, String color, double radio) {
		super(nombre, color);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	//metodos mios
	public double calcularArea() {
		return Math.PI*Math.pow(radio,2);
	}
	
	public double calcularPerimetro() {
		return 2*Math.PI*radio;
	}
	
}
