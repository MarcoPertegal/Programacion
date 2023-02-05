package ejemploPolimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Figura f1= new Figura(); NO SE PUEDE porque es una clase abstracta

		
		Cuadrado cu1 = new Cuadrado("Primer cuadrado", "Rojo", 1);
		
		Circulo ci1 = new Circulo ("Primer Circulo", "Azul", 1);                                                               
		
		System.out.println(cu1);
		
		System.out.println(ci1);
		
		//POLIMORFISMO
		Figura f1 = new Cuadrado("Segundo cuadrado", "verde", 2.0);
		
		Figura f2 = new Circulo("Segundo circulo", "rojo", 2.0);
		
		System.out.println(f1);
		
		System.out.println(f2);
		
		System.out.println("Area segundo cuadrdo"+f1.calcularArea());
		
		System.out.println("Area segundo circulo"+f1.calcularArea());
		//con el poliformismo instanciamos un clase figura de tipo cuadrado para poder trabajadr con tipos genericos porque
		//es mejor trabajar co tipos generiscos 
		
		Figura lista[]= new Figura[4];
		//puedo meter dentro objetos que estan instanciado como (cuadrado, tringulo, etc) porque son tipo figura, eso es el polimorfismo
		//con figura new figura no se podria porque es abstracta
		//se le pasan listas de tipos genericos (figura) porque cuando el programa se usa no el metodo no sabe que tipo de objeto se le va a apasar
		OperacionesFiguras of= new OperacionesFiguras();
		
		for (int i = 0; i < lista.length; i++) {
			
			System.out.printf("El área del"+(i+1)+"es: %.2f\n",of.calcularElAreaDeUnaFigura(lista[i]));
		}
 		System.out.printf("La suma de todas las áreas es: %.2f", of.sumarAreas(lista));//aqui se le pasa el aray entero porque dentro hay un buvle for 
	}

}
