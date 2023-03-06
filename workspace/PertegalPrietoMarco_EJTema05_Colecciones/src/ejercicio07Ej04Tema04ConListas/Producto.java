package ejercicio07Ej04Tema04ConListas;

import java.util.Objects;

public class Producto{
	//tiene como hijas alimentacion y ropa
	//en producto va el orden natural precio menor mayor
	//no natrual ordenar por nombre
	private double precioUni;
	private String nombre;
	private String id;
	
	public Producto(double precioUni, String nombre, String id) {
		super();
		this.precioUni = precioUni;
		this.nombre = nombre;
		this.id = id;
	}

	public double getPrecioUni() {
		return precioUni;
	}

	public void setPrecioUni(double precioUni) {
		this.precioUni = precioUni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Producto [precioUni=" + precioUni + ", nombre=" + nombre + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, precioUni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precioUni) == Double.doubleToLongBits(other.precioUni);
	}
	
	///////////////
	public double calcularPrecioUni() {
		return 0;
	}
	//ENtonces no podemos ordenar por natural porque hay que monta un lio


}

