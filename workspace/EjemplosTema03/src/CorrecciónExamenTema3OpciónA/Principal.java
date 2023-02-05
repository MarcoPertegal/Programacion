package CorrecciónExamenTema3OpciónA;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// Foto del enunciado en el móvil
		
		Pasteleria tarta;
		String sabor;
		int tam=0, eleccionExtra=0, opcion=0, cero=0, hasta=0, desde=0, cambiarDia=0, cambiarTartas=0;
		double precioLitro=0.0, volumen=0.0, porcenGan=0.0, costeExtra=0;
		boolean extraNormal;
		int [] cantTartas;
		
		System.out.println("-----------------------------------------");
		System.out.println("BIENVENIDO A LA PASTELERÍA");
		System.out.println("---------------------------------------");
		System.out.println("Vamos a crear una tarta:");
		System.out.println("Indica cuantod días vamos a contabilizar:");
		tam=Leer.datoInt();
		cantTartas=new int [tam];
		System.out.println("Indica el sabor:");
		sabor=Leer.dato();
		System.out.println("Indica el precio del litro:");
		precioLitro=Leer.datoDouble();
		System.out.println("Indica el volumen que se usa para la tarta:");
		volumen=Leer.datoDouble();
		System.out.println("Pulse 1 para agregar adornos extra o pulse 0 para no");
		eleccionExtra=Leer.datoInt();
		if (eleccionExtra== cero) {
			extraNormal=false;
		} else {
			extraNormal=true;
		}
		tarta= new Pasteleria(sabor, precioLitro, volumen, extraNormal, cantTartas);
		
		do {
			System.out.println("Que operación desea realizar");
			System.out.println("-----------------------------");
			System.out.println("1.");
			System.out.println("2.");
			
			opcion=Leer.datoInt();
			switch (opcion) {
			case 0:
				System.out.println("saliendo");
				break;
			case 2:
				tarta.calcularPrecioFab();//no haria falta usar aqui el metodo imprimir porque para imprimir tan pocos datos no merece la pena
				tarta.imprimirPrecioFab();
				break;
			case 3:
				System.out.println("Indica el porcentaje de ganancia que desea:");
				porcenGan=Leer.datoDouble();
				tarta.calcularPrecioVent(porcenGan);
				tarta.imprimirPrecioVent(porcenGan);
				break;
			case 4:
				if (tarta.isExtraNormal()) {//se pide el atributo mejor antes que usar la variable guardada en el main
					System.out.println("Indica cuánto es el coste extra");
					costeExtra=Leer.datoDouble();
				}
			case 5:
				tarta.calcularTotalTartas();
				tarta.imprimirTotalTartas();
				break;
			case 6:
				System.out.println("Indica qué día quieres modificar las tartas:");
				cambiarDia=Leer.datoInt();
				System.out.println("¿Cuántas tartas se hicieron ese dia entonces?");
				cambiarTartas=Leer.datoInt();
			default:
				System.out.println("NÚMERO DESCONOCIDO");
				break;
			}
		} while (opcion != 0);
		System.out.println("Gracias por usar el programa.");
		
	}

}
