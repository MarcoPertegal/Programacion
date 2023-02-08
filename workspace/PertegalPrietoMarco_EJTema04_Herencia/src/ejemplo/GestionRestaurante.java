package ejemplo;

import java.util.Arrays;

public class GestionRestaurante {
	private Restaurante [] lista;
	private String nombreLocal;
	private double preTotal;
	
	public GestionRestaurante(Restaurante[] lista, String nombreLocal, double preTotal) {
		super();
		this.lista = lista;
		this.nombreLocal = nombreLocal;
		this.preTotal = preTotal;
	}

	public Restaurante[] getLista() {
		return lista;
	}

	public void setLista(Restaurante[] lista) {
		this.lista = lista;
	}

	public String getNombreLocal() {
		return nombreLocal;
	}

	public void setNombreLocal(String nombreLocal) {
		this.nombreLocal = nombreLocal;
	}

	public double getPreTotal() {
		return preTotal;
	}

	public void setPreTotal(double preTotal) {
		this.preTotal = preTotal;
	}

	@Override
	public String toString() {
		return "GestionRestaurante [lista=" + Arrays.toString(lista) + ", nombreLocal=" + nombreLocal + ", preTotal="
				+ preTotal + "]";
	}
	
	//
	
	public void imprimirTodosPrecios() {
		for (int i = 0; i < lista.length; i++) {
			((Cubateo)lista[i])
		}
	}
}
