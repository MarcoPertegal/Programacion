package ejercicio_01;

public class Circulo 
{
	//atributos lo primero, nunca se le da un valor, el main si se le da un valor, los atributos no son lo mismo que las variables 
	private double radio;
	
	//metodos, donde pone el primer double es el tipo de debolución  
	//no se pone solo calcular, calcular con lo que se va a calcular para poder diferenciarlo, 
	//En los parentesis son los parametros que me hacen falta para calcular eso 
	public Circulo (double radio) {
		this.radio=radio;
	}
	
	//getset
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	//toString
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	//mi metodo
	public double calcularArea () {
		double expo=2;
		double area=0.0;
		area=Math.PI*Math.pow(radio, expo);
		return area;
	}
	
}

