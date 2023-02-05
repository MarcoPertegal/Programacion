package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		double ganancia;
		
		Ordenador o = new Ordenador(128.4, 64, 830.99, "Asus");
		Sobremesa s = new Sobremesa (223, 64, 900, "HP", 30);
		Portatil p = new Portatil (168, 64, 719.99, "Mac", 25);
		
		System.out.println("Diga el porcentaje de ganancia del vendedor:");
		ganancia=Leer.datoDouble();
		
		System.out.println(o.calcularPvp(ganancia));
		System.out.println(s.calcularPvp(ganancia));
		System.out.println(p.calcularPvp(ganancia));

	}

}
