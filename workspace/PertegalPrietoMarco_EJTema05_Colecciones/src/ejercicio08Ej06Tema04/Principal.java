package ejercicio08Ej06Tema04;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import utilidades.Leer;


public class Principal {

	public static void main(String[] args) {
		
		int tope=0, buscNumCuenta=0, nuevaEdad=0, numCuenta, edad, extra;
		double saldo, ingreso, retiro;
		String nombre, dni;

		Map <Cuenta, Integer> listaCuenta = new HashMap <Cuenta, Integer>();
		Map <Cuenta, Integer> listaCuentaTree;
		
		Oficina o = new Oficina(listaCuenta);
		listaCuenta.put(new CuentaJoven(1000, 1, new Cliente("aFelipe", 25, "a1"), 1), 0);
		listaCuenta.put(new CuentaEmpresa(2000, 2, new Cliente("cFelipe", 25, "a1"), 5), 1);
		listaCuenta.put(new CuentaEmpresa(500, 3, new Cliente("bFelipe", 25, "a1"), 5), 2);
		
		
		
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
			System.out.println("5.Editar la edad de una cuenta.");
			System.out.println("6.Borrar una cuenta");
			System.out.println("7.Añadir una cuenta Joven");
			System.out.println("8.Buscar una cuenta.");
			System.out.println("9.Ordenar por saldo.");
			System.out.println("10.Ordenar por nombre.");
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
					System.out.println("id:");
					buscNumCuenta=Leer.datoInt();
					System.out.println("Cantidad ingreso:");
					ingreso=Leer.datoDouble();
					o.ingresarDineroEnUnaCuenta(o.findByid(buscNumCuenta), ingreso);
					break;
				case 3:
					System.out.println("id");
					buscNumCuenta=Leer.datoInt();
					System.out.println("Cantidad retiro:");
					retiro=Leer.datoDouble();
					o.retirarDineroDeUnaCuenta(o.findByid(buscNumCuenta), retiro);
					break;
				case 4:
					System.out.println(o.calcularSaldoTotal()); 
					System.out.println(o.calcularSaldoTotalV2());
					 break;
				case 5:
					System.out.println("Indique el numCuenta:");
					buscNumCuenta=Leer.datoInt();
					System.out.println("Nueva edad:");
					nuevaEdad=Leer.datoInt();
					o.editarEdadDeUnaCuenta(o.findByid(buscNumCuenta), nuevaEdad);
					break;
				case 6:
					System.out.println("Indique el numCuenta:");
					buscNumCuenta=Leer.datoInt();
					o.remove(o.findByid(buscNumCuenta));
					break;
				case 7:
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
				case 8:
					System.out.println("Indique el numCuenta:");
					buscNumCuenta=Leer.datoInt();
					System.out.println(o.findByid(buscNumCuenta));
					break;
				case 9:
					listaCuentaTree = new TreeMap <Cuenta, Integer>();
					listaCuentaTree.putAll(listaCuenta);
					for (Cuenta c : listaCuentaTree.keySet()) {
						System.out.println(c);
					}
					break;
				case 10:
					listaCuentaTree = new TreeMap <Cuenta, Integer>(new CompararPorNombre());
					listaCuentaTree.putAll(listaCuenta);
					for (Cuenta c : listaCuentaTree.keySet()) {
						System.out.println(c);
					}
					break;
				default:
					System.out.println("Número desconocido.");
					break;
			}
		} while (tope != 0);
		
	}

}
