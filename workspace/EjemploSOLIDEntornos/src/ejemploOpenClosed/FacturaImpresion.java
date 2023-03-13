package ejemploOpenClosed;

public class FacturaImpresion {
	private Factura f;

	public FacturaImpresion(Factura f) {
		super();
		this.f = f;
	}

	public Factura getF() {
		return f;
	}

	public void setF(Factura f) {
		this.f = f;
	}

	@Override
	public String toString() {
		return "FacturaImpresion [f=" + f + "]";
	}
	
	public void guardarArchivo(String nombreArchivo) {
        // Crea un archivo con el nombre dado y escribe la factura.
    }

    public void guardarEnBaseDatos() {
        // Guarda la factura en la base de datos
    }
}
