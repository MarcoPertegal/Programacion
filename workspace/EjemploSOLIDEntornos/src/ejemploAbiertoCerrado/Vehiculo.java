package ejemploAbiertoCerrado;

public class Vehiculo {
	//ponerle a las clases hijas de vehiculo un atributo extra para que no tengan los mismos que la clase vehiculo, si ya lo da el enunciado no hace flata
	private int cilindrada;
	private int potencia;
	private String categoria;
	
	public Vehiculo(int cilindrada, int potencia, String categoria) {
		super();
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		this.categoria = categoria;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	     
	public void setCilindrada(int clilindrada) {
		this.cilindrada = clilindrada;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Vehiculo [cilindrada=" + cilindrada + ", potencia=" + potencia + ", categoria=" + categoria + "]";
	}
	
	//Metodos
	//Este metodo no podria ser abstracto porque es necesario que este metodo haga un calculo comun a todos los tipos de vehiculos
	//aunque no sea necesario llamrlo en el main
	public double calcularImpuesto(int tipo) {
		double cantFija = 0.0;
		switch (tipo) {
			case 0:
				categoria = "cero";
				cantFija= 20;
				break;
			case 1:
				categoria = "eco";
				cantFija= 50;
				break;
			case 2:
				categoria = "TipoB";
				cantFija= 150;
				break;
			case 3:
				categoria = "TipoC";
				cantFija= 200;
				break;
			default:
				System.out.println("OPCIÓN DESCONOCIDA");
				break;
		}
		return cantFija;
	}

	
}
