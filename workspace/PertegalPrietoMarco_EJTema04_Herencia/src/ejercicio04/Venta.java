package ejercicio04;

import java.util.Arrays;

//el tiquet entero
public class Venta {
	private LineaDeVenta [] lista;

	public Venta(LineaDeVenta[] lista) {
		super();
		this.lista = lista;
	}

	public Venta() {
		super();
	}

	public LineaDeVenta[] getLista() {
		return lista;
	}

	public void setLista(LineaDeVenta[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Venta [lista=" + Arrays.toString(lista) + "]";
	}
	//lo de imprimir si le queda poco para cadurar se hace con un inf en el metodo que imprime el tiquet
	//metodo para calcular el total de todos los productos
	//otro para imprimir el tique entero
	
	public void imprimirTiquet() {
		System.out.println("CANT \t Producto \t Precio \t Total");
		System.out.println("-------------------------------------------------");
		for (int i = 0; i < lista.length; i++) {
			lista[i].imprimirLinea();
			if(lista[i].getP() instanceof Alimentacion) {//instance of sirbe para cambiarle la sinstancia a la clase y poder usar el metodo imprimir emnsaje 
				((Alimentacion)lista[i].getP()).imprimirMensaje();
			}
		}
		System.out.println("--------------------------------------------------");
		System.out.printf("TOTAL: %.2f", calcularTotal());
	}
	public void imprimirTiquetMal() {
		for (int i = 0; i < lista.length; i++) {
			lista[i].imprimirLinea();
		}
		
	}
	public double calcularTotal() {
		double total=0.0;
		for (int i = 0; i < lista.length; i++) {
			total += lista[i].calcularSubTotal();

		}
		return total;
	}
	
	
	
}
