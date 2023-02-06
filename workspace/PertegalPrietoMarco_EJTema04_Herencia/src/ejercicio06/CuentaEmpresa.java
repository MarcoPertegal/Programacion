package ejercicio06;

public class CuentaEmpresa extends Cliente{
	private int comision;

	public CuentaEmpresa(String nombre, double saldo, int edad, boolean activo, int comision) {
		super(nombre, saldo, edad, activo);
		this.comision = comision;
	}

	public int getComision() {
		return comision;
	}

	public void setComision(int comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return "CuentaEmpresa [comision=" + comision + "]";
	}
	
	
}
