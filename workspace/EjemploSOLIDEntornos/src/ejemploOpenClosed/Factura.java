package ejemploOpenClosed;

public class Factura {
	private int id;
	private String fecha;
	private String nombre;
	private String apellidos;
	private double cantidad;
	
	public Factura(int id, String fecha, String nombre, String apellidos, double cantidad) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cantidad = cantidad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Factura [id=" + id + ", fecha=" + fecha + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", cantidad=" + cantidad + "]";
	}
	
	
	
	
	
}
