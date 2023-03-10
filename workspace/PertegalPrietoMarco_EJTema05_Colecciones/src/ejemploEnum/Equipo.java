package ejemploEnum;

public enum Equipo {
	
	CADIZ("CÁDIZ CF", 1), SEVILLA("Sevilla FC", 2), BETIS("Real Betis", 3);
	
	private String nombreClub;
	private int clasificacion;
	
	
	private Equipo(String nombreClub, int clasificacion) {
		this.nombreClub = nombreClub;
		this.clasificacion = clasificacion;
	}


	public String getNombreClub() {
		return nombreClub;
	}


	public void setNombreClub(String nombreClub) {
		this.nombreClub = nombreClub;
	}


	public int getClasificacion() {
		return clasificacion;
	}


	public void setClasificacion(int clasificacion) {
		this.clasificacion = clasificacion;
	}
	
	
}
