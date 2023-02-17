package ejercicio1;

public class EntradaGeneral implements IDonativo{
	private int zona;
	private int numFila;
	private int numAsiento;
	
	public EntradaGeneral(int zona, int numFila, int numAsiento) {
		super();
		this.zona = zona;
		this.numFila = numFila;
		this.numAsiento = numAsiento;
	}
	

	public int getZona() {
		return zona;
	}


	public void setZona(int zona) {
		this.zona = zona;
	}


	public int getNumFila() {
		return numFila;
	}


	public void setNumFila(int numFila) {
		this.numFila = numFila;
	}


	public int getNumAsiento() {
		return numAsiento;
	}


	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}


	@Override
	public String toString() {
		return "EntradaGeneral [zona=" + zona + ", numFila=" + numFila + ", numAsiento=" + numAsiento + "]";
	}
	
	public double calcularPrecio() {
		if (zona == 1) 
			return 3;
		else 
			return 5;
	}


	@Override
	public double calcularDonativo(double porcentDonativo) {
		double div=100;
		return (calcularPrecio()*porcentDonativo)/div;
	}
}
