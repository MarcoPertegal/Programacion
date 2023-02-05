package ejemploRelacionEntreClases;

public class Fracciones {
	//clases pojo solo definen como son los objetos en mi aplicacion en este caso define como e la fraccion, 
	//CLASE POJO
	//atributos
	private int numerador;
	private int denominador;
	
	//constructor
	public Fracciones(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	//getterandSetters
	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	@Override
	public String toString() {
		return "Fracciones [numerador=" + numerador + ", denominador=" + denominador + "]";
	}
	
	
}
