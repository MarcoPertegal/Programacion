package ejemplo;

public class CartaNiños extends Restaurante{
	private double descuento;
	private double Pvp;

	
	public CartaNiños(String nombreServicio, double preBaseServicio, double descuento, double pvp) {
		super(nombreServicio, preBaseServicio);
		this.descuento = descuento;
		Pvp = pvp;
	}
	

	//
	public double getDescuento() {
		return descuento;
	}


	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}


	public double getPvp() {
		return Pvp;
	}


	public void setPvp(double pvp) {
		Pvp = pvp;
	}
	

	@Override
	public String toString() {
		return "CartaNiños [descuento=" + descuento + ", Pvp=" + Pvp + "]";
	}


	public void calcularPvp() {
		setPvp(super.getPreBaseServicio() -(getPreBaseServicio()*5)/100);
	}
}
