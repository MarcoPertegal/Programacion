package ejercicio08Ej06Tema04;

import java.util.HashMap;
import java.util.Map;

import utilidades.Leer;


public class Principal {

	public static void main(String[] args) {
		
		int tope=0, buscNumCuenta=0, nuevaEdad=0, numCuenta, edad, extra;
		double saldo;
		String nombre, dni;

		Map <Cuenta, Integer> listaCuentas = new HashMap <Cuenta, Integer>();
		
		Oficina o = new Oficina(listaCuentas);
		listaCuentas.put(new CuentaJoven(1000, 1, new Cliente("Felipe", 25, "a1"), 1), 0);
		listaCuentas.put(new CuentaEmpresa(2000, 2, new Cliente("Felipe", 25, "a1"), 5), 1);
		
		
		
		System.out.println("BIENVENIDO");
		System.out.println("///////////////////");
		do {
			System.out.println();
			System.out.println("¿Qué desea hacer?");
			System.out.println("-------------------------------------------");
			System.out.println("1.Mostrar todo.");
			System.out.println("2.Ingresar saldo en una de sus cuentas.");
			System.out.println("3.Extraer saldo de una de sus cuentas.");
			System.out.println("4.Calcular saldo total de todas las cuentas.");
			System.out.println("5.Consultar el sueldo de una cuenta.");
			System.out.println("6.Gasto total de Cuenta de Empresa.");
			System.out.println("7.Beneficio total Cuenta Joven.");
			System.out.println("8.Editar la edad de una cuenta.");
			System.out.println("9.Borrar una cuenta");
			System.out.println("10.Añadir una cuenta Joven");
			System.out.println("11.Buscar una cuenta.");
			System.out.println("12.Ordenar por ");
			System.out.println("----------------------------------------------");
			System.out.println();
			tope=Leer.datoInt();
			switch (tope) {
			case 0:
				System.out.println("Saliendo.");
				break;
			case 1:
				o.imprimirTodo();
				break;
			case 2:
				
				break;
			
			case 8:
				System.out.println("Indique el numCuenta:");
				buscNumCuenta=Leer.datoInt();
				System.out.println("Nueva edad:");
				nuevaEdad=Leer.datoInt();
				o.editarEdadDeUnaCuenta(o.findByid(buscNumCuenta), nuevaEdad);
				break;
			case 9:
				System.out.println("Indique el numCuenta:");
				buscNumCuenta=Leer.datoInt();
				o.remove(o.findByid(buscNumCuenta));
				break;
			case 10:
				System.out.println("Indique saldo:");
				saldo=Leer.datoDouble();
				System.out.println("Indique numCuenta:");
				numCuenta=Leer.datoInt();
				System.out.println("Indique nombre:");
				nombre=Leer.dato();
				System.out.println("edad:");
				edad=Leer.datoInt();
				System.out.println("dni:");
				dni=Leer.dato();
				System.out.println("extra:");
				extra=Leer.datoInt();
				o.add(new CuentaJoven(saldo, numCuenta, new Cliente(nombre, edad, dni), extra));
				break;
			case 11:
				System.out.println("Indique el numCuenta:");
				buscNumCuenta=Leer.datoInt();
				System.out.println(o.findByid(buscNumCuenta));
				break;
			default:
				System.out.println("Número desconocido.");
				break;
			}
		} while (tope != 0);
		
	}

}
