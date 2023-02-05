package primerEjemplo;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int numHijos;
		//datos metidos a cascaporra
		Trabajador t = new Trabajador ("Ángel", "Jefe departamento");
		Consultor c = new Consultor ("Rafa", "Junior", 20, 100);
		Empleado e = new Empleado ("Luismi", "Master and Comander", 2000, 15);
		
		//Mostrar el calcular paga de cada uno, un consultor no puede llamar al calcular paga de trabajador
		//aqi no aprovechamos la sobre escritura de metodos, vamos a suponer que al trabajador clase madre de las otras dos se le calcula el sueldo de una manera
		System.out.println("diga número de hijos");
		numHijos=Leer.datoInt();
		//le damos a todos el mismo numero por el ejemplo simplemente
		
		System.out.println(t.calcularPaga(numHijos));
		System.out.println(c.calcularPaga(numHijos));
		System.out.println(e.calcularPaga(numHijos));

	}

}
