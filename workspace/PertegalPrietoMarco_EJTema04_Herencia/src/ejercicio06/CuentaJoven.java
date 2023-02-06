package ejercicio06;

public class CuentaJoven extends Cliente{
	private int ptsIngreso;

	public CuentaJoven(String nombre, double saldo, int edad, boolean activo, int ptsIngreso) {
		super(nombre, saldo, edad, activo);
		this.ptsIngreso = ptsIngreso;
	}

	public int getPtsIngreso() {
		return ptsIngreso;
	}

	public void setPtsIngreso(int ptsIngreso) {
		this.ptsIngreso = ptsIngreso;
	}

	@Override
	public String toString() {
		return "CuentaJoven [ptsIngreso=" + ptsIngreso + "]";
	}
	
	
}
