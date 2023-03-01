package ejercicio04;

import java.util.Iterator;
import java.util.Map;

public class Agenda {
	//Se le da primero la clave y despues un integer, contacto es la key y Contacto es un objeto, esto quieredecir que no siempre la key tiene que ser un integer,
	//esto significa qeu en esta agenda no podremos tener contactos repetidos, el integer si se puede repetir porque no es la key,
	//tiene sentido usar como clave(key) el contacto porque nosotros cuando buscamos un contacto en la agenda del movil lo buscamos por nombre 
	
	//CUIDAO este ejercicio no esta des todo bien planteado lo suyo es que el num de telefono fuse un atribuyo de contacto y esto tuviese un id
	private Map <Contacto, Integer> lista;

	public Agenda(Map<Contacto, Integer> lista) {
		super();
		this.lista = lista;
	}

	public Map<Contacto, Integer> getLista() {
		return lista;
	}

	public void setLista(Map<Contacto, Integer> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Agenda [lista=" + lista + "]";
	}
	
	//vamos a hacer los metodos crud en la agenda
	//se le pasan las dos cosas que tiene el hash map, importante se le pasa el integer
	//en vez de add se le pone put
	public void agregarContacto(Contacto c, Integer num) {
		lista.put(c, num);
	}
	
	//para recorrer un hashMap se puede hacer recorriendo la clave, lo que guarda o las dos cosas alavez lo suyo es la clave
	public void mostrarTodo() {
		for (Contacto c: lista.keySet()) {//aqui se saca la clave
			System.out.println();
			System.out.println("id:"+c.getId());
			System.out.println("Nombre:"+c.getNombre());
			System.out.println("Correo:"+c.getCorreo());
		}
	}
	
	//Comparar este metodo buscar con los de otros ejercicios para ver si cambia algo
	public Contacto buscarId(int id) {//pasamos un int pq estamos buscando el id del contacto no la clave(key) del map
		Contacto c;
		Iterator <Contacto> it= lista.keySet().iterator();//esta creando una lista tipo set porque iterator no puede implementarse a los hashMap, esta
															//sacando un set de contactos
		while (it.hasNext()) {
			c = it.next();//next devuelve un contacto, Va a preguntar en el examen un buscar con iterator 
			if (c.getId() == id) {
				return c;
			}
		}
		return null;
	}
	
	//para eliminar un contacto hace falta la clave del hash map por lo que dependiendo del tipo que sea la clave nos hará falta un buscar que devuelva una 
	//cosa u otra
	public void eliminarContacto (Contacto c) {
		lista.remove(c);
	}
	
	public void editarNombre(Contacto c, String nuevoNombre) {
		c.setNombre(nuevoNombre);
		lista.replace(c, 1);//metodo para cambiar la pareja del hashmap
	}
	
}
