package ejemplo;

public class CartaGourmet extends Restaurante{
	private double porcentPlus;
	private double pvp;
	
	public CartaGourmet(String nombreServicio, double preBaseServicio, double porcentPlus, double pvp) {
		super(nombreServicio, preBaseServicio);
		this.porcentPlus = porcentPlus;
		this.pvp = pvp;
	}
	



	//
	public double getPorcentPlus() {
		return porcentPlus;
	}




	public void setPorcentPlus(double porcentPlus) {
		this.porcentPlus = porcentPlus;
	}




	public double getPvp() {
		return pvp;
	}




	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	


	@Override
	public String toString() {
		return "CartaGourmet [porcentPlus=" + porcentPlus + ", pvp=" + pvp + "]";
	}




	public void calcularPvp() {
			setPvp(super.getPreBaseServicio() +(getPreBaseServicio()*porcentPlus)/100);
	}
}
