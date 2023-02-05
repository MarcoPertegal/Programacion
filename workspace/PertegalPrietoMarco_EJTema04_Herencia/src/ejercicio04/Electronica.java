package ejercicio04;

public class Electronica extends Producto {
	private double impuestoLujo;

	public Electronica(double precioUni, String nombre, String id, double impuestoLujo) {
		super(precioUni, nombre, id);
		this.impuestoLujo = impuestoLujo;
	}

	public double getImpuestoLujo() {
		return impuestoLujo;
	}

	public void setImpuestoLujo(double impuestoLujo) {
		this.impuestoLujo = impuestoLujo;
	}

	@Override
	public String toString() {
		return "Electronica [impuestoLujo=" + impuestoLujo + "]";
	}

	@Override
	public double calcularPrecioUni() {
		double impuesto = 20;
		return super.getPrecioUni()+((super.getPrecioUni()*impuesto)/100);
	}
	
	
	
	
	
	
}
