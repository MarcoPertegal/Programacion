package ejercicio09Ej06Tema04ConArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int tope, buscNumCuenta;
		String nuevoNombre;
		double cantIngreso, cantRetiro;
		
		List <Cuenta> listaCuentas = new ArrayList <Cuenta>();
		Oficina o = new Oficina(listaCuentas);
		
		listaCuentas.add(new CuentaJoven(1000, 01, new Cliente("cFelipe", 24, "a1"), 1));
		listaCuentas.add(new CuentaEmpresa(500,02, new Cliente("bFelipe", 30, "a2"), 5));
		listaCuentas.add(new CuentaJoven(3000, 03, new Cliente("aFelipe", 45, "a3"), 1));
		
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
					o.mostrarTodo();
					break;
				case 2:
					System.out.println("NumCuenta:");
					buscNumCuenta=Leer.datoInt();
					System.out.println("Cantidad ingreso:");
					cantIngreso=Leer.datoDouble();
					o.ingresarSaldoEnUnaCuenta(o.findByNumCuenta(buscNumCuenta),cantIngreso);
					break;
				case 3:
					System.out.println("NumCuenta:");
					buscNumCuenta=Leer.datoInt();
					System.out.println("Cantidad ingreso:");
					cantRetiro=Leer.datoDouble();
					o.retirarSaldoDeUnaCuenta(o.findByNumCuenta(buscNumCuenta), cantRetiro);
					break;
				case 4:
					System.out.println(o.calcularTotal()); 
					break;
				case 5:
					System.out.println("NumCuenta:");
					buscNumCuenta=Leer.datoInt();
					System.out.println("Nuevo nombre:");
					nuevoNombre=Leer.dato();
					o.editarNombre(o.findByNumCuenta(buscNumCuenta), nuevoNombre);
					break;
				case 6:
					System.out.println("NumCuenta:");
					buscNumCuenta=Leer.datoInt();
					o.eliminar(o.findByNumCuenta(buscNumCuenta));
					break;
				case 7:
					
					break;
				case 8:
					System.out.println("NumCuenta:");
					buscNumCuenta=Leer.datoInt();
					System.out.println(o.findByNumCuentaV2(buscNumCuenta)); 
					break;
				case 9:
					Collections.sort(listaCuentas);
					for (Cuenta c : listaCuentas) {
						System.out.println(c);
					}
					break;
				case 10:
					Collections.sort(listaCuentas, new OrdenarPorNombre());
					for (Cuenta c : listaCuentas) {
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
