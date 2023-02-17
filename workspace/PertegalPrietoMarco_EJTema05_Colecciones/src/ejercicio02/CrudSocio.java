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
		listaSocios.remove(s);
	}
	
	public Socio findByNum(int numSocio) {
		int i = 0;
		boolean verdadero = false;
		while (!verdadero && i < listaSocios.size()) {
			if (numSocio == listaSocios.get(i).getNumSocio()) {//ahora no colocamos el .get en vez de [i] porque es una arrray list y es como si fuera una interfaz fuera de la clase
				verdadero = true;
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
		s.setEdad(nuevaEdad);
	}
	
	
}
