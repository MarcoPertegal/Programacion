package ejercicio07Ej04Tema04ConListas;

public class Alimentacion extends Producto{
	private int dias;

	public Alimentacion(double precioUni, String nombre, String id, int dias) {
		super(precioUni, nombre, id);
		this.dias = dias;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	@Override
	public String toString() {
		return "Alimentacion [dias=" + dias + "]";
	}
	
	public boolean comprobarDescuento() {
		boolean descuento = false;
		if (dias < 2) {
			return descuento;
		}else {
			descuento = true;
			return descuento;
		}
	}
	public void imprimirMensaje() {
		if (comprobarDescuento()) {
			System.out.println("Producto con descuento.");
		}else {
			System.out.println("Producto sin descuento.");
		}
	}
	public double calcularPrecioUni() {
		double descuento= 20;
		if (comprobarDescuento()) {
			return super.getPrecioUni()-(super.getPrecioUni()*descuento)/100;
		}else {
			return getPrecioUni();
		}
	}

	@Override
	public int compareTo(LineaVenta o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
