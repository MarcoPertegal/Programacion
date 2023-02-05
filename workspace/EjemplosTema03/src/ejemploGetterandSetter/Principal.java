package ejemploGetterandSetter;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		double precio, precioNuevo;
		Producto prod;
		
		System.out.println("Diga el nombre:");
		nombre=Leer.dato();
		System.out.println("Diga el precio:");
		precio=Leer.datoDouble();
		
		prod=new Producto (nombre,precio);
		
		//para mostrar uno de los atributos del producto
		System.out.println(prod.getNombre());
		System.out.println(prod.getPrecio());
		System.out.println("Nuevo precio:");
		precioNuevo=Leer.datoDouble();
		prod.setPrecio(precioNuevo);
		System.out.println(prod.getPrecio());
		
		//Mostrar datos
		System.out.println(prod);
	}

}
