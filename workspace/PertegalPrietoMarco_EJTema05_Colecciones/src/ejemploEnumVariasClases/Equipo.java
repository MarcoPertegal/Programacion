package ejemploEnumVariasClases;

public enum Equipo {
	//para que se vea que se le pueden dar atributos y como se hace.
	BARCELONA(1, 31), RMADRID(2, 30), ATMADRID(3, 28), ATHLETIC(9, 25);
	
	private int posicionLiga;
	private int victorias;
	
	private Equipo(int posicionLiga, int victorias) {
		this.posicionLiga = posicionLiga;
		this.victorias = victorias;
	}

	public int getPosicionLiga() {
		return posicionLiga;
	}

	public void setPosicionLiga(int posicionLiga) {
		this.posicionLiga = posicionLiga;
	}

	public int getVictorias() {
		return victorias;
	}

	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}
	
	
	
}
