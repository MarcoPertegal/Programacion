package ejemplocrud;

import java.util.Arrays;

public class CrudProducto {
	
	private Producto [] lista;

	public CrudProducto(Producto[] lista) {
		super();
		this.lista = lista;
	}
	//esto es chapucero pero se hace para probar cosas y que al crear un objeto vacia no pete, para no tener que crear el array en el main
	//NO SE USA solo para probar, para que si en el main quiero mostrar el array antes de rellenarlo no pete
	public CrudProducto() {
		int cuatro=4;
		lista = new Producto [cuatro];
	}
	
	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}
	
	@Override
	public String toString() {
		return "CrudProducto [lista=" + Arrays.toString(lista) + "]";
	}
	
	//aqui se guarda un objeto producto
	public void add(Producto p, int posicion) {
		lista[posicion]=p;
	}
	//TODOS los buscar no son iguales, se puede devolver un mensaje, 
	//Para editar algunpos atributos de un producto lo primero es buscar cual queremos editar
	//Para buscar(tenemos que dar un criterio de busqueda, en este caso los atributos de la clase producto)
	//en el nombre del metodo debe aparecer algo relacionado con el criterio de buscqueda en este caso el id
	//el bucle while acaba cuando se termina el arrray o encuentra lo que busca
	//este devuelve un objeto
	public Producto findById(String codigo) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if(deLista.getCodigo().equalsIgnoreCase(codigo))//aqui esta comparando si es el codigo del array concide con el que le han pasao
				encontrado = true;
			else
				i++;
		}
		if (encontrado) //no se pone igual a true porque ya es un booleano
			return lista[i];
		else
			return null;//se usa para que no devuelva nada, no lo ha encontrado
	

	}
	//segunda version para buscar 
	//este devuelve un int
	public int findByIdV2(String codigo) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo))
				encontrado = true;
			else
				i++;
		}
		if(encontrado)
			return i;
		else
			return -1; // devuelve -1 porque no es una posicion del array, no podria devolver un null pq null se usa para objetos, -1 se usa para tipos basicos
	}
	//tercera vesión de buscar, comparar productos de la lista
	public int findProduct(Producto p) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < lista.length && !encontrado) {
			Producto deLista = lista [i];
			if (p.compareTo(deLista) == 0) //metodo compare to debe ir en la clase producto
				encontrado = true;
			else
				i++;
		}
		if(encontrado)
			return i;
		else
			return -1;
	}
	
	
	//editar, findByIDV2 es el metodo de arriva, lo que hace es: si el metodo de arriva encuentra el el codigo que busca devolverá un valor mayor o igual ha cero
	//por lo que entrará dentro del if y editará el precio de este, sino, pues no hará nada
	//no haria falta llamar en el main al metodo buscar porque ya lo llama este metodo en el int
	public void editPrecio(String codigo, double precioN) {
		int index = findByIdV2(codigo);
		if (index >= 0) { //aqui se pone esto porque lo que devuelve el metodo tamb puede ser un -1 es una comprobacion por si el findByIdV2 no encuentra nada
			lista[index].setPrecioUnitario(precioN);
		}
	}
	
	//Metodo que "Borra" un producto de la lista, se usa null porque el metodo findbyId devuelve un null si no lo encuentra
	//no se borra nada solo se cambia su estado activo de true a false
	public void delete(Producto p) {
		//int index = findProduct(p);
		if(p != null)
			p.setActivo(false);
	}
	
	//imprimir todos los productos 
	public void imprimirTodosLosProductos() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println((i+1)+". "+lista[i]);
		}
	}
	
	//aqui se imprime solos los productos que estén activos
	//el null está para que no imprima el array entero si todavia no se ha completado
	public void imprimirSoloActivos () {
		for (int i = 0; i < lista.length && lista[i] != null; i++) {
			if (lista[i].isActivo()) {
				System.out.println((i+1)+". "+lista[i]);
			}
		}
	}
}
