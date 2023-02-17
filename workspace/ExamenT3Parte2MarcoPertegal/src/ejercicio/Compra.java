package ejercicio;

public class Compra {
	
	private String concepto;
	private double gasto;
	private int id;
	
	public Compra(String concepto, double gasto, int id) {
		super();
		this.concepto = concepto;
		this.gasto = gasto;
		this.id = id;
	}

	public Compra() {
		super();
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getGasto() {
		return gasto;
	}

	public void setGasto(double gasto) {
		this.gasto = gasto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Compra [concepto=" + concepto + ", gasto=" + gasto + ", id=" + id + "]";
	}
	
	
	
	
	
}
