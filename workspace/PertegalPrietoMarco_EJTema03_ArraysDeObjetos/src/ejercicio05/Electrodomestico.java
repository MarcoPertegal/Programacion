package ejercicio05;

public class Electrodomestico {
	
	private double precioBase;
	private String color;
	private char consumoE;
	private double peso;
	
	public Electrodomestico() {
		super();
		this.precioBase = 100.0;
		this.color = "blanco";
		this.consumoE = 'F';
		this.peso = 5.0;
	}
	public Electrodomestico(double precioBase, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = "blanco";
		this.consumoE = 'F';
		this.peso = peso;
	}
	public Electrodomestico(double precioBase, String color, char consumoE, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoE = consumoE;
		this.peso = peso;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getConsumoE() {
		return consumoE;
	}
	public void setConsumoE(char consumoE) {
		this.consumoE = consumoE;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoE=" + consumoE + ", peso="
				+ peso + "]";
	}
	
	//metodos mios
	public void comprobarConsumoEnergetico(char letra) {
		//NIDEA
	}
	public void comprobarColor() {
		//nidea
	}
	
	
	
	
}
