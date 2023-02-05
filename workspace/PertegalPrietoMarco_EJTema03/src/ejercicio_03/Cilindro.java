package ejercicio_03;

public class Cilindro 
{
	//atributos
	private double radio;
	private double altura;
	
	//constructor
	public Cilindro (double radio, double altura) {
		this.radio=radio;
		this.altura=altura;
	}
	//get
	public double getRadio() {
		return radio;
	}
	public double getAltura() {
		return altura;
	}
	//set
	public void setRadio(double radio) {
		this.radio=radio;
	}
	public void setAltura(double altura) {
		this.altura=altura;
	}

	@Override
	public String toString() {
		return "Cilindro [radio=" + radio + ", altura=" + altura + ", calcularVolumen()=" + calcularVolumen() + "]";
	}
	
	//metodo mio
	public double calcularVolumen () {
		double vol=0;
		int exp=2;
		
		vol=Math.PI*Math.pow(radio, exp)*altura;
		
		return vol;
	
	}
}
