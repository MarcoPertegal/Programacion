package ejercicio_04;

public class Copiado 
{
	//atributos
	private String texto;
	private int veces;
	
	//constructor
	public Copiado (String texto, int veces) {
		this.texto=texto;
		this.veces=veces;
	}
	
	//getset
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getVeces() {
		return veces;
	}

	public void setVeces(int veces) {
		this.veces = veces;
	}
	
	//metodo mio
	public void imprimir () {
		
		for (int i = 0; i <veces ; i++) {
			System.out.println(texto);
		}
	}
}
