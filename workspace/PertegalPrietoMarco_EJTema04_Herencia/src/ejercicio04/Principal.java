package ejercicio04;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//se crea una venta
		//y un array de lineas de venta, 
		
		LineaDeVenta [] lista = new LineaDeVenta [3];
		Venta v = new Venta (lista);
		
		lista[0] = new LineaDeVenta(new Alimentacion(2, "Manzana", "ma1", 5), 2);
		lista[1] = new LineaDeVenta(new Electronica(5, "Auriculares", "ma2", 2), 3);
		lista[2] = new LineaDeVenta(new Ropa(7, "Gorro", "ma3", "Accesorios"),1);
		
		v.imprimirTiquet();
		
		
		
		
		
	}

}
