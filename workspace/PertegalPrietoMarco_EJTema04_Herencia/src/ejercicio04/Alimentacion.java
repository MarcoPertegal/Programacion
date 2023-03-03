package ejercicio04;

public class Alimentacion extends Producto {
	
	private int diasCad;//deberia ser un atributo este porque es una caracteristica de productos de alimentacion
						//Debe haber un metodo que pide el enunciado de imprimir mensaje ese metodo tiene que tener un if

	public Alimentacion(double precioUni, String nombre, String id, int diasCad) {
		super(precioUni, nombre, id);
		this.diasCad = diasCad;
	}

	public int getDiasCad() {
		return diasCad;
	}

	public void setDiasCad(int diasCad) {
		this.diasCad = diasCad;
	}

	@Override
	public String toString() {
		return "Alimentacion [diasCad=" + diasCad + "]";
	}

	public boolean comprobarDescuento() {
		boolean descuento = false;
		if (diasCad < 2) {
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
	
	
	
	
}
