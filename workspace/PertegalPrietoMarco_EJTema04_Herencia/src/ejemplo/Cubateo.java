package ejemplo;

public class Cubateo extends Restaurante{
	private String tipoAlcohol;
	private boolean limon;
	private boolean canita;
	private double pvp;
	
	
	public Cubateo(String nombreServicio, double preBaseServicio, String tipoAlcohol, boolean limon, boolean canita,
			double pvp) {
		super(nombreServicio, preBaseServicio);
		this.tipoAlcohol = tipoAlcohol;
		this.limon = limon;
		this.canita = canita;
		this.pvp = pvp;
	}
	
	

	public String getTipoAlcohol() {
		return tipoAlcohol;
	}



	public void setTipoAlcohol(String tipoAlcohol) {
		this.tipoAlcohol = tipoAlcohol;
	}



	public boolean isLimon() {
		return limon;
	}



	public void setLimon(boolean limon) {
		this.limon = limon;
	}



	public boolean isCanita() {
		return canita;
	}



	public void setCanita(boolean canita) {
		this.canita = canita;
	}



	public double getPvp() {
		return pvp;
	}



	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	

	@Override
	public String toString() {
		return "Cubateo [tipoAlcohol=" + tipoAlcohol + ", limon=" + limon + ", canita=" + canita + ", pvp=" + pvp + "]";
	}



	//
	public void calcularPvp() {
		double preCanita=5, preLimon=0.005;
		if (canita) {
			setPvp(super.getPreBaseServicio()+preCanita);
		}else if(limon) {
			setPvp(super.getPreBaseServicio()+preLimon);
		}
	}
	
	
}
