package segundoejemplo;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio=0.0;
		Circulo c1;
		Circulo c2;
		//c2.radio=3.0; //esto es para cambiar el valor de radio
		//en el main las variables son variables que usamos de forma independiente para usar objetos, que cambies el valor de la variable y pongas 
		//radio=1 no va hacer que radio cambie su valor tendriamos que usar el constructor
		//
		//Forma 2:leyendo por teclado
		System.out.println("Diga usted el radio");
		radio=Leer.datoDouble();
		c2=new Circulo (radio);
		
		System.out.println(radio);
	}

}
