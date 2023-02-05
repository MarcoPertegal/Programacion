package ejercicio01;

public class Ordenador {
	//IMPORTANTE NO PONER EL MISMO NOMBRE A ATRIBUSTOS DE LA CLASE MADRE Y CLASE HIJA PERO ENTRE HIJAS SI SE PUEDE 
	private double capDisco;
	private int frecuenProces;
	private double preBase;
	private String marca;
	
	public Ordenador(double capDisco, int frecuenProces, double preBase, String marca) {
		super();
		this.capDisco = capDisco;
		this.frecuenProces = frecuenProces;
		this.preBase = preBase;
		this.marca = marca;
	}

	public double getCapDisco() {
		return capDisco;
	}

	public void setCapDisco(double capDisco) {
		this.capDisco = capDisco;
	}

	public int getFrecuenProces() {
		return frecuenProces;
	}

	public void setFrecuenProces(int frecuenProces) {
		this.frecuenProces = frecuenProces;
	}

	public double getPreBase() {
		return preBase;
	}

	public void setPreBase(double preBase) {
		this.preBase = preBase;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Ordenador [capDisco=" + capDisco + ", frecuenProces=" + frecuenProces + ", preBase=" + preBase
				+ ", marca=" + marca + "]";
	}
	
	//Metodos mios
	//NO PONER EL CALCULO DEL return dentro del metodo de las otras dos clasesporque sino no estariamos ahorrando codigo
	public double calcularPvp(double ganancia) {
		double div=100;
		return preBase+preBase*(ganancia/div);
	}

}
