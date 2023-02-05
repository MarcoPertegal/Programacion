package ejercicio01;

public class Producto {
	
	private double precioFab, peso;
	private String nombre, categoria;
	private boolean fragil;
	
	public Producto(double precioFab, double peso, String nombre, String categoria, boolean fragil) {
		super();
		this.precioFab = precioFab;
		this.peso = peso;
		this.nombre = nombre;
		this.categoria = categoria;
		this.fragil = fragil;
	}

	public double getPrecioFab() {
		return precioFab;
	}

	public void setPrecioFab(double precioFab) {
		this.precioFab = precioFab;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}

	@Override
	public String toString() {
		return "Producto [precioFab=" + precioFab + ", peso=" + peso + ", nombre=" + nombre
				+ ", categoria=" + categoria + ", fragil=" + fragil + "]";
	}
	
	
	
	
	
	
	
}
