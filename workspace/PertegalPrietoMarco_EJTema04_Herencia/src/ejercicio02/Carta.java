package ejercicio02;

public class Carta extends Documento{
	
	private String fecha;

	public Carta(String nombreEmpresa, int codEmpresa, String municipio, int telefono, String fecha) {
		super(nombreEmpresa, codEmpresa, municipio, telefono);
		this.fecha = fecha;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Carta [fecha=" + fecha + "]";
	}
	
	//
	public void imprimirCarta() {
		super.imprimirDocumento();
		System.out.println("_______________________");
		System.out.println("| CARTA                |");
		System.out.println("------------------------");
		System.out.println("| Fecha: "+fecha);
	}
}
