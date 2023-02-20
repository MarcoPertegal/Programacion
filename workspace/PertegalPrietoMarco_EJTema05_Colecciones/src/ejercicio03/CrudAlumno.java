package ejercicio03;

import java.util.List;

public class CrudAlumno {
	
	private List <Alumno> listaAlumnos;

	public CrudAlumno(List<Alumno> listaAlumnos) {
		super();
		this.listaAlumnos = listaAlumnos;
	}

	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	@Override
	public String toString() {
		return "CrudAlumno [listaAlumnos=" + listaAlumnos + "]";
	}
	
	public void agregar(Alumno a) {
		listaAlumnos.add(a);
	}
	
	public void eliminar(Alumno a) {
		listaAlumnos.remove(a);
	}
	public void modificar(Alumno a) {
		//nidea
	}
	
	public Alumno findById(int buscId) {
		int i = 0;
		boolean verdadero = false;
		
		while (!verdadero && i<listaAlumnos.size()) {
			if (buscId == listaAlumnos.get(i).getId())
				verdadero = true;
			else 
				i++;
		}
		if (verdadero) 
			return listaAlumnos.get(i);
		else
			return null;
	}
	
	public void mostrarUnAlumno(Alumno a) {//esto estaría bien??
		a.mostrarUnAlumno();
	}
}
