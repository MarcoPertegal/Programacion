package ejercicio02;

import java.util.List;

public class CrudSocio {
	
	private List <Socio> listaSocios;

	public CrudSocio(List<Socio> listaSocios) {
		super();
		this.listaSocios = listaSocios;
	}

	public List<Socio> getListaSocios() {
		return listaSocios;
	}

	public void setListaSocios(List<Socio> listaSocios) {
		this.listaSocios = listaSocios;
	}

	@Override
	public String toString() {
		return "CrudSocio [listaSocios=" + listaSocios + "]";
	}
	
	public void agregar(Socio s) {
		listaSocios.add(s);
	}
	
	public void eliminar(Socio s) {
		if (s !=null) 
			listaSocios.remove(s);
		else if (listaSocios.isEmpty())
			imprimirListaIsEmpty();
		else
			imprimirMensajeDeError();
	}
	
	public Socio findByNum(int numSocio) {
		int i = 0;
		boolean verdadero = false;
		while (!verdadero && i < listaSocios.size()) {
			if (numSocio == listaSocios.get(i).getNumSocio()) {//ahora no colocamos el .get en vez de [i] porque es una arrray list 
				verdadero = true;								//y es como si fuera una interfaz fuera de la clase
			}else {
				i++;
			}
		}
		if (verdadero) 
			return listaSocios.get(i);
		else 
			return null;
	}
	
	public void editar(Socio s, int nuevaEdad) {//editar la edad
		if (s !=null) 
			s.setEdad(nuevaEdad);
		else
			imprimirMensajeDeError();
	}
	
	public void imprimirMensajeDeError() {
		System.out.println("No se ha encontrado el número de socio.");
	}
	public void imprimirListaIsEmpty() {
		System.out.println("La lista está vacía.");
	}
	public void mostrarUnSocio(Socio s) {
		s.mostrarUnSocio(s);
	}
	
	
	
}
