package ejercicio07Ej04Tema04ConListas;

public class Ropa extends Producto{
	private String seccion;

	public Ropa(double precioUni, String nombre, String id, String seccion) {
		super(precioUni, nombre, id);
		this.seccion = seccion;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	@Override
	public String toString() {
		return "Ropa [seccion=" + seccion + "]";
	}
	
	public double calcularPrecioUni() {
		return super.getPrecioUni();
	}
	
	//PREGUNTAR ÁNGEL EL COMPARE TO LO HEREDAN LAS HIJAS
	@Override
	public int compareTo(LineaVenta o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
