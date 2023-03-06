package ejercicio07Ej04Tema04ConListas;

import java.util.Map;

public class Venta {
	//enta tendra una lista de lineas de venta, 
	//metodos crud van aqui
	
	private Map <Integer, LineaVenta> lista;
	
	public Venta(Map<Integer, LineaVenta> lista) {
		super();
		this.lista = lista;
	}

	public Map<Integer, LineaVenta> getLista() {
		return lista;
	}

	public void setLista(Map<Integer, LineaVenta> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Venta [lista=" + lista + "]";
	}

	public void imprimirTiquet() {
		System.out.println("CANT \t Producto \t Precio \t Total");
		System.out.println("-------------------------------------------------");
		for (LineaVenta l : lista.values()) {
			l.imprimirLinea();
			if(l.getP() instanceof Alimentacion) {
				((Alimentacion)l.getP()).imprimirMensaje();
			}
		}
		System.out.println("--------------------------------------------------");
		System.out.printf("TOTAL: %.2f", calcularTotal());
	}

	public double calcularTotal() {
		double total=0.0;
		
		for (LineaVenta l : lista.values()) {
			total += l.calcularSubTotal();
		}
		return total;
	}
	
	public void imprimirTodo() {
		int i=1;
		for (LineaVenta l :lista.values()) {
			System.out.printf("%d . %s %s %.2f %s \n",i,l.getP().getNombre(), l.getP().getId(), l.getP().getPrecioUni(), l.getCant());
			i++;
		}
	}
	
	//metodo find
	public LineaVenta findById(String idBusq) {
	
		for (LineaVenta lv : lista.values()) {
			if (lv.getP().getId().equalsIgnoreCase(idBusq))
				return lv;
		}
		return null;
	}
	
	public void add(Integer id, LineaVenta lv) {
		lista.put(id, lv);
	}
	
	
}
