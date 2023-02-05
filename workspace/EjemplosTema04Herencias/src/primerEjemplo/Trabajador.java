package primerEjemplo;
	//CLASE POJO
	//SUPERCLASE de la hija
public class Trabajador {
	//IMPORTANTE NO PONER EL MISMO NOMBRE A ATRIBUSTOS DE LA CLASE MADRE Y CLASE HIJA PERO ENTRE HIJAS SI SE PUEDE 
	private String nombre;
	private String impuesto;
	

	public Trabajador(String nombre, String impuesto) {
		super();
		this.nombre = nombre;
		this.impuesto = impuesto;
	}
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getImpuesto() {
		return impuesto;
	}


	public void setImpuesto(String impuesto) {
		this.impuesto = impuesto;
	}


	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", impuesto=" + impuesto + "]";
	}
	
	//este metodo se escribe en la clase madre vacio para que se pueda escribir eb las hijas
	//Supongamos que a cada trabajador se le da un dinero por cada hijo que tenga es comun para las dos clases hijas
	public double calcularPaga(int numHijos) {
		double can=100.0;
		return can * numHijos;
	}
	
	
	
}
