package ejemplo;

public class Restaurante {
	private String nombreServicio;
	private double preBaseServicio;
	public Restaurante(String nombreServicio, double preBaseServicio) {
		super();
		this.nombreServicio = nombreServicio;
		this.preBaseServicio = preBaseServicio;
	}
	public String getNombreServicio() {
		return nombreServicio;
	}
	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}
	public double getPreBaseServicio() {
		return preBaseServicio;
	}
	public void setPreBaseServicio(double preBaseServicio) {
		this.preBaseServicio = preBaseServicio;
	}
	@Override
	public String toString() {
		return "Restaurante [nombreServicio=" + nombreServicio + ", preBaseServicio=" + preBaseServicio + "]";
	}
	
	
	
}
