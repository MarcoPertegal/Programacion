package ejercicio01;


public class Trayecto implements Comparable <Trayecto>{	
	private int id;
	private double duracion;//MINUTOS
	private double litros;
	private String modoConduccion;
	
	public Trayecto(int id, double duracion, double litros, String modoConduccion) {
		super();
		this.id = id;
		this.duracion = duracion;
		this.litros = litros;
		this.modoConduccion = modoConduccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public String getModoConduccion() {
		return modoConduccion;
	}

	public void setModoConduccion(String modoConduccion) {
		this.modoConduccion = modoConduccion;
	}

	@Override
	public String toString() {
		return "Trayecto [id=" + id + ", duracion=" + duracion + ", litros=" + litros + ", modoConduccion="
				+ modoConduccion + "]";
	}

	@Override
	public int compareTo(Trayecto t) {
		return this.modoConduccion.toLowerCase().compareTo(t.getModoConduccion().toLowerCase());
	}

	
	
	
	
}
