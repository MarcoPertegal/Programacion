package ejercicio06_Otrave1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int tope=0, buscNumCuenta, numAcciones;
		double tope1, cantIngreso;
		Cuenta [] lista = new Cuenta[4];
		Oficina o = new Oficina(lista);
		
		lista[0] = new CuentaJoven(2000, 001, new Cliente("Felipe", "1234a", 25), 1);
		lista[1] = new CuentaEmpresa(1000, 002, new Cliente("Felipe", "1234a", 25), 1);
		lista[2] = new CuentaCorriente(3000, 003, new Cliente("Felipe", "1234a", 25), 7, 0);
		
		//para llamar al metodo de la interfaz debe ir en un case
		do {
		System.out.println("¿Que desea hacer con sus cuentas?");
		System.out.println(".................................");
		System.out.println("0.Salir");
		System.out.println("1.Mostrar todo.");
		System.out.println("2.Ingresar saldo en una de sus cuentas.");
		System.out.println("3.Extraer saldo de una de sus cuentas.");
		System.out.println("4.Calcular saldo total de todas las cuentas.");
		System.out.println("5.Consultar el sueldo de una cuenta.");
		System.out.println("6.Gasto total de Cuenta de Empresa.");
		System.out.println("7.Beneficio total Cuenta Joven.");
		System.out.println("8.Comprar acciones de Andaluza de programación(100$).");
		System.out.println("9.Imprimir mensaje si tu cuenta de empresa tiene mas de X cantidad.");
		System.out.println("10.Buscar cuentas que tengan más de X cantidad");
		tope=Leer.datoInt();
		switch (tope) {
			case 0:
				System.out.println("Saliendo");
				break;
			case 1:
				System.out.println(o);
				break;
			case 2:
				System.out.println("Seleccione el Id de la cuenta");
				buscNumCuenta=Leer.datoInt();
				System.out.println("Diga el ingreso");
				cantIngreso=Leer.datoDouble();
				o.ingresarDineroEnUnaCuenta(o.findById(buscNumCuenta), cantIngreso);
				break;
			case 3:
				System.out.println("Selecciona el ID de la cuenta:");
				buscNumCuenta=Leer.datoInt();
				System.out.println("Diga el retiro");
				o.retirarDineroDeUnaCuenta(o.findById(buscNumCuenta), buscNumCuenta);
				break;
			case 4:
				System.out.printf("%.2f",o.calcularSaldoTotal());
				break;
			case 5:
				System.out.println("Selecciona el ID de la cuenta que quiere ");
				buscNumCuenta=Leer.datoInt();
				o.consultarSaldoDeUnaCuenta(o.findById(buscNumCuenta));
				break;
			case 6:
				System.out.println(o.getComisionesCuentaEmpresa());
				break;
			case 7:
				System.out.println(o.getGananciasCuentaJoven());
				break;
			case 8:
				System.out.println("Diga la cuenta con la que desea realizar la compra:");
				buscNumCuenta=Leer.datoInt();
				System.out.println("Número de acciones que desea comprar:");
				numAcciones=Leer.datoInt();
				o.comprarAcciones(o.findById(buscNumCuenta), numAcciones);
				break;
			case 9:
				
				
				break;
			case 10:
				System.out.println("Diga la cantidad:");
				tope1=Leer.datoDouble();
				for (int i = 0; i < lista.length && lista[i]!=null; i++) {
					System.out.println(o.buscSaldoMayorQue(tope1)[i]);
				}
				break;
			default:
				System.out.println("OPCIÓN DESCONOCIDA");
				break;
			}
		} while (tope != 0);

	}

}
