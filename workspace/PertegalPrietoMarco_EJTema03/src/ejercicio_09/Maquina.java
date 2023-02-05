package ejercicio_09;

public class Maquina 
{
	//todos los emtodos en maquina
	//opciones de operario con contraseña, seterar el precio de los billetes y que valgan mas, y calcular la recaudación total y la contraseña compararla con equals.
	
	//constructor
	public Maquina() {

	}
	
	//metodos mios
	public double calcularPrecio(double preBilletes, int numBilletes) {
		return numBilletes*preBilletes;
	}
	public double calcularCambio(double preTotal, double pago) {
		return pago -= preTotal;
		
	}
}
