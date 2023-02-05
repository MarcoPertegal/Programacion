package ejercicio06Otrave;

public class Entrada {
	
	private String codigoEntrada;
	private double precio;
	private boolean libre;
	private int fila;
	private int butaca;
	
	
	
	public Entrada(String codigoEntrada, double precio, boolean libre, int fila, int butaca) {
		super();
		this.codigoEntrada = codigoEntrada;
		this.precio = precio;
		this.libre = libre;
		this.fila = fila;
		this.butaca = butaca;
	}
	public String getCodigoEntrada() {
		return codigoEntrada;
	}
	public void setCodigoEntrada(String codigoEntrada) {
		this.codigoEntrada = codigoEntrada;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isLibre() {
		return libre;
	}
	public void setLibre(boolean libre) {
		this.libre = libre;
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getButaca() {
		return butaca;
	}
	public void setButaca(int butaca) {
		this.butaca = butaca;
	}
	@Override
	public String toString() {
		return "Entrada [codigoEntrada=" + codigoEntrada + ", precio=" + precio + ", libre=" + libre + ", fila=" + fila
				+ ", butaca=" + butaca + "]";
	}
}
