package ejemploInterfaces;

public interface IDepredador {
	/*las interfaces son clases abstractas*/
	/*aqui NO HACE FALTA PONER ABSTRACT PORQUE POR DEFECTO LOS METODOS SON ABSTRACTOS*/
	/* no es obigatorio pasarle un objeto de la clase que implementa dentro del metodo(Animal)*/
	public void localizar ();
	public void cazar ();
}
