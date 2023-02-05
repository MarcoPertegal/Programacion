package menu;
import java.util.Random;

import utilidades.Leer;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] obj={"Camiseta del betis de Nono", "Silla de Dani\t\t", "Tablet de Pilar\t\t", "Desodorante de Miguel\t", "Teclado de Tomás\t", "Capibara de Rafa\t", 
				"Camisa de cuadros de Ángel", "Gallipato de Roberto\t", "Cascos de Lolo\t\t", "Carnet de Miguel\t", "Botella de Rafa\t\t"};
		double [] precio;
		double valTot=0, leerDouble;
		int tope=0, tope0=0, tope1=0,idUnidad=0, leer1, leer2, repetir;
		int [] unidades;
		//variables del buscador de articulos
		int leerCalles, respuesta=0;
		//variables para el gráfico 2D
		String [][] ejemplo=new String[8][27];
		int [] numeros= new int[11];
		int copiaNumero, desde=1, hasta=11, sumaCorrecto=1;
		int introduccionNumeros=0;
		Random num= new Random(System.nanoTime());
		unidades= new int [obj.length];
		precio= new double [obj.length];
		//Variables de la probabilidad de robo
		int provRobo=9;
		String [] provArriba= {"10%","20%","30%","40%","50%","60%","70%","80%","90%","100%"};
		int [] provAbajo= new int [10];
		//Crea el precio y el número de artículos aleatoriamente
		int hastaint=100, desde1=0, hastadouble=200;
		
		for (int i=0; i<obj.length; i++) {
			unidades[i]= num.nextInt(hastaint-desde1+1)+desde1;	
			precio[i]= num.nextDouble(hastadouble-desde1+1)+desde1;
		}
		//Empieza el programa
		System.out.printf("\t\t\t\t\t████████╗███████╗██████╗  ██████╗ ██████╗  ██████╗     ███████╗   ██╗     \r\n"
				+ "\t\t\t\t\t╚══██╔══╝██╔════╝██╔══██╗██╔═══██╗██╔══██╗██╔═══██╗    ██╔════╝   ██║     \r\n"
				+ "\t\t\t\t\t   ██║   █████╗  ██████╔╝██║   ██║██████╔╝██║   ██║    ███████╗   ██║     \r\n"
				+ "\t\t\t\t\t   ██║   ██╔══╝  ██╔══██╗██║   ██║██╔══██╗██║   ██║    ╚════██║   ██║     \r\n"
				+ "\t\t\t\t\t   ██║   ███████╗██║  ██║╚██████╔╝██████╔╝╚██████╔╝    ███████║██╗███████╗\r\n"
				+ "\t\t\t\t\t   ╚═╝   ╚══════╝╚═╝  ╚═╝ ╚═════╝ ╚═════╝  ╚═════╝     ╚══════╝╚═╝╚══════╝");


		//Generador de números aleatorios para las calles
		for (int i=0; i<numeros.length; i++) {
			copiaNumero=num.nextInt(hasta-desde+1)+desde;
			for (int j=0; j<numeros.length; j++) {
				if (numeros[j]!=copiaNumero)  {
					sumaCorrecto++;
				}
			}
			if (sumaCorrecto==11) {
				numeros[i]=copiaNumero;
			} else {
				i--;
			}
			sumaCorrecto=0;
		}
		
		for (int i=0; i<numeros.length; i++) {
			numeros[i]--;
		}
		//Aquí termina el generador de números aleatorios
		do {
			valTot=0;
			for (int i=0; i<precio.length; i++) {
				valTot+=precio[i]*unidades[i];
			}
			System.out.println("");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("█ Bievenido, ¿Qué operación que desea realizar?:");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("                                               |");
			System.out.println("0.Pulse 0 para salir del programa.             |");
			System.out.println("1.Pulse 1 para gestiornar el almacén.          |");
			System.out.println("2.Pulse 2 para ver el valor actual.            |");
			System.out.println("3.Pulse 3 para ver la probabilidad de robo.    |");
			System.out.println("-----------------------------------------------|");

			tope=Leer.datoInt();
			switch (tope) {
			case 0:
				System.out.println("Saliendo del programa.");
				break;
			case 1:
				do {
				//Enseña la gráfica
				introduccionNumeros=0;
				for (int i=0; i<ejemplo.length; i++) {
					for (int j=0; j<ejemplo[i].length; j++) {
						ejemplo[i][j]="█";
					}
				}
				
				for (int i=1; i<ejemplo.length; i++) {
					for (int j=6; j<ejemplo[i].length; j+=7) {
						ejemplo[i][j]="|";
					}
				}
				
				for (int i=1; i<ejemplo.length; i++) {
					for (int j=9; j<ejemplo[i].length; j+=7) {
						ejemplo[i][j]="|";
					}
				}
				
				for (int i=1; i<ejemplo.length; i++) {
					for (int j=7; j<ejemplo[i].length; j+=7) {
						ejemplo[i][j]="▒";
						ejemplo[i][j+1]="▒";
					}
				}
				
				ejemplo[1][7]="A";
				ejemplo[1][14]="B";
				ejemplo[1][21]="C";
				
				System.out.println("");
				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
				System.out.println("           _                       __       ");
				System.out.println("     /\\   | |                     /_/       ");
				System.out.println("    /  \\  | |_ __ ___   __ _  ___ ___ _ __  ");
				System.out.println("   / /\\ \\ | | '_ ` _ \\ / _` |/ __/ _ \\ '_ \\ ");
				System.out.println("  / ____ \\| | | | | | | (_| | (_|  __/ | | |");
				System.out.println(" /_/    \\_\\_|_| |_| |_|\\__,_|\\___\\___|_| |_|");
				System.out.println("");
				System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
				for (int i=0; i<ejemplo.length; i++) {
					System.out.print("\t");
					for (int j=0; j<ejemplo[i].length; j++) {
						if (i>2 && (j==7 || j==14 || j==21)) {
							if (introduccionNumeros<numeros.length) {
								System.out.print(numeros[introduccionNumeros]);
								if (numeros[introduccionNumeros]<10) {
									j++;
								} else {
									j+=2;
								}
								introduccionNumeros++;
							} else {
								System.out.print("║");
								j++;
							}
						}
						System.out.print(ejemplo[i][j]);
					}
					System.out.println("");
				}	
				//Termina de enseñar la gráfica
				System.out.println("*Gráfico del almacén visto desde arriba, las letras son las estanterías y los números los id del producto");
				System.out.println("");
				System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||");
				System.out.println("█ ¿Qué desea gestionar?:");
				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");
				System.out.println("                                                    |");
				System.out.println("0.Pulse 0 para volver al menú principal.            |");
				System.out.println("1.Pulse 1 para mostrar el contenido del almacén.    |");
				System.out.println("2.Pulse 2 para agregar un nuevo objeto al almacén.  |");
				System.out.println("3.Pulse 3 para sacar un producto del almacén.       |");
				System.out.println("4.Pulse 4 para cambiar el precio de un objeto.      |");
				System.out.println("5.Pulse 5 para ubicar un objeto.                    |");
				System.out.println("-----------------------------------------------------");
				tope0=Leer.datoInt();
				
				switch (tope0) {
				case 1:
					idUnidad=0;
					System.out.println("");
					System.out.println("*************************************");
					System.out.println("Mostrando el contenido del almacén:  |");
					System.out.println("*************************************");
					System.out.println("");
					System.out.println("Id\tOBJETOS\t\t\t\tUNIDADES\tPRECIOS");
					for (int i = 0; i < obj.length; i++) {
						System.out.printf("%d\t%s\t%d\t\t%.2f $\n",idUnidad,obj[i],unidades[i],precio[i]);
						idUnidad++;
					}
				break;
				case 2:
					do {
					System.out.println("");
					System.out.println("Indique el id del producto que quiere añadir:");
					leer1=Leer.datoInt();
					System.out.println("Indique la cantidad:");
					leer2=Leer.datoInt();
					if (100>=unidades[leer1]+leer2) {
						unidades[leer1]+=leer2;
						repetir=0;
					} else {
						System.out.println("No se puede almacenar tanto");
						repetir=1;
					}
				} while (repetir==1);
					break;
				case 3:
					do {
						System.out.println("");
						System.out.println("Indique el id del producto que quiere retirar:");
						leer1=Leer.datoInt();
						System.out.println("Indique la cantidad:");
						leer2=Leer.datoInt();
						if (0<=unidades[leer1]+leer2) {
							unidades[leer1]-=leer2;
							repetir=0;
						} else {
							System.out.println("No hay esa cantidad almacenada");
							repetir=1;
						}
					} while (repetir==1);
					break;
				case 4:
					System.out.println("");
					System.out.println("Indique el id del producto que quiere cambiar el precio:");
					leer1=Leer.datoInt();
					System.out.println("Indique el nuevo precio:");
					leerDouble=Leer.datoDouble();
					precio[leer1]=leerDouble;
					System.out.println("Cantidad cambiada con éxito");
					break;
				case 0:
					System.out.println("");
					System.out.println("Volviendo al menú principal");
					System.out.println("");
					break;
				case 5:
					do {
						System.out.println("");
						System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||");
						System.out.println("█ ¿Qué acción desea realizar?");
						System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||");
						System.out.println("                                                      |");
						System.out.println("0.Pulse 0 para volver.                                |");
						System.out.println("1.Pulse 1 para ver la ubicación del artitculo.        |");
						System.out.println("2.Pulse 2 para mostrar el contenido de la estantería. |");
						System.out.println("-------------------------------------------------------");
						tope1=Leer.datoInt();
						switch (tope1) {
							case 0:
								System.out.println("");
								System.out.println("Volviendo al menú.");
								System.out.println("");
								break;
							case 1:
								System.out.println("Indique el id del artículo:");
								leerCalles=Leer.datoInt();
								
								for (int i=0; i<numeros.length; i++) {
									if (leerCalles==numeros[i]) {
										respuesta=i;
									}
								}
								System.out.println("Mostrando la ubicación del artículo.");
								for (int i=0; i<numeros.length; i+=3) {
									if (respuesta==i) {
										System.out.println("El artículo se encuentra en la estantería A");
									}
								}
								for (int i=1; i<numeros.length; i+=3) {
									if (respuesta==i) {
										System.out.println("El artículo se encuentra en la estantería B");
									}
								}
								for (int i=2; i<numeros.length; i+=3) {
									if (respuesta==i) {
										System.out.println("El artículo se encuentra en la estantería C");
									}
								}
	
								break;
							case 2:
								System.out.println("");
								System.out.println("Indique la estantería con números: 1=A/2=B/3=C");
								leerCalles=Leer.datoInt();
								System.out.println("Mostrando contenido de la estantería.");
								switch (leerCalles) {
								case 1:
									for (int i=0; i<numeros.length; i+=3) {
										System.out.printf("%d\t%s\t%d\t\t%.2f $\n",numeros[i],obj[numeros[i]],unidades[numeros[i]],precio[numeros[i]]);
									}
									break;
								case 2:
									for (int i=1; i<numeros.length; i+=3) {
										System.out.printf("%d\t%s\t%d\t\t%.2f $\n",numeros[i],obj[numeros[i]],unidades[numeros[i]],precio[numeros[i]]);
									}
									break;
								case 3:
									for (int i=2; i<numeros.length; i+=3) {
										System.out.printf("%d\t%s\t%d\t\t%.2f $\n",numeros[i],obj[numeros[i]],unidades[numeros[i]],precio[numeros[i]]);
									}
									break;
								}
								break;
							default:
								System.out.println("");
								System.out.println("OPCIÓN DESCONOCIDA");
								System.out.println("");
								break;
						}
					}while (tope1!=0);
					break;
				
				default:
					System.out.println("");
					System.out.println("OPCIÓN DESCONOCIDA");
					System.out.println("");
					break;
			}
				} while (tope0!=0);
			break;
			case 2:
				System.out.println("");
				System.out.println("Valor actual.");
				System.out.printf("El valor total del almacén es de: %.2f euros.\n",valTot);
				break;
			case 3:
				if (valTot>=80000) {
					provRobo=9;
				} else {
					if (valTot>=75000) {
						provRobo=8;
					} else {
						if (valTot>=70000) {
							provRobo=7;
						} else {
							if (valTot>=65000) {
								provRobo=6;
							} else {
								if (valTot>=60000) {
									provRobo=5;
								} else {
									if (valTot>=55000) {
										provRobo=4;
									} else {
										if (valTot>=50000) {
											provRobo=3;
										} else {
											if (valTot>=45000) {
												provRobo=2;
											} else {
												if (valTot>=40000) {
													provRobo=1;
												} else {
													if (valTot>=35000) {
														provRobo=0;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				for (int i=0; i<provAbajo.length; i++) {
					if (provRobo==i) {
						provAbajo[i]=1;
					} else {
						provAbajo[i]=0;
					}
				}
				
				for (int i=0; i<provArriba.length; i++) {
					System.out.print(provArriba[i] + "\t");
				}
				System.out.println("");
				for (int i=0; i<provAbajo.length; i++) {
					if (provAbajo[i]==1) {
					System.out.print("*\t");
					} else {
						System.out.print("-\t");
					}
				}
				System.out.println("");
				break;
			default:
				System.out.println("");
				System.out.println("NÚMERO DESCONOCIDO");
				System.out.println("");
				break;
		}
	} while (tope != 0);
	System.out.println("Gracias por usar el programa.");
	}
}



