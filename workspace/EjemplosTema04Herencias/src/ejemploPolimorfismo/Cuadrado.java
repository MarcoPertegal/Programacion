package ejemploPolimorfismo;

public class Cuadrado extends Figura{
	private double lado;

	public Cuadrado(String nombre, String color, double lado) {
		super(nombre, color);
		this.lado = lado;
	}

	public Cuadrado() {
		
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}
	//metodos mios
	public double calcularArea() {
		return lado*lado;
	}
	
	public double calcularPerimetro() {
		return lado*4;
	}
	
	public void mostrarLados() {
		System.out.println("Solo estoy en la clase cuadrado porque los demás no tienen lados, en concreto 4 lados");
	}
	
}
