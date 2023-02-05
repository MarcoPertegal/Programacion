package ejemploGetterandSetter;

public class Producto {
	//atributos
	private double precio;
	private String nombre;
	
	//constructores
		public Producto (String nombre, double precio) {
			this.nombre=nombre;
			this.precio=precio;
		}

	//get
	public String getNombre () {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	
	//set
	public void setNombre (String nombre) {
		this.nombre=nombre;
	}
	public void setPrecio (double precio) {
		this.precio=precio;
	}
	
	//toString
	@Override
	public String toString() {
		return "Producto [precio=" + precio + ", nombre=" + nombre + "]";
	}
	
	
}
