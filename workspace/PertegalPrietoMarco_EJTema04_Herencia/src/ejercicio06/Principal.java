package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int tope = 0, busc=0, cantAcciones=0;
		double cantIngreso, cantRetiro;
		Cuenta [] lista = new Cuenta [4];
		
		Oficina o  = new Oficina(lista);
		
		lista[0] = new CuentaCorriente(1000, 001,new Cliente("Felipe", 26, "234D"), 7, 0);
		lista[1] = new CuentaJoven(2000, 002,new Cliente("Felipe", 26, "234D"), 1);
		lista[2] = new CuentaEmpresa(3000, 003,new Cliente("Felipe", 26, "234D"), 1);
		lista[3] = new CuentaJoven(1000, 004,new Cliente("Felipe", 26, "234D"), 1);
		System.out.println("---------------------");
		System.out.println("BIENVENIDO A LA CAIXA");
		System.out.println("---------------------");
		System.out.println("");
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
			System.out.println("");
			tope=Leer.datoInt();
			switch (tope) {
				case 0:
					System.out.println("Saliendo");
				break;
				case 1:
					System.out.println(o);
				break;
				case 2:
					System.out.println("Indique la cantidad que quiere ingresar:");
					cantIngreso=Leer.datoDouble();
					System.out.println("Indique el número de la cuenta a la que quiere ingresar:");
					busc=Leer.datoInt();
					o.ingresarDineroEnUnaCuenta(o.findById(busc), cantIngreso);
				break;
				case 3:
					System.out.println("Indique la cantidad que quiere extraer:");
					cantRetiro=Leer.datoDouble();
					System.out.println("Indique el número de la cuenta a la que quiere retirar:");
					busc=Leer.datoInt();
					o.retirarDineroDeUnaCuenta(o.findById(busc), cantRetiro);
				break;
				case 4:
					System.out.println(o.calcularSaldoTotal());
				break;
				case 5:
					System.out.println("Indique el número de la cuenta:");
					busc=Leer.datoInt();
					System.out.println(o.calcularSaldoDeUnaCuenta(o.findById(busc))); 
				break;
				case 6:
					System.out.println(o.getGastosCuentaEmpresa());
				break;
				case 7:
					System.out.println(o.getBeneficioCuentaJoven());
				break;
				case 8:
					System.out.println("Elija el número de indentificación de la cuenta con la que desea comprar acciones:");
					busc=Leer.datoInt();
					System.out.println("Cuantas acciones dese comprar:");
					cantAcciones=Leer.datoInt();
					o.comprarAcciones(o.findById(busc), cantAcciones);
				break;
				default:
					System.out.println("OPCIÓN DESCONOCIDA");
					break;
			}
			
		} while (tope != 0);
		System.out.println("Gracias por usar el programa");
		
		
	}

}
