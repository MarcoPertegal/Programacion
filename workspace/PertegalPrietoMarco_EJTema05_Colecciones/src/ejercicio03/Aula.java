package ejercicio03;

import java.util.Iterator;
import java.util.Set;

public class Aula {
	
	private String nombre;
	private Set <Alumno> listaAlumnos;
	
	public Aula(String nombre, Set<Alumno> listaAlumnos) {
		super();
		this.nombre = nombre;
		this.listaAlumnos = listaAlumnos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(Set<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	@Override
	public String toString() {
		return "Aula [nombre=" + nombre + ", listaAlumnos=" + listaAlumnos + "]";
	}

	public void motrarTodos() {
		for(Alumno a:listaAlumnos) {
			System.out.println(a);
		}
	}
	
	public void mostrarTodosV2() {
		Iterator <Alumno> it=listaAlumnos.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public double mediaDeSuspensos() {
		double sum=0;
		for (Alumno a : listaAlumnos) {
			sum += a.getNota();
		}
		if (listaAlumnos.isEmpty()) { //estoe s asi por que la lista está vacia se divide entre cero, mejor que .listasize lista.isempty y NO syso esta feo, devolver 0
			return 0;
		}else {
			return sum/listaAlumnos.size();
		}
	}
	
	public int contarSuspensos() {//este metodo es otra forma de recorrer la lista sacando los datos se puede con for ech o con iterator 
		int susp=0;
		Iterator <Alumno> it = listaAlumnos.iterator();
		
		while(it.hasNext()) {
			if (it.next().getNota()>5) {
				susp++;
			}
		}
		return susp;
	}
		
	

	
	
}
