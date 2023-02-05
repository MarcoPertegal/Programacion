package ejemploPasoDeParametros;

public class Principal 
{

	public static void main(String[] args) 
	{
		//diferencia de cuando se le pasan datos primitivos o se le psan objetos(por referencia)
		//un metodo dentro de la clase principal 
		
		int x =1;
		int y = 2;
		
		System.out.println("Los valores de X e Y antes de la modificación:");
		System.out.println("x = "+x+";y="+y);
		
		modifyPrimitiveTypes(x,y);
		
		System.out.println("Valores de x e y despues de la modificación;");
		System.out.println("x="+x+";y="+y);
	}
	//una especie de compartir el valor que tenemos dentro del metodo, si seteamos el valor, afectara al resto de clases, se declaran igual pero se añade static
	//se usan cuando1 cuando un atributo se comparte, 2 Ej, atributo PI o leer. , que no secesita instanciarse dentro de uestra clase, evitaremos de momento
	//escribir metodos estaticos en la principal, cuando no tienen atributos. se podria hacer con aleatoorios para no tener que instanciarlos cada vez que los usaemos
	//
	private static void modifyPrimitiveTypes(int x, int y) {
		x=5;
		y=10;
	}

}
