package ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Coche {
	private List <Trayecto> listaTrayecto;

	public Coche(List<Trayecto> listaTrayecto) {
		super();
		this.listaTrayecto = listaTrayecto;
	}

	public List<Trayecto> getListaTrayecto() {
		return listaTrayecto;
	}

	public void setListaTrayecto(List<Trayecto> listaTrayecto) {
		this.listaTrayecto = listaTrayecto;
	}

	@Override
	public String toString() {
		return "Coche [listaTrayecto=" + listaTrayecto + "]";
	}
	
	//CRUD
	
	public Trayecto buscTrayectosPorModoConduccion(String buscModoConduccion) {
		Iterator <Trayecto> it = listaTrayecto.iterator();
		
		while(it.hasNext()) {
			if (it.next().getModoConduccion().equalsIgnoreCase(buscModoConduccion.toLowerCase())) {
				return it.next();
			}
		}
		return null;
	}
	
	public Trayecto buscTrayectoMayorDuracion() {
		double mayorDuracion=0;
		for (Trayecto t : listaTrayecto) {
			if (mayorDuracion < t.getDuracion()) {
				mayorDuracion = t.getDuracion();
			}
		}
		for (Trayecto t : listaTrayecto) {
			if (t.getDuracion() == mayorDuracion) {
				return t;
			}
		}
		return null;
	}
	
	public List <Trayecto> buscarTrayectoPorCantidadConsumo(double cantidad) {
		List <Trayecto> aux = new ArrayList<Trayecto>();
		for (Trayecto t : listaTrayecto) {
			if (t.getLitros() < cantidad) {
				aux = listaTrayecto;
			}
		}
		return aux;
	}
	
	public Trayecto buscarTrayectoMenorConsumo() {
		double menorConsumo=10000;
		for (Trayecto t : listaTrayecto) {
			if (menorConsumo > t.getLitros()) {
				menorConsumo = t.getLitros();
			}
		}
		for (Trayecto t : listaTrayecto) {
			if (t.getLitros() == menorConsumo) {
				return t;
			}
		}
		return null;
	}
	
	public Trayecto findByID(int buscId) {
		for (Trayecto t : listaTrayecto) {
			if (t.getId() == buscId) {
				return t;
			}
		}
		return null;
	}
	public void editarModo(Trayecto t, String nuevoModo) {
		if (t != null) {
			t.setModoConduccion(nuevoModo);
		}
		
	}
	
	public double calcularMediaLitros() {
		double sum=0;
		for (Trayecto t : listaTrayecto) {
			sum += t.getLitros();
		}
		return sum/listaTrayecto.size();
	}
	
	public void imprimirTodo() {
		int i=1;
		//PETA NOSE PORQUE
		/*Iterator <Trayecto> it = listaTrayecto.iterator();
		while(it.hasNext()) {
			System.out.println();
			System.out.println("TRAYECTO: "+i);
			System.out.println("Id:"+it.next().getId());
			System.out.printf("Duración: %.2f \n", it.next().getDuracion());
			System.out.printf("Litros Consumidos: %.2f \n", it.next().getLitros());
			System.out.println("Modo de Conducción: "+it.next().getModoConduccion());
			System.out.println();
			i++;
		}*/
		
		for (Trayecto t : listaTrayecto) {
			System.out.println();
			System.out.println("TRAYECTO: "+i);
			System.out.println("Id:"+t.getId());
			System.out.printf("Duración: %.2f \n", t.getDuracion());
			System.out.printf("Litros Consumidos: %.2f \n", t.getLitros());
			System.out.println("Modo de Conducción: "+t.getModoConduccion());
			System.out.println();
			i++;
		}
	}
	
}
