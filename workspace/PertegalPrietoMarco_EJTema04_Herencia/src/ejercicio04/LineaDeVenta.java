package ejercicio04;

public class LineaDeVenta {
	//linea de venta es cada linea del tiquet de dant 1 papas cant precio
	private Producto p;
	private int cant;
	
	public LineaDeVenta(Producto p, int cant) {
		super();
		this.p = p;
		this.cant = cant;
	}

	public LineaDeVenta() {
		super();
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
		return "LineaDeVenta [p=" + p + ", cant=" + cant + "]";
	}
	//metodo calcular precio total de uno solo
	//metodo para imprimir solo una linea del tiquet, con los get
	public double calcularSubTotal() {
		return p.calcularPrecioUni()*cant;
	}
	public void imprimirLinea() {
		System.out.printf("%d \t %s \t %.2f \t %.2f",cant,p.getNombre(), p.getPrecioUni(), calcularSubTotal());
	}
	
	
}
