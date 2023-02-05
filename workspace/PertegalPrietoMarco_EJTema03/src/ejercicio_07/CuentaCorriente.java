package ejercicio_07;

public class CuentaCorriente 
{
	//atributos
	private double saldo;
	private String titular;
	
	//constructor
	public CuentaCorriente () {
		
	}
	public CuentaCorriente(String titular,double saldo) {
		this.titular=titular;
		this.saldo=saldo;
	}
	//get
	public double getSaldo () {
		return saldo;
	}
	public String getTitular () {
		return titular;
	}
	
	//set
	public void setTitular(String titular) {
		this.titular=titular;
	}
	
	//metodos
	public void imprimirTitular (String titular) {
		System.out.println("Hola, "+titular+".");
	}
	public double ingresarSaldo (double ingr) {
		saldo += ingr;
		
		return saldo;
	}
	public Boolean retirarSaldo (double reti) {
		if(reti <= saldo) {
			saldo -= reti;
			return true;
		}else {
			return false;
		}
	}
	public void imprimirRetirarSaldo (Boolean ret) {
		if (ret) {
			System.out.println("Cantidad retirada con exito.");
		}else {
			System.out.println("ERROR EN EL RETIRO");
		}
	}
	public double calcularSaldo () {
		double conv=0, dollar=1.083;
		conv=saldo*dollar;
		return conv;
		
	}
	
}
