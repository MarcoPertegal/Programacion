package ejercicio;

import java.util.Arrays;
import java.util.Random;

public class Jugador {
	
	//atributos
	private String nombre;
	private double sueldoBase;
	private int edad;
	private int [] goles;
	
	
	//contructor
	public Jugador(String nombre, double sueldoBase, int edad, int[] goles) {

		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.edad = edad;
		this.goles = goles;
	}

	//gettersandsetters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getSueldoBase() {
		return sueldoBase;
	}


	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int[] getGoles() {
		return goles;
	}


	public void setGoles(int[] goles) {
		this.goles = goles;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", sueldoBase=" + sueldoBase + ", edad=" + edad + ", goles="
				+ Arrays.toString(goles) + "]";
	}
	
	//Metodos mios
	public int [] rellenarArray(int desde, int hasta) {
		Random num = new Random(System.nanoTime());
		
		for (int i = 0; i < goles.length; i++) {
			goles[i]= num.nextInt(hasta-desde+1)+desde;
		}
		return goles;
	}
	public void imprimirArray() {
		for (int i = 0; i < goles.length; i++) {
			System.out.println("PARTIDO: "+(1+i)+"= "+goles[i]+" Goles");
		}
	}
	public int calcularGoles() {
		int golesTot=0;
		
		for (int i = 0; i < goles.length; i++) {
			golesTot += goles[i];
		}
		return golesTot;
	}
	public double comprobarGoles(int cantGoles, int golesTot, double porcentSueldo) {//aqui se podria hacer en vez de pasando la variable 
		double sueldoTotalSuma=0.0, sueldoTotal=0.0;								//golestot desde el main usando el metodo como en el de las tartas
		int cien=100;
		
		if (cantGoles <= golesTot) {
			sueldoTotalSuma= (sueldoBase*porcentSueldo)/cien;
			sueldoTotal = sueldoTotalSuma+sueldoBase;
		}else {
			sueldoTotal=sueldoBase;
		}
		return sueldoTotal;
	}
	public int calcularPartidosMarcados() {
		int cont=0;
		
		for (int i = 0; i < goles.length; i++) {
			if (goles[i] > 0) {
				cont++;
			}
		}
		return cont;
	}
	public void imprimirMensaje(int topeEdad) {
		
		if (edad > topeEdad) {
			System.out.println("HORA DE RETIRARSE");
		}else {
			System.out.println("Tienes menos de 40 años, sigue jugando crack.");
		}
		
	}
	//REPASAR ESTO
	public void cambiaNumGoles(int cambiarGoles, int nuevosGoles) {
		goles[cambiarGoles -1]= nuevosGoles;
	}
	 

	
}
