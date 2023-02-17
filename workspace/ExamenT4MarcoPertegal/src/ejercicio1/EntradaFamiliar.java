package ejercicio1;

public class EntradaFamiliar extends EntradaGeneral{
	private int numHijos;

	public EntradaFamiliar(int zona, int numFila, int numAsiento, int numHijos) {
		super(zona, numFila, numAsiento);
		this.numHijos = numHijos;
	}

	public int getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	@Override
	public String toString() {
		return super.toString()+"EntradaFamiliar [numHijos=" + numHijos + "]";
	}
	
	public double calcularPrecio(double porcentDescuento) {
		double div = 100;
		if (numHijos >= 3) {
			return super.calcularPrecio()-((super.calcularPrecio()*porcentDescuento)/div);
		}else {
			return super.calcularPrecio();
		}
	}
	public double calcularDonativo(double porcentDonativo) {
		double div=100;
		return (calcularPrecio()*porcentDonativo)/div;
	}
		
	
}
