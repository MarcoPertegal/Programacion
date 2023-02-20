package ejercicio03;

import java.util.Iterator;

public class GestionAlumnos {
	
	private CrudAlumno crudA;

	public GestionAlumnos(CrudAlumno crudA) {
		super();
		this.crudA = crudA;
	}

	public CrudAlumno getCrudA() {
		return crudA;
	}

	public void setCrudA(CrudAlumno crudA) {
		this.crudA = crudA;
	}

	@Override
	public String toString() {
		return "GestionAlumnos [crudA=" + crudA + "]";
	}
	
	public double calcularNotaMedia() {
		Iterator <Alumno> it = crudA.getListaAlumnos().iterator();
		double media = 0, sum=0;
		
		while (it.hasNext()) {
			sum += it.next().getNota();
		}
		
	}
	
}
