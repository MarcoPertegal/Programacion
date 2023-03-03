package ejercicio01;

public class Nota {
	private String titulo;
	private String contenido;
	private String fechaDeCreacion;
	
	public Nota(String titulo, String contenido, String fechaDeCreacion) {
		super();
		this.titulo = titulo;
		this.contenido = contenido;
		this.fechaDeCreacion = fechaDeCreacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public void setFechaDeCreacion(String fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	@Override
	public String toString() {
		return "- Nota [titulo=" + titulo + ", contenido=" + contenido + ", fechaDeCreacion=" + fechaDeCreacion + "] \n";
	}
	
	
}
