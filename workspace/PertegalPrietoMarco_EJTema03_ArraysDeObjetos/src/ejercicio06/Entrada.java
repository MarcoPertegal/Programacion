package ejercicio06;

public class Entrada {

	private String cod;
	private double precio;
	private boolean libre;
	private int fila;
	private int butaca;
	
	public Entrada(String cod, double precio, boolean libre, int fila, int butaca) {
		super();
		this.cod = cod;
		this.precio = precio;
		this.libre = libre;
		this.fila = fila;
		this.butaca = butaca;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
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
		return "Entrada [cod=" + cod + ", precio=" + precio + ", libre=" + libre + ", fila=" + fila + ", butaca="
				+ butaca + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
