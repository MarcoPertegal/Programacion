package ejercicio1;

public class EntradaInvitados extends EntradaGeneral{
	private String nombrePersona;

	

	public EntradaInvitados(int zona, int numFila, int numAsiento, String nombrePersona) {
		super(zona, numFila, numAsiento);
		this.nombrePersona = nombrePersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	@Override
	public String toString() {
		return super.toString()+"EntradaInvitados [nombrePersona=" + nombrePersona + "]";
	}

	public double calcularPrecio(double suma) {
		return super.calcularPrecio()+suma;
	}
	
	public void imprimirConsumicion() {
		System.out.println("Consumición para: "+nombrePersona);
	}
	
	public double calcularDonativo(double porcentDonativo) {
		double div=100;
		return (calcularPrecio()*porcentDonativo)/div;
	}
	
	
}
