package segundoejemplo;

public class Circulo {
	
	//elm atributo radio guarda el valor del radio del main le pasa un valor y llama al constreuctor 
	//atributo y variable no es lo mismo porque 
	//los constructores se llaman todos igual que la clase, la diferencia e que cambia el numero de parametros
		double radio;
		
		//constructores nos per
		public Circulo(double radio) {// es oblicatiorio poner el mismo nombre (radio) aqui que dentro del constructor y el nomnbre del atributo lo suyo es que sea igua tambien.
			this.radio=radio;// esto significa que la variable radio va a ser guardada en el atributo radio
		}
}
