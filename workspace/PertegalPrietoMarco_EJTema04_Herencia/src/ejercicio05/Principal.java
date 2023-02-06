package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int buscNumEmpleado, objVentas;
		Empleado[]lista = new Empleado[3];
		
		Oficina o = new Oficina(lista);
		
		lista[0] = new Gerente("Antonio", "Pérez", 1000, 20, 25);
		lista[1] = new Vendedor("Francisco", "Romero", 1200, 21, 16, 20);
		lista[2] = new Empleado("Pablo", "García", 1500, 22);
		
		System.out.println("Diga el objetivo de ventas del vendedor:");
		objVentas=Leer.datoInt();
		o.imprimirFelicitaciones(objVentas);
		System.out.printf("El gasto total es: %.2f \n",o.calcularGasto()); 
		
		System.out.println("Indique el número del empleado del que quiere saber el sueldo:");
		buscNumEmpleado=Leer.datoInt();
		System.out.printf("El sueldo del empleado es: %.2f \n",o.calcularSueldoDeUnEmpleado(o.findById(buscNumEmpleado)));
		System.out.println(o);
		
		
	}

}
