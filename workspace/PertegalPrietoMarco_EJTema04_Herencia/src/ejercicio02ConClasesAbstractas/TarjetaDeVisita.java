package ejercicio02ConClasesAbstractas;

public class TarjetaDeVisita extends Documento{
	//datos contecto persona
	private String nombreEmpleado;
	private String departamento;
	private int telefonoEmpleado;
	
	
	public TarjetaDeVisita(String nombreEmpresa, int codEmpresa, String municipio, int telefono, String nombreEmpleado,
			String departamento, int telefonoEmpleado) {
		super(nombreEmpresa, codEmpresa, municipio, telefono);
		this.nombreEmpleado = nombreEmpleado;
		this.departamento = departamento;
		this.telefonoEmpleado = telefonoEmpleado;
	}
	
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getTelefonoEmpleado() {
		return telefonoEmpleado;
	}

	public void setTelefonoEmpleado(int telefonoEmpleado) {
		this.telefonoEmpleado = telefonoEmpleado;
	}

	@Override
	public String toString() {
		return "TarjetaDeVisita [nombreEmpleado=" + nombreEmpleado + ", departamento=" + departamento
				+ ", telefonoEmpleado=" + telefonoEmpleado + "]";
	}

	//IMPORTANT El nombre del atributo en el get va en mayúsculas
	public void imprimirDocumento() {
		System.out.println("___________________________________________________");
		System.out.println("| TARJETA DE VISITA \t\t |");
		System.out.println("|-------------------------------------------------|");
		System.out.println("| \t\t\t\t |");
		System.out.println("| Nombre: "+nombreEmpleado);
		System.out.println("| Departamento: "+departamento);
		System.out.println("| Número teléfono: "+telefonoEmpleado);
		System.out.println("---------------------------------------------------");
		
	}
	
	
	
}
