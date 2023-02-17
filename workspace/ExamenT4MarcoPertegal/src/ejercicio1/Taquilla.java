package ejercicio1;

import java.util.Arrays;

public class Taquilla {
	EntradaGeneral [] lista;
	
	public Taquilla(EntradaGeneral[] lista) {
		super();
		this.lista = lista;
	}
	


	//
	public EntradaGeneral[] getLista() {
		return lista;
	}



	public void setLista(EntradaGeneral[] lista) {
		this.lista = lista;
	}
	


	@Override
	public String toString() {
		return "Taquilla [lista=" + Arrays.toString(lista) + "]";
	}



	public EntradaGeneral findByFilayAsiento(int buscNumFila, int buscNumAsiento) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < lista.length && !encontrado) {
			EntradaGeneral deLista= lista[i];
			if (deLista.getNumFila() == buscNumFila) {
				if (deLista.getNumAsiento() == buscNumAsiento) {
					encontrado = true;
				}
			}else {
				i++;
			}
		}
		if (encontrado)
			return lista[i];
		else 
			return null;
	}
	
	public double calcularPrecioDeUnaEntrada(EntradaGeneral e, double porcentDonativo) {
		if (e == null) {
			return 0;
		}else {
			return e.calcularPrecio()+ e.calcularDonativo(porcentDonativo);
		}
	}
	
	public void imprimirTodo() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println((i+1)+"º "+lista[i]);
			
		}
	}
	
	public double calcularTotal(double porcentDonativo) {
		double total = 0;
		for (int i = 0; i < lista.length; i++) {
			total += lista[i].calcularPrecio()+ lista[i].calcularDonativo(porcentDonativo);
		}
		return total;
	}
	
	public double calcularTotalEntradasArriva(double porcentDonativo) {
		double total=0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].getZona() == 1) {
				total += lista[i].calcularPrecio()+ lista[i].calcularDonativo(porcentDonativo);
			}
		}
		return total;
	}
	public void imprimirConsumicionInvitados() {
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] instanceof EntradaInvitados) {
				((EntradaInvitados)lista[i]).imprimirConsumicion();
			}
		}
	}
	public double calcularTotalRecaudadoDonativos(double porcentDonativo) {
		double total = 0;;
		for (int i = 0; i < lista.length; i++) {
			total += lista[i].calcularDonativo(porcentDonativo);
		}
		return total;
	}
	
	
}
