package ejercicio02;

public class Documento {
	private String nombreEmpresa;
	private int codEmpresa;
	private String municipio;
	private int telefono;
	
	public Documento(String nombreEmpresa, int codEmpresa, String municipio, int telefono) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.codEmpresa = codEmpresa;
		this.municipio = municipio;
		this.telefono = telefono;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public int getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(int codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Documento [nombreEmpresa=" + nombreEmpresa + ", codEmpresa=" + codEmpresa + ", municipio=" + municipio
				+ ", telefono=" + telefono + "]";
	}
	
	//Metodos
	public void imprimirDocumento() {
		System.out.println("________________________________________________________");
		System.out.println("|  DOCUMENTO                                           |");
		System.out.println("|------------------------------------------------------|");
		System.out.println("|                                                      |");
		System.out.println("|  Empresa: "+nombreEmpresa+"                          |");
		System.out.println("|  Código de la empresa: "+codEmpresa+"                |");
		System.out.println("|  Municipio: "+municipio+"                            |");
		System.out.println("|  Teléfono: "+telefono+"                              |");
		System.out.println("|                                                      |");
		System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
	}
	
	
}
