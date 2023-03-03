package ejercicio07Ej04Tema04ConListas;

public class LineaVenta {
	//Esto es una linea del tique un producto y la cantidad
	private Producto p;
	private int cant;
	
	public LineaVenta(Producto p, int cant) {
		super();
		this.p = p;
		this.cant = cant;
	}

	public Producto getP() {
		return p;
	}

	public void setP(Producto p) {
		this.p = p;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	@Override
	public String toString() {
		return "LineaVenta [p=" + p + ", cant=" + cant + "]";
	}
	
	public double calcularSubTotal() {
		return p.calcularPrecioUni()*cant;
	}
	public void imprimirLinea() {
		System.out.printf("%d \t %s \t %.2f \t\t %.2f \n",cant,p.getNombre(), p.getPrecioUni(), calcularSubTotal());
	}
	
}
