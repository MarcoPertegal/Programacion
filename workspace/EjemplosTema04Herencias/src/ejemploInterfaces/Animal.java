package ejemploInterfaces;

public class Animal implements IDepredador, IPresa{//Para conectar las dos clases interfaz y animal se usa la palabra implements
	
	private String color;
	private int numPatas;
	
	public Animal(String color, int numPatas) {
		super();
		this.color = color;
		this.numPatas = numPatas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	@Override
	public String toString() {
		return "Animal [color=" + color + ", numPatas=" + numPatas + "]";
	}
	
	//estos metodos se pueden autogenerar pinchando en el error que aparece en public clas amnimal cuando no estan creados 
	//si impremento la interfaz idepredador tengo tambien que implementar todos sus metodos aunque nnbo los use
	public void localizar() {
		System.out.println("Localizar");
	}
	public void cazar() {
		System.out.println("Me comido algo "+color);
	}

	public void huir() {
		System.out.println("Huida");
	}
	
	
	
}
