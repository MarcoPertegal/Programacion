package ejemploTipoExamen;

public class Producto {

	//atributos
	private String nombre, seccion;
	private double preBase, pvp;
	private boolean sinoRebaja;
	
	//constructores
	
	public Producto() {

	}
	
	public Producto(String nombre, String seccion, double preBase, boolean sinoRebaja) {
		this.nombre = nombre;
		this.seccion = seccion;
		this.preBase = preBase;
		this.sinoRebaja = sinoRebaja;
	}
	
	//Get Set
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getSeccion() {
		return seccion;
	}
	
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public double getPreBase() {
		return preBase;
	}
	
	public void setPreBase(double preBase) {
		this.preBase = preBase;
	}
	
	public double getPvp() {
		return pvp;
	}
	
	public void setPvp(double pvp) {
		this.pvp = pvp;
	}
	
	public boolean isSinoRebaja() {
		return sinoRebaja;
	}
	
	public void setSinoRebaja(boolean sinoRebaja) {
		this.sinoRebaja = sinoRebaja;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", seccion=" + seccion + ", preBase=" + preBase + ", pvp=" + pvp
				+ ", sinoRebaja=" + sinoRebaja + "]";
	}
	
	//metodos mios
	public double calcularPvp(double porcentGanancia) {
		double cien=100;
		
		pvp=preBase+preBase*porcentGanancia/cien;
		
		return pvp;
	}
	public double calcularRebaja(double porcentRebaja) {
		double resta=0.0, cien=100.0;
		if (sinoRebaja) {
			resta=(porcentRebaja*pvp)/cien;
			pvp -= resta;
		}
		return pvp;
	}
	public double calcularCambioMoneda(double valorMoneda) {
		return pvp*valorMoneda;
	}
	
	

	
	
	
}
