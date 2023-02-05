package ejemploRelacionClases;

public class Cuenta 
{
	private long numero;
	private Cliente c;
	private float saldo;
	private float tinteresAnual;
	
	public Cuenta(long numero, Cliente c, float saldo, float tinteresAnual) {
		this.numero = numero;
		this.c = c;
		this.saldo = saldo;
		this.tinteresAnual = tinteresAnual;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getTinteresAnual() {
		return tinteresAnual;
	}

	public void setTinteresAnual(float tinteresAnual) {
		this.tinteresAnual = tinteresAnual;
	}

	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", c=" + c + ", saldo=" + saldo + ", tinteresAnual=" + tinteresAnual + "]";
	}
	
	//Metodos
	public float ingresarPension(int topeEdad) {				//importante que lo que devulevan sean del mismo tipo, en este caso float,														
		saldo=saldo+c.comprobarClienteSenior(topeEdad);			//se le da al metodo usado dentro del metodo el mismo parametro que se le da al metodo al que llama(comprobarClienteSenior)
		return saldo;											//realmente la forma para llamar a metodos dentro de métodos es igual que como se llaman en el main, usando el nombre que se le ha dado a la clase y pasandole el parametro que necesita(si es necesario o no).
	}
	
	//si no tuviese cliente como atributo abria que pasarlo como parámetro asi:
	
	//public float ingresarPension(int topeEdad, Cliente c) {
	//	saldo= saldo + c.comprobarClienteSenior(topeEdad);
	//	return saldo;
	//}
	
	
	
}
