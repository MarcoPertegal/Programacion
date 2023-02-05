package ejercicio06;

import java.util.Arrays;

public class Sala {
	
	private String codSala;
	private int numLocalidades;
	private  Entrada [] lista;

	public Sala(String codSala, int numLocalidades, Entrada[] lista) {
		super();
		this.codSala = codSala;
		this.numLocalidades = numLocalidades;
		this.lista = lista;
	}
	

	public String getCodSala() {
		return codSala;
	}


	public void setCodSala(String codSala) {
		this.codSala = codSala;
	}


	public int getNumLocalidades() {
		return numLocalidades;
	}


	public void setNumLocalidades(int numLocalidades) {
		this.numLocalidades = numLocalidades;
	}


	public Entrada[] getLista() {
		return lista;
	}


	public void setLista(Entrada[] lista) {
		this.lista = lista;
	}
	

	@Override
	public String toString() {
		return "Sala [codSala=" + codSala + ", numLocalidades=" + numLocalidades + ", lista=" + Arrays.toString(lista)
				+ "]";
	}


	//metodos mios
	public void imprimirTodo() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println((i+1)+" ." +lista[i]);
		}
	}
	
	public void add(Entrada e, int posicion) {
		lista [posicion] = e;
	}
	
	public Entrada findById(String cod) {
		int i=0;
		boolean encontrado = false;
		
		while (i < lista.length && !encontrado) {
			Entrada deLista = lista[i];
			if (deLista.getCod().equalsIgnoreCase(cod)) 
				encontrado = true;
			else i++;
		}
		if (encontrado) 
			return lista[i];
		else 
			return null;
	}

	public void comprarEntrada(Entrada e) {
		if (e.isLibre()) {
			System.out.println("Compra realizada");
			e.setLibre(false);
		}else {
			System.out.println("ERROR: Localidad ocupada");
		}
	}
	
	public void editPrecio(Entrada e, double precio) {
		e.setPrecio(precio);
	}
	////////////////////////////////////////////////////////
	//METODO SEBA estos dos hacen lo mismo
	/*
	public Entrada [] buscarLocalidadesOcupdas() {
		Entrada [] ocupadas = new Entrada[lista.length];
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].isLibre()) {
				ocupadas[i] = lista[i];
			}
		}
		return ocupadas;
	}
	*/
	public Entrada [] buscarLocalidadesOcupadasV2() {// este metodo sirbe para calcular la ganancia total
		Entrada [] ocupadas = new Entrada[lista.length];
		int i = 0;
		
		while (i < lista.length) {
			Entrada deLista = lista[i];
			if (deLista.isLibre()) {
				ocupadas[i] = lista[i];
			}
			i++;
		}
		return ocupadas;
	//////////////////////////////////////////////
	}
	
	public void imprimirOcupadas() {
		for (int i = 0; i < lista.length && lista[i]!= null; i++) { //Aqui uso el null pq no le estoy pasando el array que tiene algunos null el de 						
			if (lista[i].isLibre()) {								//localidades ocupadas, por lo que no hace que se pare, para cuando acaba el array o no se ha completado entero
				System.out.println(lista[i]);	
			}	
												
		}
	}
	
	public double calcularGananciaTotal(Entrada [] ocupadas) {//probar a en vez de cargar las entradas ocupadas en un array a comprobar en el propio metodo 
		double gananciaTotal=0.0;								//si la entrada que se le pasatiene como atributo verdadero o falso y me ahorro el array
		
		for (int i = 0; i < ocupadas.length && ocupadas[i] != null; i++) {
			gananciaTotal+=ocupadas[i].getPrecio();
		}
		return gananciaTotal;
	}
	
	public void editCodigo(Entrada e, String nuevoCod) {
		e.setCod(nuevoCod);
	}
	
	
	public double calcularGananciaTotalV2() {//probar a en vez de cargar las entradas ocupadas en un array a comprobar en el propio metodo 
		double gananciaTotal=0.0;								//si la entrada que se le pasatiene como atributo verdadero o falso y me ahorro el array
		
			for (int i = 0; i < lista.length && lista[i] != null; i++) { //IMPORTANTE con este metodo no me hace falta el array de entradas ocupadas
				if (lista[i].isLibre()) {								//para calcular la ganancia total simplemente metiendo un if se soluciona
					gananciaTotal+=lista[i].getPrecio();
				}
			}	
		return gananciaTotal;
	}	
	
}
