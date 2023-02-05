package primerEjemplo;
	//CLASE POJO
	//el extends es la herencia, extiende a trabajador
	//El super que se genera en el contructor ya tiene utilidad, 
public class Empleado extends Trabajador{
	
	//IMPORTANTE NO PONER EL MISMO NOMBRE A ATRIBUSTOS DE LA CLASE MADRE Y CLASE HIJA
	private double sueldo;
	private double impuestos;
	
	//Al contructor hay que darle los atributos que usa propios y llamar dentro del super a los de la clase padre, con el mismo orden
	//los constructores no se heredan
	public Empleado(String nombre, String puesto, double sueldo, double impuestos) {
		super(nombre, puesto);
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}
	
	//para que me imprima los atributos de la clase padre(trabajador) hay que llamar al toString de la clase padre con super delante
	//suoer()   llamada contructor de la superclase padre
	//super.    Para llamar a metodos de la superlase clase padre
	//una superclase es toda clase padre de otra
	//una clase no puede heredar de dos clases alavez pero una clase padre si puede heredar a dos
	@Override
	public String toString() {
		return super.toString()+"Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + "]";
	}
	
	//si al metodo que hereda se le da un parametro a este hay que darselo tamben, para llamar a la clase de arriva se usa el super
	//ambos deben tener el mismo numero de parametos sino no, no seria reescritura(que es lo que estamos haciendo ahora)
	//se podria poner geNombre sin this porquer this. porque ya se lo hemos pasado en el contructor en el super
	public double calcularPaga(int numHijos) {
		double divisor = 100.0;
		getNombre();
		return (sueldo-sueldo*impuestos/divisor)+super.calcularPaga(numHijos);
	}
	
	
}
