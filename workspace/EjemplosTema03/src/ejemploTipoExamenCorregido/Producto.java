package ejemploTipoExamenCorregido;

public class Producto {
	
	//atributos
	private String nombre;
	private double precioBase;
	private String seccion;
	private boolean rebajado;
	private double pvp;
	
	//contructores
	public Producto(String nombre, double precioBase, String seccion, boolean rebajado) {

		this.nombre = nombre;
		this.precioBase = precioBase;
		this.seccion = seccion;
		this.rebajado = rebajado;
	}
	public Producto() {
	}
	
	//getter and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public boolean isRebajado() {
		return rebajado;
	}

	public void setRebajado(boolean rebajado) {
		this.rebajado = rebajado;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioBase=" + precioBase + ", seccion=" + seccion + ", rebajado="
				+ rebajado + ", pvp=" + pvp + "]";
	}
	//metodos
	public double calcularPvp (double ganancia) {
		double cien=100;
		pvp=precioBase+precioBase*ganancia/cien;
		return pvp;
	}
	public double calcularPrecioRebajado (double porRebajas) {
		double cien=100, resta=0.0;
		
		if (rebajado) {
			resta=(porRebajas*pvp)/cien;
			pvp -= resta;
		}
		return pvp;
	}
	public double calcularLibras (double libras) {
		
	return pvp*libras;//esto está BIEN porque SINO  estoy machacando cuanto vale en euros.
	}
	public void imprimirGanga (double tope) {
		if (pvp<tope) {
			System.out.println("MEGAGANGA");
		} else {
			System.out.println("NO MEGAGANGA");
		}
	}
	//metodo para pasar el mayor de un array CAE EN EL EXAMEN SEGURO	
	public double calcularMasCaro (double [] precios) {
		double mayor=0.0;
		
		for (int i = 0; i < precios.length; i++) {
			if (precios[i]>mayor) {
				mayor=precios[i];
			}
		}
		return mayor;
	}
	public double [] calcularEnLibras (double[] precios, double libras) {
		
		for (int i = 0; i < precios.length; i++) {
			precios[i]=precios[i]*libras;
		}
		return precios;//si ponemkos corchetes solo devuelve un elemento del array
	}
	public void calcualarEnLibras (double[] precios) {
		for (int i = 0; i < precios.length; i++) {
			System.out.printf("\t %.2f", precios[i]);
		}
	}
}
